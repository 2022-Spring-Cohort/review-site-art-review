package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Artist;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.repos.ArtistRepository;
import org.wecancoeit.reviews.repos.PaintingRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    private ArtistRepository artistRepo;

    @Autowired
    private PaintingRepository paintingRepo;


    @Override
    public void run(String... args) throws Exception {
        Artist artist1 = new Artist("Claud Monet","/images/monet.jpg","a painter");
        artistRepo.save(artist1);
        Artist artist2 = new Artist("Picaso","/images/monet.jpg","another painter");
        artistRepo.save(artist2);

        Painting painting1 = new Painting("Water lily","/images/the_water-liliy_pond__national_gallery__london_.jpg",artist1);
        paintingRepo.save(painting1);
    }


}
