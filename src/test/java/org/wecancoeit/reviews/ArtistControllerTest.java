package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancoeit.reviews.controllers.ArtistController;
import org.wecancoeit.reviews.entities.Artist;
import org.wecancoeit.reviews.repos.ArtistRepository;
import java.util.Arrays;
import java.util.Collection;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ArtistController.class)
public class ArtistControllerTest {
    @MockBean
    ArtistRepository mockArtistRepo;

    @Mock
    Artist tempArtist;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldRedirectToAllArtistsTemplate() throws Exception{
        mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name
                ("AllArtistsTemplate"));
    }

    @Test
    public void shouldGetArtistInModel() throws Exception {
        Collection<Artist> artists = Arrays.asList(tempArtist);
        when(mockArtistRepo.findAll()).thenReturn(artists);
        mockMvc.perform(get("/")).andExpect(model().attribute("artists", artists));
    }

}
