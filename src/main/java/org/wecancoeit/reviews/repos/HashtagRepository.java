package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Hashtag;

@Component
public interface HashtagRepository extends CrudRepository<Hashtag,Long> {
}
