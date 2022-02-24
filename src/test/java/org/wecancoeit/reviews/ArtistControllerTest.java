package org.wecancoeit.reviews;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.wecancoeit.reviews.controllers.ArtistController;
import org.wecancoeit.reviews.entities.Artist;
import org.wecancoeit.reviews.repos.ArtistRepository;

import static org.mockito.Mockito.mock;

public class ArtistControllerTest {
    ArtistRepository mockArtistRepo;
    ArtistController undertest;
    Model mockModel;
    Artist tempArtist;

    @BeforeEach
    public void setUp() {
        mockArtistRepo = mock(ArtistRepository.class);
        mockModel = mock(Model.class);
        undertest = new ArtistController(mockArtistRepo);
        tempArtist = new Artist("whiskers","https://i.guim.co.uk/img/media/26392d05302e02f7bf4eb143bb84c8097d09144b/446_167_3683_2210/master/3683.jpg?width=620&quality=85&auto=format&fit=max&s=21718fb1379918410ea10054db89f665", "2000-2015");
    }

    @Test
    public void shouldRedirectToCorrectTemplate() {
        mockArtistRepo.save(tempArtist);
    }
}
