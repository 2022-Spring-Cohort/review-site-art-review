package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Painting {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String imgUrl;

    @ManyToOne
    private Artist artist;

    @ElementCollection
    private Collection<String> comments;

    @ElementCollection
    private Collection<Integer> ratings;

    public Painting(String title, String imgUrl, Artist artist) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.artist = artist;
        this.comments = new ArrayList<String>();
        this.ratings = new ArrayList<Integer>();
    }

    public Painting() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Artist getArtist() {
        return artist;
    }

    public Collection<String> getComments() {
        return comments;
    }

    public Collection<Integer> getRatings() {
        return ratings;
    }

    public void addRating(int rating){
        ratings.add(rating);
    }

    public void addComment(String comment){
        comments.add(comment);
    }
}
