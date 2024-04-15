package org.ideas.hotelreservationsystem.controller;

import org.ideas.hotelreservationsystem.entity.Hotel;
import org.ideas.hotelreservationsystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @PostMapping("/addHotel")
    public ResponseEntity<String> addHotel(@RequestBody Hotel hotel)
    {

        reservationService.addHotel(hotel);
        return new ResponseEntity<>("created", HttpStatus.OK);
    }

    @GetMapping("/getCheapest")
    public ResponseEntity<Hotel> getCheapestHotel()
    {
        Hotel hotel = reservationService.getCheapestHotel();
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }
}
