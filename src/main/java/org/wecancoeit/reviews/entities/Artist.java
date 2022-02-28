package org.wecancoeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Artist {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imgUrl;
    private String details;

    @OneToMany(mappedBy = "artist")
    private Collection<Painting> paintings;

    public Artist(String name, String imgUrl, String details) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.details = details;
        this.paintings = new ArrayList<Painting>();
    }

    public Artist() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDetails() {
        return details;
    }

    public Collection<Painting> getPaintings() {
        return paintings;
    }
}
