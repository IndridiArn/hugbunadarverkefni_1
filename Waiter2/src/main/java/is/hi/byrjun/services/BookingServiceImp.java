
package is.hi.byrjun.services;

import is.hi.byrjun.model.Booking;
import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.repository.BookingRepository;
import is.hi.byrjun.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class BookingServiceImp implements BookingService {

    // Tenging yfir í safn af veitingahúsum
    @Autowired
    BookingRepository bookingRep;

    @Override
    public void addBooking(Booking b) {
         bookingRep.save(b);    // Notum save en ekki add
    }

    @Override
    public List<Booking> allBookings() {
        return bookingRep.findAll();    // Notum findAll í staðinn fyrir getAll
    }

    /*
    @Override
    public Booking save(Booking booking) {
        return bookingRep.save(booking);
    }
    */


    @Override
    public List<Booking> findBooking(Long id) {
        return bookingRep.findByid(id);
    }
    
}
