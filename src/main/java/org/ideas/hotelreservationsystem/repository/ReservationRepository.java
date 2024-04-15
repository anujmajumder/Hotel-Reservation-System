package org.ideas.hotelreservationsystem.repository;

import org.ideas.hotelreservationsystem.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Hotel, Integer> {

}
