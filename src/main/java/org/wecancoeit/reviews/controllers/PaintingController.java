package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repos.PaintingRepository;
import org.wecancoeit.reviews.repos.ReviewRepository;

//may not use it
@Controller
public class PaintingController {
    private PaintingRepository paintingRepo;
    private ReviewRepository reviewRepo;

    public PaintingController(PaintingRepository paintingRepo, ReviewRepository reviewRepo) {
        this.paintingRepo = paintingRepo;
        this.reviewRepo = reviewRepo;
    }


    @GetMapping("/paintings/{id}")
    public String showSinglePainting(Model model, @PathVariable Long id){
        model.addAttribute("painting", paintingRepo.findById(id).get());
        return "PaintingTemplate";
    }

    @PostMapping("/paintings/{id}")
    public String addComment(@PathVariable long id, @ModelAttribute Review review, Model model){
        Painting painting = paintingRepo.findById(id).get();
        review.setPainting(painting);
        reviewRepo.save(review);
        model.addAttribute("review", review);
        return "redirect:/paintings/" + id;
    }

}
