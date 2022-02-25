package org.wecancoeit.reviews;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancoeit.reviews.controllers.ArtistController;
import org.wecancoeit.reviews.entities.Artist;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Painting;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repos.ArtistRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;
import org.wecancoeit.reviews.repos.PaintingRepository;
import org.wecancoeit.reviews.repos.ReviewRepository;

@WebMvcTest(ArtistController.class)
public class PaintingControllerTest {
    @MockBean
    PaintingRepository mockPaintingRepo;

    @MockBean
    ReviewRepository mockReviewRepo;

    @MockBean
    HashtagRepository mockHashtagRepo;

    @Mock
    Painting tempPainting;

    @Mock
    Review tempReview;

    @Mock
    Hashtag tempHashtag;

    @Autowired
    private MockMvc mockMvc;
}
