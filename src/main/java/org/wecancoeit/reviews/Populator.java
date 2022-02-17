package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Artist;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.repos.ArtistRepository;
import org.wecancoeit.reviews.repos.PaintingRepository;

import java.awt.*;

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

        Artist artist2 = new Artist("Edouard Manet","/images/edouard_manet_photo.jpg","another painter");
        artistRepo.save(artist2);

        Artist artist3 = new Artist("Henri Matisse","/images/henri_matisse_photo.jpg","another painter");
        artistRepo.save(artist3);

        Artist artist4 = new Artist("Paul Cezanne","/images/paul-cezanne_photo.jpg","another painter");
        artistRepo.save(artist4);

        Artist artist5 = new Artist("Pierre August Renoir","/images/pierre_auguste_renoir_photo.jpg","another painter");
        artistRepo.save(artist5);

        // PAINTINGS FOR CLAUD MONET - ARTIST 1:
        // PAINTING #s 1 TO 5
        Painting painting1 = new Painting("Waterlily Pond: Green Harmony","/images/monet_water-liliy_pond_green_harmony_.jpg",artist1);
        paintingRepo.save(painting1);
        Painting painting2 = new Painting("Artist's Garden in Giverny","/images/monet_Garten_in_Giverny.jpg",artist1);
        paintingRepo.save(painting2);
        Painting painting3 = new Painting("Impression Sunrise", "/images/monet_impression_sunrise.jpg", artist1);
        paintingRepo.save(painting3);
        Painting painting4 = new Painting("Jardin a Sainte-Adresse", "/images/monet_jardin_a_sainte-adresse.jpg", artist1);
        paintingRepo.save(painting4);
        Painting painting5 = new Painting("Poppy Fields", "/images/monet_poppy_field.jpg", artist1);
        paintingRepo.save(painting5);

        // PAINTINGS FOR EDOUARD MANET - ARTIST 2:
        // PAINTING #s 6 TO 10
        Painting painting6 = new Painting("The Grand Canal of Venice (Blue Venice)", "/images/edouard_manet_grand_canal_of_venice.png", artist2);
        paintingRepo.save(painting6);
        Painting painting7 = new Painting("Le Chemin de Fer", "/images/edouard_manet_le_chemin_de_fer.jpg", artist2);
        paintingRepo.save(painting7);
        Painting painting8 = new Painting("The Rue Mosnier with Flags", "/images/edouard_manet_the_rue_mosnier_with_flags.jpg", artist2);
        paintingRepo.save(painting8);
        Painting painting9 = new Painting("A Bar at the Folies-Bergère", "/images/edouard_manet_a_bar_at_the_folies-bergere.jpg", artist2);
        paintingRepo.save(painting9);
        Painting painting10 = new Painting("House in Rueil", "/images/edouard_manet_house_in_rueil.jpg", artist2);
        paintingRepo.save(painting10);

        // PAINTINGS FOR HENRI MATISSE - ARTIST 3:
        // PAINTING #s 11 TO 15
        Painting painting11 = new Painting("Vase of Sunflowers", "/images/henri_matisse_vase_of_sunflowers.jpg ", artist3);
        paintingRepo.save(painting11);
        Painting painting12 = new Painting("Mur Rose", "/images/henri_matisse_mur_rose.jpg", artist3);
        paintingRepo.save(painting12);
        Painting painting13 = new Painting("The Study of Moreau", "/images/matisse_the_study_of_moreau.jpg", artist3);
        paintingRepo.save(painting13);
        Painting painting14 = new Painting("Fruit and Coffeepot ", "/images/matisse_fruit_and_coffeepot.jpg", artist3);
        paintingRepo.save(painting14);
        Painting painting15 = new Painting("Study of a Nude", "/images/matisse_study_of_a_nude.jpg", artist3);
        paintingRepo.save(painting15);
//
//
//        // PAINTINGS FOR PAUL CEZANNE - ARTIST 4:
//        // PAINTING #s 16 TO 20
        Painting painting16 = new Painting("Pryamid of Skulls", "/images/paul_cezanne_pyramid_of_skulls.jpg", artist4);
        paintingRepo.save(painting16);
        Painting painting17 = new Painting("Mont Saint-Victoire with Large Pine", "/images/paul_cezanne_mont_sainte-victoire.jpg", artist4);
        paintingRepo.save(painting17);
        Painting painting18 = new Painting("L'Estaque aux toits rouges", "/images/cezanne_lestaque_aux_toits_rouges.jpg", artist4);
        paintingRepo.save(painting18);
        Painting painting19 = new Painting("La_Route_tournante_en_sous-bois ", "/images/cezanne_la_route_tournante_en_sous-bois.jpg", artist4);
        paintingRepo.save(painting19);
        Painting painting20 = new Painting("The Bay of Marseilles, Seen from L'Estaque", "/images/cezanne_the_bay_of_marseilles.jpg", artist4);
        paintingRepo.save(painting20);
//
//
//
//
//        // PAINTINGS FOR PIERRE AUGUST RENOIR - ARTIST 5:
//        // PAINTING #s 21 TO 25
        Painting painting21 = new Painting("Le Moulin de la Galette", "/images/renoir_le_moulin_de_la_galette.jpg", artist5);
        paintingRepo.save(painting21);
        Painting painting22 = new Painting("Luncheon of the Boating Party", "/images/renoir_luncheon_of_the_boating_party.jpg", artist5);
        paintingRepo.save(painting22);
        Painting painting23 = new Painting("Piazza San Marco, Venice", "/images/renoir_piazza_san_marco_venice.jpg", artist5);
        paintingRepo.save(painting23);
        Painting painting24 = new Painting("The Grands Boulevards", "/images/renoir_grands_boulevards.jpg", artist5);
        paintingRepo.save(painting24);
        Painting painting25 = new Painting("Two Sisters (On the Terrace) ", "/images/renoir_two_sisters.jpg", artist5);
        paintingRepo.save(painting25);

    }


}
