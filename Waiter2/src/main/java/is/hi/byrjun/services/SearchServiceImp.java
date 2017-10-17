
package is.hi.byrjun.services;

import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.repository.RestaurantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bjarki Hreinn ViÃ°arsson
 * @date september 2017
 * HBV501G HugbÃºnaÃ°arverkefni 1
 * HÃ¡skÃ³li Ã�slands
 */
@Service
public class SearchServiceImp implements SearchService {

    // Tenging yfir Ã­ safn af veitingahÃºsum
    @Autowired
    RestaurantRepository restaurantRep;

    @Override
    public void addRestaurant(Restaurant r) {
         restaurantRep.save(r);    // Notum save en ekki add
    }

    @Override
    public List<Restaurant> allRestaurants() {
        return restaurantRep.findAll();    // Notum findAll Ã­ staÃ°inn fyrir getAll
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
    
    @Override
    public list<Restaurant> giveRandomRes() {
    	return restaurantRep.giveRandomRes();
    }

    
}
