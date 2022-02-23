package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Painting;

import java.util.Optional;

public interface PaintingRepository extends CrudRepository<Painting, Long> {
}
