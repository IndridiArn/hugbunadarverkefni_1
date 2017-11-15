
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 *
 * Repository klasi fyrir reviews.
 * Sér um að vera tenging á milli
 * service klasa og gagnagrunns.
 *
 */

public interface ReviewRepository extends JpaRepository<Review, Long>{
    /**
     * Nær í öll review
     * @return listi af veitingahúsum
     */
    List<Review> findAll();

    /**
     * Bætir við review
     * @param r Review
     */
    Review save(Review r);


    /**
     * Finnur upplýsingar um veitingahús eftir nafni
     * @return info strengur veitingahúss
     */
    @Query(value = "SELECT p FROM Review p where restaurant = ?1 ")
    List<Review> getReviews(String nafn);


}
