package com.microservice.ratingsdataservice.model;

import java.util.List;

public class UserRating {

    List<Rating> ratings;
    String fullName;
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserRating() {
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserRating(List<Rating> ratings, String fullName,String userId) {
        this.ratings = ratings;
        this.fullName = fullName;
        this.userId=userId;

    }


}
