package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtag;

    @ManyToMany
    private Collection<Painting> paintings;

    public Hashtag(String hashtag) {
        this.hashtag = hashtag;
        this.paintings = new ArrayList<>();
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

    public Collection<Painting> getPaintings() {
        return paintings;
    }

    public void setPainting(Painting painting) {
        this.paintings.add(painting);
    }
}
