package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.wecancoeit.reviews.repos.PaintingRepository;
//may not use it
@Controller
public class PaintingController {
    private PaintingRepository paintingRepo;

    public PaintingController(PaintingRepository paintingRepo) {
        this.paintingRepo = paintingRepo;
    }
}
