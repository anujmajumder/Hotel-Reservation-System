package org.ideas.hotelreservationsystem.service;

import org.ideas.hotelreservationsystem.entity.Hotel;
import org.ideas.hotelreservationsystem.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public void addHotel(Hotel hotel)
    {
        reservationRepository.save(hotel);
    }

    public Hotel getCheapestHotel() {
        List<Hotel> hotels = new ArrayList<>();
        reservationRepository.findAll().forEach(hotels::add);
        return hotels.stream().min(Comparator.comparingDouble(Hotel::getRate)).get();

    }
}
