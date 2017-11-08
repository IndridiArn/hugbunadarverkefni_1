package is.hi.byrjun.services;

import is.hi.byrjun.model.Booking;
import is.hi.byrjun.model.Restaurant;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 */
public interface BookingService {


    /**
     * Finnur bókun eftir lykli
     *
     * @param id
     */
    public List<Booking> findBooking(Long id);


    /**
     * Bætir við bókun í bookingRep
     *
     * @param b Booking
     */
    public void addBooking(Booking b);

    /**
     * Skilar öllum bókunum í bookingRep
     *
     * @return listi af bókunum
     */
    public List<Booking> allBookings();

    public boolean erALifi();



    // public Booking save(Booking booking);

             
}
