/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Restaurant;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 */

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    /**
     * Nær í öll veitingahús
     * @return listi af veitingahúsum
     */
    List<Restaurant> findAll();
    
    /**
     * Bætir við veitingahúsi
     * @param restaurant
     */
    Restaurant save (Restaurant restaurant);


    /**
     * Finnur veitingahús eftir tegund
     * @return listi veitingahúsa
     */
    @Query(value = "SELECT p FROM Restaurant p where p.type = ?1 ")
    List<Restaurant> findByType(String type);

    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     * @return info strengur veitingahúss
     */
    @Query(value = "SELECT p.info FROM Restaurant p where p.name = ?1 ")
    String finnaInfo(String nafn);


}
