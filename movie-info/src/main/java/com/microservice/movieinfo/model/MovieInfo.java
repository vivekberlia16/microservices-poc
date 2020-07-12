package com.microservice.movieinfo.model;

import lombok.Data;

@Data
public class MovieInfo {
    public MovieInfo(int movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    private int movieId;
    private String name;
}
