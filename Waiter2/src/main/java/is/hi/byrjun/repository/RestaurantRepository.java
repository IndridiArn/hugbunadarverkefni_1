
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Restaurant;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Bjarki Hreinn Vi�arsson
 */

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    /**
     * N�r � �ll veitingah�s
     * @return listi af veitingah�sum
     */
    List<Restaurant> findAll();
    
    /**
     * B�tir vi� veitingah�si
     * @param restaurant
     */
    Restaurant save (Restaurant restaurant);


    /**
     * Finnur veitingah�s eftir tegund
     * @return listi veitingah�sa
     */
    @Query(value = "SELECT p FROM Restaurant p where p.type = ?1 ")
    List<Restaurant> findByType(String type);

    /**
     * Finnur uppl�singar um veitingah�s eftir nafni
     * @return info strengur veitingah�ss
     */
    @Query(value = "SELECT p.info FROM Restaurant p where p.name = ?1 ")
    String finnaInfo(String nafn);

    @Query(value = "SELECT p FROM Restaurant p WHERE Id = ?1")
    List<Restaurant> randRes(int num);

}
