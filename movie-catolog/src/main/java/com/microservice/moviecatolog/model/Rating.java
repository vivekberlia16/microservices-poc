package com.microservice.moviecatolog.model;




public class Rating {


    public Rating(int movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public Rating()
    {

    }


    private int movieId;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private int rating;
}