package com.microservice.moviecatolog.model;

public class MovieItem {


    public MovieItem(int movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public MovieItem() {
    }

    private int movieId;
    private String name;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
