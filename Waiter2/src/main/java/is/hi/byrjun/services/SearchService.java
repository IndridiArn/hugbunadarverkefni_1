package is.hi.byrjun.services;

import is.hi.byrjun.model.Restaurant;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viğarsson
 * @date október 2017
 * HBV501G Hugbúnağarverkefni 1 Háskóli Íslands
 *
 */
public interface SearchService {

    /**
     * Finnur veitingahús eftir tegund
     *
     * @param type String
     * @return listi af veitingahúsum
     */
    public List<Restaurant> findByType(String type);


    /**
     * Finnur upplısingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    String finnaInfo(String nafn);

    /**
     * Bætir viğ veitingahúsi í restaurantRep
     *
     * @param r Restaurant
     */
    public void addRestaurant(Restaurant r);

    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    public List<Restaurant> allRestaurants();

    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    public List<Restaurant> randRes(int num);


    
    //public Restaurant save(Restaurant restaurant);

             
}
