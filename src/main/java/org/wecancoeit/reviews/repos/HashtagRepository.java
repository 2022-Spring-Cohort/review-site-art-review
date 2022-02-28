package org.wecancoeit.reviews.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Hashtag;

import java.util.Optional;

@Component
public interface HashtagRepository extends CrudRepository<Hashtag,Long> {
    Optional<Hashtag> findByHashtag(String hashtag);

}
