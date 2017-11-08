package is.hi.byrjun.services;

import is.hi.byrjun.model.Review;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 */
public interface ReviewService {

    /**
     * Finnur reviews um veitingahús eftir nafni
     *
     * @param nafn String
     */
    List<Review> getReviews(String nafn);

    /**
     * Bætir við review í reviewRep
     *
     * @param r Restaurant
     */
    public void addReview(Review r);

    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    public List<Review> allReviews();



    
    //public Restaurant save(Restaurant restaurant);

             
}
