package com.micro.hotel.service;

import com.micro.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> findAll();
    Hotel get(String id);
}
