package org.wecancoeit.reviews.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtag;

    @ManyToOne
    private Painting painting;

    public Hashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Hashtag() {
    }

    public long getId() {
        return id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public Painting getPainting() {
        return painting;
    }
}
