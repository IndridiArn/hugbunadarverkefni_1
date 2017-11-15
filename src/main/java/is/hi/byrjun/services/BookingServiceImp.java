
package is.hi.byrjun.services;

import is.hi.byrjun.exceptions.DataException;
import is.hi.byrjun.exceptions.InputException;
import is.hi.byrjun.model.Booking;
import is.hi.byrjun.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 *
 * Implementation klasi fyrir BookingService interfaceið.
 * Útfærir service aðferðirnar og talar við repository
 * klasana og nær þannig í viðeigandi gögn.
 *
 */
@Service
public class BookingServiceImp implements BookingService {

    // Tenging yfir í safn af veitingahúsum
    @Autowired
    BookingRepository bookingRep;

    @Override
    public void addBooking(Booking b){

                bookingRep.save(b);

    }

    @Override
    public List<Booking> allBookings() throws DataException {

        try {

            if (!bookingRep.findAll().isEmpty()) {
                return bookingRep.findAll();
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }

    @Override
    public List<Booking> findBooking(Long id) throws DataException {

        try {

            if (!bookingRep.findByid(id).isEmpty()) {
                return bookingRep.findByid(id);
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }

    @Override
    public boolean erALifi() {
        return true;
    }
    
}
