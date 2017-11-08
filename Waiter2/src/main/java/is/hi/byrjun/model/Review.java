

package is.hi.byrjun.model;

import javax.persistence.*;


/**
 *
 * @author Bjarki Hreinn Viðarsson
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 *
 * Restaurant klasi inniheldur nafn kennarans og heimilisfang
 */

// Skilgreinum Entity og Table fyrir gagnagrunninn
@Entity
@Table (name="reviews")
public class Review {



    // Skilgrein id sem auðkenni (e. identity)  hlutarins
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;            // Lykillinn
    private String restaurant;  // Nafn veitingahúss sem review eru tengd við
    private int rating;          // Einkunn veitingahúss
    private String text;        // Stutt umsögn um staðinn

    // Smiður til að búa til tóman hlut. Hefur enga parametra
    public Review() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    // Hefðbundinn smiður
    public Review(String r, int ra, String t) {
        restaurant = r;
        rating = ra;
        text = t;
    }

    // toString aðferð
    @Override
    public String toString() {
        return String.format("<BR>" + "restaurant: "+ restaurant + "<BR>" +"rating "+ rating +
                "<BR>" +" text: "+ text);
    }

}
