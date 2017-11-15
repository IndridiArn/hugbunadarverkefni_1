package is.hi.byrjun.services;

import is.hi.byrjun.exceptions.DataException;
import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.repository.RestaurantRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hópur 23, Hugbúnaðarforritun 1, 2017.
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 *
 * Implementation klasi fyrir searchService interfaceið.
 * Útfærir service aðferðirnar og talar við repository
 * klasana og nær þannig í viðeigandi gögn.
 *
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
    public void addRestaurant(Restaurant r) throws DataException {

        try {

            if (r != null) {
                restaurantRep.save(r);
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }

    }


    /**
     * Skilar öllum veitingahúsum í restaurantRep
     *
     * @return listi af veitingahúsum
     */
    @Override
    public List < Restaurant > allRestaurants() throws DataException {

        try {

            if (!restaurantRep.findAll().isEmpty()) {
                return restaurantRep.findAll();
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }



    /**
     * Finnur veitingahús eftir tegund
     *
     * @param type String
     * @return listi af veitingahúsum
     *
     * Hér er ekkert exception því searchController sér um
     * það fyrir þetta fall.
     *
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
    public List < Restaurant > randRes(int num)throws DataException {

        try {

            if (!restaurantRep.randRes(num).isEmpty()) {
                return restaurantRep.randRes(num);
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }


    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    @Override
    public String finnaInfo(int nafn) throws DataException {

        try {

            if (!restaurantRep.finnaInfo(nafn).isEmpty()) {
                return restaurantRep.finnaInfo(nafn);
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }

    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     *
     * @param nafn String
     */
    @Override
    public String finnaNafn(int nafn) throws DataException {

        try {

            if (!restaurantRep.finnaNafn(nafn).isEmpty()) {
                return restaurantRep.finnaNafn(nafn);
            }else {
                return null;
            }
        } catch (DataAccessException s) { // Sjá nánar hér
            // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/dao/DataAccessException.html
            throw new DataException(s);
        }
    }

    @Override
    public boolean erALifi() {
        return true;
    }


}