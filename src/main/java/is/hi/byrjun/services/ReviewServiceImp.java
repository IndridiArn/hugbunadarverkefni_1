package is.hi.byrjun.services;

import is.hi.byrjun.exceptions.DataException;
import is.hi.byrjun.model.Review;
import is.hi.byrjun.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Hópur 23, Hugbúnaðarforritun 1, 2017.
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 *
 * Implementation klasi fyrir ReviewService interfaceið.
 * Útfærir service aðferðirnar og talar við repository
 * klasana og nær þannig í viðeigandi gögn.
 *
 */
@Service
public class ReviewServiceImp implements ReviewService {
    /**
     * Engar tilviksbreytur í þessum klasa svo það er engin
     * þörf fyrir gettera og settera
     *
     */

    // Tenging yfir í safn af veitingahúsum
    @Autowired
    private ReviewRepository reviewRep;


    /**
     * Bætir við veitingahúsi í restaurantRep
     *
     * @param r Restaurant
     */
    @Override
    public void addReview(Review r) throws DataException {

        try {

            if (r != null) {
                reviewRep.save(r);
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }


    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    @Override
    public List < Review > allReviews() throws DataException {

        try {

            if (!reviewRep.findAll().isEmpty()) {
                return reviewRep.findAll();
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }

    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    @Override
    public List<Review> getReviews(String nafn) throws DataException {

        try {

            if (!reviewRep.getReviews(nafn).isEmpty()) {
                return reviewRep.getReviews(nafn);
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }

}