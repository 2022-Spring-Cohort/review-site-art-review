package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Painting;

public interface PaintingRepository extends CrudRepository<Painting, Long> {

}
