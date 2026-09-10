package com.micro.hotel.service;

import com.micro.hotel.Exception.ResourceNotFoundException;
import com.micro.hotel.Repository.HotelRepository;
import com.micro.hotel.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
    return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> findAll() {
       return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel not found"));
    }
}
