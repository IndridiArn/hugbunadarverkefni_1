package is.hi.byrjun.services;

import is.hi.byrjun.exceptions.DataException;
import is.hi.byrjun.model.Booking;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * BookingService interface klasi.
 * Útfærir interface fyrir service implementation klasann.
 * Þeir sjá svo um að útfæra aðferðirnar og talar við repository
 * klasana og nær þannig í viðeigandi gögn.
 *
 */
public interface BookingService {


    /**
     * Finnur bókun eftir lykli
     *
     * @param id
     */
    public List<Booking> findBooking(Long id) throws DataException;


    /**
     * Bætir við bókun í bookingRep
     *
     * @param b Booking
     */
    public void addBooking(Booking b) throws DataException;

    /**
     * Skilar öllum bókunum í bookingRep
     *
     * @return listi af bókunum
     */
    public List<Booking> allBookings() throws DataException;

    public boolean erALifi();
             
}
