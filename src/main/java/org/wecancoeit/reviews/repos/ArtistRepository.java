package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
