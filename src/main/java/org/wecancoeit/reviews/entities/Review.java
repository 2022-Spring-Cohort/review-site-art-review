package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String comment;
    private float rating;

    @ManyToOne
    private Painting painting;

    public Review(String name, String comment, float rating) {
        this.name = name;
        this.comment = comment;
        this.rating = rating;
    }

    public Review() {
    }

    public Painting getPainting() {
        return painting;
    }

    public void setPainting(Painting painting) {
        this.painting = painting;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public float getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
