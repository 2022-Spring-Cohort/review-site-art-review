package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repos.HashtagRepository;
import org.wecancoeit.reviews.repos.PaintingRepository;
import org.wecancoeit.reviews.repos.ReviewRepository;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class PaintingController {
    private PaintingRepository paintingRepo;
    private ReviewRepository reviewRepo;
    private HashtagRepository hashtagRepo;

    public PaintingController(PaintingRepository paintingRepo, ReviewRepository reviewRepo, HashtagRepository hashtagRepo) {
        this.paintingRepo = paintingRepo;
        this.reviewRepo = reviewRepo;
        this.hashtagRepo =  hashtagRepo;
    }

    @GetMapping("/all-paintings")
    public String showAllPaintings(Model model) {
        model.addAttribute("paintings", paintingRepo.findAll());
        return "AllPaintingsTemplate";
    }

    @GetMapping("/paintings/{id}")
    public String showSinglePainting(Model model, @PathVariable Long id){
        model.addAttribute("painting", paintingRepo.findById(id).get());
        return "PaintingTemplate";
    }

    @PostMapping("/paintings/{id}")
    public String addReview(Model model, @PathVariable Long id, @RequestParam String name,
                            @RequestParam String comment, @RequestParam float rating) {
        Painting painting = paintingRepo.findById(id).get();
        Review review1 = new Review(name, comment, rating);
        review1.setPainting(painting);
        saveAverageRating(review1,painting);
        reviewRepo.save(review1);
        model.addAttribute("review", review1);
        return "redirect:/paintings/" + id;
    }

    @GetMapping("/all-hashtags")
    public String showAllHashtags(Model model) {
        List<Hashtag> hashtags = (List<Hashtag>) hashtagRepo.findAll();
        if(hashtags.size() > 0) {
            model.addAttribute("hashtags", hashtags);
            return "AllHashtagsTemplate";
        }
        return "redirect:/all-paintings";
    }

    @GetMapping("/hashtags/{id}")
    public String seeHashtag(Model model, @PathVariable Long id){
        Optional<Hashtag> optionalHash = hashtagRepo.findById(id);
        model.addAttribute("hashtag", optionalHash.get());
        return "HashtagTemplate";
    }

    @PostMapping("/paintings/hashtags/{id}")
   public String addHashtag(Model model, @PathVariable Long id, @RequestParam String hashtag){
        String tempHashtag = checkHashTag(hashtag);
        Optional<Hashtag> optionalHash = hashtagRepo.findByHashtag(tempHashtag);

        Painting painting = paintingRepo.findById(id).get();
        if(optionalHash.isPresent()){
            if(!optionalHash.get().getPaintings().contains(painting)) {
                optionalHash.get().setPainting(painting);
                hashtagRepo.save(optionalHash.get());
            }
        }
        else {
            Hashtag hash = new Hashtag(tempHashtag, painting);
            hashtagRepo.save(hash);
        }
        model.addAttribute("hashtag",tempHashtag);
        return "redirect:/paintings/" + id;
        }

    private void saveAverageRating(Review review, Painting painting){
        int addRatingCount;
        float avgRating;
        float overallRating = painting.getOverallRating();
        if (painting.getRatingCount() == 0) {
            overallRating = review.getRating();
            addRatingCount = 1;
            avgRating = review.getRating();
        }
        else {
            addRatingCount=painting.getRatingCount() + 1;
            overallRating += review.getRating();
            avgRating = overallRating / addRatingCount;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float rate = Float.valueOf(decimalFormat.format(avgRating));
        painting.setAverageRating(rate);
        painting.setRatingCount(addRatingCount);
        painting.setOverallRating(overallRating);
        paintingRepo.save(painting);
    }

    private String checkHashTag(String hashtag) {
        String tempHashtag = "";
        if (hashtag.contains("#")) {
            tempHashtag = hashtag;
        } else {
            tempHashtag = "#" + hashtag;
        }
        return tempHashtag;
    }


}
