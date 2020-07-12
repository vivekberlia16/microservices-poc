package com.microservice.ratingsdataservice.model;

import lombok.Data;

@Data
public class Rating {

    public Rating(int movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }


    private int movieId;
    private int rating;
}
