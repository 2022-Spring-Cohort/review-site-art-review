package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.repos.PaintingRepository;
//may not use it
@Controller
public class PaintingController {
    private PaintingRepository paintingRepo;

    public PaintingController(PaintingRepository paintingRepo) {
        this.paintingRepo = paintingRepo;
    }

    @GetMapping("/artists/painting/{id}")
    public String showSinglePainting(Model model, @PathVariable Long id){
        model.addAttribute("painting", paintingRepo.findById(id).get());
        return "PaintingTemplate";
    }

    @PostMapping("/artists/painting/{id}")
    public String addComment(@PathVariable long id, @RequestParam String comment){
        Painting painting = paintingRepo.findById(id).get();
        painting.addComment(comment);
        paintingRepo.save(painting);
        return "redirect:/artists/painting/" + id;
    }

}
