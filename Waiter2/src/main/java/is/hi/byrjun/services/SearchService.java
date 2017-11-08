package is.hi.byrjun.services;

import is.hi.byrjun.model.Restaurant;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
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
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    String finnaInfo(int nafn);

    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    String finnaNafn(int nafn);

    /**
     * Bætir við veitingahúsi í restaurantRep
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

    public boolean erALifi();
    
    //public Restaurant save(Restaurant restaurant);

             
}
