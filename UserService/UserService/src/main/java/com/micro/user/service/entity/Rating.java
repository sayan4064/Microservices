package com.micro.user.service.entity;

import lombok.AllArgsConstructor;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
    private Hotel hotel;
}
