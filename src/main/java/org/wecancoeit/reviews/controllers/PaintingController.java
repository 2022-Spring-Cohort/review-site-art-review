package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repos.PaintingRepository;
import org.wecancoeit.reviews.repos.ReviewRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

//may not use it
@Controller
public class PaintingController {
    private PaintingRepository paintingRepo;
    private ReviewRepository reviewRepo;

    public PaintingController(PaintingRepository paintingRepo, ReviewRepository reviewRepo) {
        this.paintingRepo = paintingRepo;
        this.reviewRepo = reviewRepo;
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
    public String addReview(Model model, @PathVariable Long id, @ModelAttribute Review review) {
        Painting painting = paintingRepo.findById(id).get();
        review.setPainting(painting);
        saveAverageRating(review,painting);
        reviewRepo.save(review);
        model.addAttribute("review", review);
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
        painting.setAverageRating(avgRating);
        painting.setRatingCount(addRatingCount);
        painting.setOverallRating(overallRating);
        paintingRepo.save(painting);
    }



}
