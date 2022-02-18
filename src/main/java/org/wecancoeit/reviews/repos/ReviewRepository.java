package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Review;

@Component
public interface ReviewRepository extends CrudRepository <Review,Long>{
}
