package is.hi.byrjun.services;

import is.hi.byrjun.model.Review;
import is.hi.byrjun.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Hópur 23, Hugbúnaðarforritun 1, 2017.
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
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
    public void addReview(Review r) {
        // Notum save en ekki add
        reviewRep.save(r);
    }


    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    @Override
    public List < Review > allReviews() {
        // Notum findAll í staðinn fyrir getAll
        return reviewRep.findAll();
    }



    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    @Override
    public List<Review> getReviews(String nafn) {
        return reviewRep.getReviews(nafn);
    }


}