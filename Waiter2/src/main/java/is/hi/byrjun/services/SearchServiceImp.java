package is.hi.byrjun.services;

import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.repository.RestaurantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hópur 23, Hugbúnaðarforritun 1, 2017.
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class SearchServiceImp implements SearchService {
    /**
     * Engar tilviksbreytur í þessum klasa svo það er engin
     * þörf fyrir gettera og settera
     *
     */

    // Tenging yfir í safn af veitingahúsum
    @Autowired
    private RestaurantRepository restaurantRep;


    /**
     * Bætir við veitingahúsi í restaurantRep
     *
     * @param r Restaurant
     */
    @Override
    public void addRestaurant(Restaurant r) {
        // Notum save en ekki add
        restaurantRep.save(r);
    }


    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    @Override
    public List < Restaurant > allRestaurants() {
        // Notum findAll í staðinn fyrir getAll
        return restaurantRep.findAll();
    }


    /**
     * Finnur veitingahús eftir tegund
     *
     * @param type String
     * @return listi af veitingahúsum
     */
    @Override
    public List < Restaurant > findByType(String type) {
        return restaurantRep.findByType(type);
    }

    /**
     * Finnur veitingahús eftir tegund
     *
     * @param num int
     * @return listi af veitingahúsum
     */
    @Override
    public List < Restaurant > randRes(int num) {
        return restaurantRep.randRes(num);
    }


    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    @Override
    public String finnaInfo(int nafn) {
        return restaurantRep.finnaInfo(nafn);
    }


}