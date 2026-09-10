package com.micro.rating.Service;

import com.micro.rating.Entity.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    List<Rating> getRatingsByUserId(String userId);
    List<Rating> getRatingsByHotelId(String hotelId);
    List<Rating> getAllRatings();
}
