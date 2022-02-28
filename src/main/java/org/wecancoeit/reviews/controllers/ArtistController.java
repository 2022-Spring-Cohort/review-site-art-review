package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repos.ArtistRepository;

@Controller
public class ArtistController {
    private ArtistRepository artistRepo;

    public ArtistController(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;
    }

    @RequestMapping("/")
    public String showAllArtists(Model model){
        model.addAttribute("artists", artistRepo.findAll());
        return "AllArtistsTemplate";
    }

    @RequestMapping("/artists/{id}")
    public String showSingleArtist(Model model, @PathVariable Long id){
        model.addAttribute("artist",artistRepo.findById(id).get());
        return"ArtistTemplate";
    }




}
