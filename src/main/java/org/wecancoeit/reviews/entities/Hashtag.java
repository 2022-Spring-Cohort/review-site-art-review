package org.wecancoeit.reviews.entities;

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

    public void setId(long id) {
        this.id = id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Painting getPainting() {
        return painting;
    }

    public void setPainting(Painting painting) {
        this.painting = painting;
    }
}
