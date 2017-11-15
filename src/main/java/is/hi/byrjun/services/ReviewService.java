package is.hi.byrjun.services;

import is.hi.byrjun.exceptions.DataException;
import is.hi.byrjun.model.Review;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 *
 * ReviewService interface klasi.
 * Útfærir interface fyrir service implementation klasann.
 * Þeir sjá svo um að útfæra aðferðirnar og talar við repository
 * klasana og nær þannig í viðeigandi gögn.
 *
 *
 */
public interface ReviewService {

    /**
     * Finnur reviews um veitingahús eftir nafni
     *
     * @param nafn String
     */
    List<Review> getReviews(String nafn) throws DataException;

    /**
     * Bætir við review í reviewRep
     *
     * @param r Restaurant
     */
    public void addReview(Review r) throws DataException;

    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    public List<Review> allReviews() throws DataException;


}
