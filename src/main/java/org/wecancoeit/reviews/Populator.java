package org.wecancoeit.reviews;

import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Artist;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.repos.ArtistRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;
import org.wecancoeit.reviews.repos.PaintingRepository;

import java.awt.*;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    private ArtistRepository artistRepo;

    @Autowired
    private PaintingRepository paintingRepo;
    @Autowired
    private HashtagRepository hashtagRepo;


    @Override
    public void run(String... args) throws Exception {
        Artist artist1 = new Artist("Claud Monet","/images/monet.jpg","1840-1926");
        artistRepo.save(artist1);

        Artist artist2 = new Artist("Edouard Manet","/images/edouard_manet_photo.jpg","1832-1883");
        artistRepo.save(artist2);

        Artist artist3 = new Artist("Henri Matisse","/images/henri_matisse_photo.jpg","1869-1954");
        artistRepo.save(artist3);

        Artist artist4 = new Artist("Paul Cezanne","/images/paul-cezanne_photo.jpg","1839-1906");
        artistRepo.save(artist4);

        Artist artist5 = new Artist("Pierre August Renoir","/images/renoir_photo.jpg","1841-1919");
        artistRepo.save(artist5);

        // PAINTINGS FOR CLAUD MONET - ARTIST 1:
        // PAINTING #s 1 TO 5
        Painting painting1 = new Painting("Waterlily Pond: Green Harmony","/images/monet_water-liliy_pond_green_harmony_.jpg",
                "In 1883 Monet moved to Giverny where he lived until his death. There, on the grounds of his property, " +
                        "he created a water garden 'for the purpose of cultivating aquatic plants', " +
                        "over which he built an arched bridge in the Japanese style." +
                        "In 1899, once the garden had matured, the painter undertook 17 views of the motif under differing " +
                        "light conditions. Surrounded by luxuriant foliage, the bridge is seen here from the pond itself, " +
                        "among an artful arrangement of reeds and willow leaves.",artist1);
        paintingRepo.save(painting1);
        Painting painting2 = new Painting("Artist's Garden in Giverny","/images/monet_Garten_in_Giverny.jpg",
                "The Artist's Garden at Giverny is an oil on canvas painting by Claude Monet done in 1900 now " +
                        "the Musée d'Orsay, Paris." +
                        "It is one of many works by the artist of his garden at Giverny over the last thirty years of his life. " +
                        "The painting shows rows of irises in various shades of purple and pink set diagonally across " +
                        "the picture plane. The flowers are under trees that in allowing dappled light through change " +
                        "the tone of their colours. Beyond the trees is a glimpse of Monet's house",artist1);
        paintingRepo.save(painting2);
        Painting painting3 = new Painting("Impression Sunrise", "/images/monet_impression_sunrise.jpg",
                "Impression, Sunrise first shown at what would become known as the \"Exhibition of the Impressionists\" " +
                        "in Paris in April, 1874. The painting is credited with inspiring the name of the Impressionist movement." +
                        "Impression, Sunrise depicts the port of Le Havre, Monet's hometown. It is now displayed at the " +
                        "Musée Marmottan Monet in Paris.", artist1);
        paintingRepo.save(painting3);
        Painting painting4 = new Painting("Jardin a Sainte-Adresse", "/images/monet_jardin_a_sainte-adresse.jpg",
                "The Garden at Sainte-Adresse is a painting by the French impressionist painter Claude Monet. " +
                        "The painting was acquired by the Metropolitan Museum of Art after an auction sale at Christie's " +
                        "in December 1967, under the French title La terrasse à Sainte-Adresse. The painting was exhibited " +
                        "at the 4th Impressionist exhibition, Paris, April 10–May 11, 1879, as no. 157 under the title " +
                        "Jardin à Sainte-Adresse.", artist1);
        paintingRepo.save(painting4);
        Painting painting5 = new Painting("Poppy Fields", "/images/monet_poppy_field.jpg",
                "Monet showed Poppy Field to the public at the first Impressionist exhibition held in the photographer " +
                        "Nadar's disused studio in 1874. Now one of the world's most famous paintings, it conjures up the " +
                        "vibrant atmosphere of a stroll through the fields on a summer's day.", artist1);
        paintingRepo.save(painting5);

        // PAINTINGS FOR EDOUARD MANET - ARTIST 2:
        // PAINTING #s 6 TO 10
        Painting painting6 = new Painting("The Grand Canal of Venice (Blue Venice)", "/images/edouard_manet_grand_canal_of_venice.png",
                "Manet visited the Grand Canal Venice in September 1875 with his friend and fellow painter from " +
                        "outside the Impressionist circle James Tissot, who had settled in London after the Franco-Prussian " +
                        "war of 1870-71. Although the watery splendour of Venice has inspired many great artists, Manet " +
                        "found it hard to settle, but in spite of this he managed to paint one of his most dashingly " +
                        "Impressionist art works.", artist2);
        paintingRepo.save(painting6);
        Painting painting7 = new Painting("Le Chemin de Fer", "/images/edouard_manet_le_chemin_de_fer.jpg",
                "The Railway, widely known as Gare Saint-Lazare, is an 1873 painting by Édouard Manet. " +
                        "It is the last painting by Manet of his favourite model, the fellow painter Victorine Meurent, " +
                        "who was also the model for his earlier works Olympia and the Luncheon on the Grass. " +
                        "It was exhibited at the Paris Salon in 1874, and donated to the National Gallery of Art in " +
                        "Washington, D.C. in 1956. ", artist2);
        paintingRepo.save(painting7);
        Painting painting8 = new Painting("The Rue Mosnier with Flags", "/images/edouard_manet_the_rue_mosnier_with_flags.jpg",
                "The Rue Mosnier with Flags is an 1878 oil on canvas painting by Édouard Manet, showing the " +
                        "eponymous Parisian street, decorated with French flags for the first national holiday on " +
                        "30 June 1878, the Fête de la Paix (Celebration of Peace). The Fête de la Paix was held during " +
                        "that year's Exposition Universelle, which together marked France's recovery after the " +
                        "Franco-Prussian War and the Paris Commune. The holiday was moved to 14 July in 1880 to become Bastille Day.", artist2);
        paintingRepo.save(painting8);
        Painting painting9 = new Painting("A Bar at the Folies-Bergère", "/images/edouard_manet_a_bar_at_the_folies-bergere.jpg",
                "A Bar at the Folies-Bergère is considered to be Manet's last major work. " +
                        "It was painted in 1882 and exhibited at the Paris Salon of that year. " +
                        "It depicts a scene in the Folies Bergère nightclub in Paris. " +
                        "The painting originally belonged to the composer Emmanuel Chabrier, a close friend of Manet, " +
                        "and hung over his piano. It is now in the Courtauld Gallery in London. ",artist2);
        paintingRepo.save(painting9);
        Painting painting10 = new Painting("House in Rueil", "/images/edouard_manet_house_in_rueil.jpg",
                "The House at Rueil (La maison du Rueil) is the title of two oil-on-canvas paintings by " +
                        "Édouard Manet completed in 1882. The paintings depict a view of the house where Manet and his " +
                        "family stayed for a few months before his death. The two versions are almost identical, " +
                        "but one is in landscape format, and the other is portrait format",artist2);
        paintingRepo.save(painting10);

        // PAINTINGS FOR HENRI MATISSE - ARTIST 3:
        // PAINTING #s 11 TO 15
        Painting painting11 = new Painting("Vase of Sunflowers", "/images/henri_matisse_vase_of_sunflowers.jpg ",
                "On the basis of style, scholars have allocated this still life to a group of works created in " +
                        "Corsica in 1898-1899. The trip to Corsica, the influence of the blinding light of the southern " +
                        "sun and the rich southern landscape, contributed to Matisse's rejection of the Impressionist " +
                        "atmosphere of changing, flickering light and air in his paintings. Almost Cezanne-like, " +
                        "Matisse made the air heavier, intensifying light and form. The sunflower motif - the flowers " +
                        "still continuing to radiate the sun's energy - may well not have been an accidental choice. " +
                        "Like the energetic impasto brushstrokes, it leads us to recall the work of van Gogh and to " +
                        "consider the latter's influence on the development of the young artist.",artist3);
        paintingRepo.save(painting11);
        Painting painting12 = new Painting("Mur Rose", "/images/henri_matisse_mur_rose.jpg",
                "Having hung in museums in Paris since 1949, latterly in the Musée National d'Art Moderne at " +
                        "the Pompidou Centre; in November 2008 the painting was given by the French Culture Ministry to " +
                        "Magen David Adom UK, at a ceremony in Paris. In February 2010 the painting was acquired from " +
                        "the heirs, the Magen David Adom UK, for the Jewish Museum Frankfurt, Germany, with the financial " +
                        "help of various German foundations and private donors.",artist3);
        paintingRepo.save(painting12);
        Painting painting13 = new Painting("The Study of Moreau", "/images/matisse_the_study_of_moreau.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sagittis arcu sed massa laoreet, " +
                        "ut auctor risus facilisis. Suspendisse id posuere lacus. Nam tincidunt imperdiet urna, non " +
                        "tempor arcu pellentesque vestibulum. Etiam vitae malesuada orci, hendrerit placerat eros. " +
                        "Integer vel dapibus leo. Morbi dignissim lorem quis tellus tincidunt, sit amet blandit felis consectetur. " +
                        "Ut sit amet iaculis augue. Maecenas vel sollicitudin est. Phasellus lacus lacus, congue a " +
                        "aliquam hendrerit, luctus vitae eros. Nam eget venenatis turpis. Etiam eu blandit odio. " +
                        "Nulla sodales luctus nisi quis placerat. Quisque eu lacinia enim. Nunc a est eu tellus venenatis tempus. " +
                        "Duis vel velit sit amet justo dignissim elementum.", artist3);
        paintingRepo.save(painting13);
        Painting painting14 = new Painting("Fruit and Coffeepot ", "/images/matisse_fruit_and_coffeepot.jpg",
                "Colour has here acquired greater independence than was seen in earlier works. T" +
                        "he intensity of the reflected colours on the surface of the coffeepot, the thick broad areas " +
                        "of coloured shadow on the tablecloth, all state the artist's increasing interest in this element. " +
                        "Matisse's world was becoming less dependent on concrete reality, and he created a greater " +
                        "distance from that reality by using a high viewpoint which enabled him to see the objects from " +
                        "a strange and unnatural angle.",artist3);
        paintingRepo.save(painting14);
        Painting painting15 = new Painting("Study of a Nude", "/images/matisse_study_of_a_nude.jpg",
                "A nude woman with a majestic body stands on a stage in the middle of the room. In the background, " +
                        "we can glimpse the artist painting her. The warm oranges of the model’s body and the greens " +
                        "in the background are complementary colors, intensifying her vivid presence. Matisse’s use of " +
                        "pointillist brushwork in this painting shows the influence of Neo-Impressionism, but the " +
                        "artist’s experimentation with strong colors and his placement of colors suggest that he is moving " +
                        "toward becoming a Fauve. It was during this period that Matisse’s colleague Marquet, " +
                        "apparently working at an easel side-by-side with Matisse, painted his Fauvist Nude " +
                        "(Musée des Beaux-Arts de Bordeaux).",artist3);
        paintingRepo.save(painting15);

        // PAINTINGS FOR PAUL CEZANNE - ARTIST 4:
        // PAINTING #s 16 TO 20
        Painting painting16 = new Painting("Pryamid of Skulls", "/images/paul_cezanne_pyramid_of_skulls.jpg",
                "Working in isolation in the last decade of his life, Cézanne frequently alluded to mortality " +
                        "in his letters: \"For me, life has begun to be deathly monotonous\"; \"As for me, I'm old. " +
                        "I won't have time to express myself\"; and \"I might as well be dead.\" It is possible that the " +
                        "death of his mother on October 25, 1897—she had been a protective and supportive " +
                        "influence—accelerated his meditations on mortality, a subject which had obsessed the artist " +
                        "since the late 1870s, but did not find pictorial form for another twenty years. Cézanne's " +
                        "health started to deteriorate at the same time.",artist4);
        paintingRepo.save(painting16);
        Painting painting17 = new Painting("Mont Saint-Victoire with Large Pine", "/images/paul_cezanne_mont_sainte-victoire.jpg",
                "Mont Sainte-Victoire became one of Cézanne’s most repeated and varied themes, with Cézanne " +
                        "changing something about the scene each time, from his angle to the lighting to the compositional " +
                        "specifics to the mood he tried to evoke. Cézanne used three primary vantage points for these " +
                        "paintings: near his brother’s property in Bellevue, near Bibemus quarry, and in Les Lauves. " +
                        "His scenes generally included Mont Sainte-Victoire itself, a grey-white limestone mountain, " +
                        "and the surrounding valley and plains that the mountain rose from.",artist4);
        paintingRepo.save(painting17);
        Painting painting18 = new Painting("L'Estaque aux toits rouges", "/images/cezanne_lestaque_aux_toits_rouges.jpg",
                "This oil on canvas is one of a number of landscape paintings completed by the famous artist " +
                        "Paul Cezanne (1839-1906) of a small French fishing village. L’Estaque is just west of Marseille. ",artist4);
        paintingRepo.save(painting18);
        Painting painting19 = new Painting("La Route Tournante en sous Bois ", "/images/cezanne_la_route_tournante_en_sous-bois.jpg",
                "Curabitur commodo aliquet libero, sed lacinia orci ultricies eu. " +
                        "Mauris malesuada ullamcorper elit, ornare iaculis lacus auctor et. Aenean non laoreet arcu. " +
                        "Maecenas rhoncus leo velit, a ultrices mauris efficitur ut. Aliquam sagittis congue auctor. " +
                        "Etiam quis ex at tellus facilisis iaculis in sed erat. Phasellus eget orci at lectus tempor " +
                        "volutpat ut et ante. Aliquam eu malesuada tellus, at tempor dui.",artist4);
        paintingRepo.save(painting19);
        Painting painting20 = new Painting("The Bay of Marseilles, Seen from L'Estaque", "/images/cezanne_the_bay_of_marseilles.jpg",
                "The composition is divided into four very distinct areas: the shoreline - " +
                        "the heaviest and most thickly painted part -, the smooth surface of the water, " +
                        "the mountain range and then the thin strip of sky. All the lines converge towards a point " +
                        "outside the frame on the left where the bay narrows. The truncated view of the motif arbitrarily " +
                        "cropped by the framing of the painting is typical of Cézanne's work.",artist4);
        paintingRepo.save(painting20);

//        // PAINTINGS FOR PIERRE AUGUST RENOIR - ARTIST 5:
//        // PAINTING #s 21 TO 25
        Painting painting21 = new Painting("Dance at Le moulin de la Galette", "/images/renoir_le_moulin_de_la_galette.jpg",
                "Bal du moulin de la Galette (commonly known as Dance at Le moulin de la Galette) is an 1876 " +
                        "painting by French artist Pierre-Auguste Renoir. It is housed at the Musée d'Orsay in Paris " +
                        "and is one of Impressionism's most celebrated masterpieces. The painting depicts a typical " +
                        "Sunday afternoon at the original Moulin de la Galette in the district of Montmartre in Paris. " +
                        "In the late 19th century, working class Parisians would dress up and spend time there dancing, " +
                        "drinking, and eating galettes into the evening",artist5);
        paintingRepo.save(painting21);
        Painting painting22 = new Painting("Luncheon of the Boating Party", "/images/renoir_luncheon_of_the_boating_party.jpg",
                "Luncheon of the Boating Party  is a painting by French impressionist Pierre-Auguste Renoir. " +
                        "Included in the Seventh Impressionist Exhibition in 1882, it was identified as the best " +
                        "painting in the show by three critics. It was purchased from the artist by the dealer-patron " +
                        "Paul Durand-Ruel and bought in 1923 (for $125,000) from his son by industrialist Duncan Phillips, " +
                        "who spent a decade in pursuit of the work.[4][5] It is now in The Phillips Collection in " +
                        "Washington, D.C. It shows a richness of form, a fluidity of brush stroke, and a flickering light. ",artist5);
        paintingRepo.save(painting22);
        Painting painting23 = new Painting("Piazza San Marco, Venice", "/images/renoir_piazza_san_marco_venice.jpg",
                "On his tour of Italy, Renoir made a stop in Venice in late October 1881. " +
                        "His Venetian canvases focus primarily on famous sites. Here, Renoir depicts the domes of the " +
                        "Cathedral of San Marco gleaming in the midday sun. This painting was left in a sketch-like " +
                        "state without any studio reworking. ",artist5);
        paintingRepo.save(painting23);
        Painting painting24 = new Painting("The Grands Boulevards", "/images/renoir_grands_boulevards.jpg",
                "The Grands Boulevards is an oil on canvas painting, which was painted by Pierre-Auguste Renoir " +
                        "in 1875. The painting illustrates a busy Paris boulevard showing the effects of industrialisation " +
                        "and Haussmannisation. The image is housed at the Philadelphia Museum of Art. It is considered " +
                        "to be Renoir's most famous view of Paris. ",artist5);
        paintingRepo.save(painting24);
        Painting painting25 = new Painting("Two Sisters (On the Terrace) ", "/images/renoir_two_sisters.jpg",
                "Renoir worked on the painting on the terrace of the Maison Fournaise, a restaurant located " +
                        "on an island in the Seine in Chatou, the western suburb of Paris. The painting depicts " +
                        "a young woman and her younger sister seated outdoors with a small basket containing balls of wool. " +
                        "Over the railings of the terrace one can see shrubbery and foliage with the River Seine behind it. ",artist5);
        paintingRepo.save(painting25);

        Hashtag animal = new Hashtag("#animal", painting7, painting22, painting23, painting24, painting25);
        hashtagRepo.save(animal);

        Hashtag blue = new Hashtag("#Blue", painting1, painting2, painting3, painting4, painting5, painting6,
                painting7, painting8, painting9, painting10, painting14, painting17, painting18, painting19,painting20,
                painting21, painting22, painting23, painting24, painting25);
        hashtagRepo.save(blue);

        Hashtag boat = new Hashtag("#boat", painting3, painting4, painting6,painting20, painting22  );
        hashtagRepo.save(boat);

        Hashtag bridge = new Hashtag("#bridge", painting1);
        hashtagRepo.save(bridge);

        Hashtag canal = new Hashtag("#canal", painting6);
        hashtagRepo.save(canal);

        Hashtag dance = new Hashtag("#dance", painting9, painting21);
        hashtagRepo.save(dance);

        Hashtag flag = new Hashtag("#flag", painting4, painting8);
        hashtagRepo.save(flag);

        Hashtag flowers = new Hashtag("#flowers", painting1, painting2, painting4, painting5, painting7,
                painting9, painting10, painting11, painting22, painting25);
        hashtagRepo.save(flowers);

        Hashtag france = new Hashtag("#France", painting1, painting2, painting3, painting4, painting5, painting7,
                painting8, painting9, painting10, painting11, painting12, painting17, painting18, painting19, painting20,
                painting21, painting22, painting24, painting25);
        hashtagRepo.save(france);

        Hashtag garden = new Hashtag("#garden", painting1, painting2, painting4, painting10);
        hashtagRepo.save(garden);

        Hashtag girl = new Hashtag("#girl", painting4, painting5, painting7, painting9, painting21, painting22,
                painting24, painting25);
        hashtagRepo.save(girl);

        Hashtag green = new Hashtag("#green", painting1, painting2, painting4, painting5, painting7, painting8,
                painting9, painting10, painting11, painting12, painting14, painting15, painting17, painting18, painting19,
                painting20, painting21, painting22, painting24, painting25);
        hashtagRepo.save(green);

        Hashtag hat = new Hashtag("#hat", painting4, painting5, painting6, painting7, painting9, painting21,
                painting22, painting24, painting25);
        hashtagRepo.save(hat);

        Hashtag house = new Hashtag("#house", painting2, painting5, painting6, painting8, painting10, painting12,
                painting17, painting18, painting19, painting20, painting24);
        hashtagRepo.save(house);

        Hashtag italy = new Hashtag("#Italy", painting6, painting23);
        hashtagRepo.save(italy);

        Hashtag landscape = new Hashtag("#landscape", painting1, painting5, painting10, painting12, painting17, painting18, painting19, painting20);
        hashtagRepo.save(landscape);

        Hashtag marseilles = new Hashtag("#Marseilles", painting20);
        hashtagRepo.save(marseilles);

        Hashtag nature = new Hashtag("#nature", painting1, painting2, painting4, painting5, painting11, painting12, painting17, painting18, painting19, painting25);
        hashtagRepo.save(nature);

        Hashtag nude = new Hashtag("#nude", painting13, painting15);
        hashtagRepo.save(nude);

        Hashtag party = new Hashtag("#party", painting4, painting9, painting21, painting22);
        hashtagRepo.save(party);

        Hashtag piazza = new Hashtag("#piazza", painting23);
        hashtagRepo.save(piazza);

        Hashtag poppies = new Hashtag("#poppies", painting5);
        hashtagRepo.save(poppies);

        Hashtag red = new Hashtag("#red", painting2, painting3, painting4, painting5, painting8, painting10, painting18, painting25);
        hashtagRepo.save(red);

        Hashtag sister = new Hashtag("#sister", painting25);
        hashtagRepo.save(sister);

        Hashtag skulls = new Hashtag("#skuls", painting16);
        hashtagRepo.save(skulls);

        Hashtag smoke = new Hashtag("#smoke", painting3, painting4, painting7, painting9, painting20);
        hashtagRepo.save(smoke);

        Hashtag train = new Hashtag("#train", painting20);
        hashtagRepo.save(train);

        Hashtag stilllife = new Hashtag("#still life", painting11, painting13, painting14, painting15, painting16);
        hashtagRepo.save(stilllife);

        Hashtag street = new Hashtag("#street", painting6, painting7, painting8, painting12 ,painting19, painting21, painting23, painting24);
        hashtagRepo.save(street);

        Hashtag studio = new Hashtag("#sutdio", painting9, painting11, painting13, painting14, painting15, painting16);
        hashtagRepo.save(studio);

        Hashtag sunset = new Hashtag("#sunset", painting3);
        hashtagRepo.save(sunset);

        Hashtag tree = new Hashtag("#tree", painting1, painting2, painting5, painting7, painting10, painting12, painting17, painting18, painting19, painting20, painting21, painting24, painting25);
        hashtagRepo.save(tree);

        Hashtag venice = new Hashtag("#Venice", painting6, painting23);
        hashtagRepo.save(venice);

        Hashtag water = new Hashtag("#water", painting1, painting3, painting4, painting6, painting18, painting20, painting22);
        hashtagRepo.save(water);

    }


}
