package org.ideas.hotelreservationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.ideas.hotelreservationsystem.controller","org.ideas.hotelreservationsystem.repository","org.ideas.hotelreservationsystem.service","org.ideas.hotelreservationsystem.entity"})
public class HotelReservationSystem1Application {

    public static void main(String[] args) {
        SpringApplication.run(HotelReservationSystem1Application.class, args);
    }

}
