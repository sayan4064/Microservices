package com.micro.rating.Repository;

import com.micro.rating.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RatingRepository extends JpaRepository<Rating, UUID> {
    List<Rating> getRatingsByUserId(UUID userId);
    List<Rating> getRatingsByHotelId(UUID hotelId);
}
