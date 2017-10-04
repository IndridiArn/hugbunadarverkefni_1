/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 *
 */

public interface BookingRepository extends JpaRepository<Booking, Long>{

    /**
     * Nær í allar bókanir
     * @return listi af bókunum
     */
    List<Booking> findAll();

    /**
     * Bætir við bókun
     * @param booking
     */
    Booking save (Booking booking);

    /**
     * Finnur bókun eftir lykli
     * @return bókun
     */
    List<Booking> findByid(Long id);

}
