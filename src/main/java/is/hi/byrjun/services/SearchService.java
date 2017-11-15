package is.hi.byrjun.services;

import is.hi.byrjun.exceptions.DataException;
import is.hi.byrjun.model.Restaurant;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 *
 * SearchService interface klasi.
 * Útfærir interface fyrir service implementation klasann.
 * Þeir sjá svo um að útfæra aðferðirnar og talar við repository
 * klasana og nær þannig í viðeigandi gögn.
 *
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
    String finnaInfo(int nafn) throws DataException;

    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    String finnaNafn(int nafn) throws DataException;

    /**
     * Bætir við veitingahúsi í restaurantRep
     *
     * @param r Restaurant
     */
    public void addRestaurant(Restaurant r) throws DataException;

    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    public List<Restaurant> allRestaurants() throws DataException;

    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    public List<Restaurant> randRes(int num) throws DataException;

    public boolean erALifi();

}
