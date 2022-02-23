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
    private int ratingCount;
    private float overallRating;
    private float averageRating;

    @ManyToOne
    private Artist artist;

    @OneToMany(mappedBy="painting")
    private Collection<Review> reviews;

    @ManyToMany(mappedBy="paintings")
    private Collection<Hashtag> hashtags;

    public Painting(String title, String imgUrl, Artist artist) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.artist = artist;
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

    public int getRatingCount() {
        return ratingCount;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public float getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(float overallRating) {
        this.overallRating = overallRating;
    }

    public Artist getArtist() {
        return artist;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }
}
