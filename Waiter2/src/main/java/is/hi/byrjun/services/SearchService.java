package is.hi.byrjun.services;

import is.hi.byrjun.model.Restaurant;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Vi�arsson
 * @date okt�ber 2017
 * HBV501G Hugb�na�arverkefni 1 H�sk�li �slands
 *
 */
public interface SearchService {

    /**
     * Finnur veitingah�s eftir tegund
     *
     * @param type String
     * @return listi af veitingah�sum
     */
    public List<Restaurant> findByType(String type);


    /**
     * Finnur uppl�singar um veitingah�s eftir nafni
     *
     * @param nafn String
     */
    String finnaInfo(String nafn);

    /**
     * B�tir vi� veitingah�si � restaurantRep
     *
     * @param r Restaurant
     */
    public void addRestaurant(Restaurant r);

    /**
     * Skilar �llum veitingah�sum � restaurantRep
     *
     * @return listi af veitingah�sum
     */
    public List<Restaurant> allRestaurants();

    /**
     * Skilar �llum veitingah�sum � restaurantRep
     *
     * @return listi af veitingah�sum
     */
    public List<Restaurant> randRes(int num);


    
    //public Restaurant save(Restaurant restaurant);

             
}
