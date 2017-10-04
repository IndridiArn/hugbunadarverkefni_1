
package is.hi.byrjun.services;

import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.repository.RestaurantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class SearchServiceImp implements SearchService {

    // Tenging yfir í safn af veitingahúsum
    @Autowired
    RestaurantRepository restaurantRep;

    @Override
    public void addRestaurant(Restaurant r) {
         restaurantRep.save(r);    // Notum save en ekki add
    }

    @Override
    public List<Restaurant> allRestaurants() {
        return restaurantRep.findAll();    // Notum findAll í staðinn fyrir getAll
    }
    /*
    @Override
    public Restaurant save(Restaurant restaurant) {
        return restaurantRep.save(restaurant);
    }
    */


    @Override
    public List<Restaurant> findByType(String type) {
        return restaurantRep.findByType(type);
    }

    @Override
    public String finnaInfo(String nafn) {
        return restaurantRep.finnaInfo(nafn);
    }

    
}
