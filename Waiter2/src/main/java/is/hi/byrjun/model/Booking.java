

package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
@Table (name="bookings")
public class Booking {


    // Skilgrein id sem auðkenni (e. identity)  hlutarins
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;            // Lykill
    private String restaurant;  // Nafn veitingahúss sem bókað er á
    private int seats;          // Fjöldi sæta sem bókuð eru
    private String date;        // Dagsetning bókunnar
    private String time;        // Tímasetning bókunnar

    // Smiður til að búa til tóman hlut. Hefur enga parametra
    public Booking() {
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

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Hefðbundinn smiður
    public Booking(String r, int s, String d, String t) {
        restaurant = r;
        seats = s;
        date = d;
        time = t;
    }

    // toString aðferð
    @Override
    public String toString() {
        return String.format("<BR>" + "restaurant: "+ restaurant + "<BR>" +"seats: "+ seats +
                "<BR>" +" date: "+ date + "<BR>" +" time: "+ time);
    }

}
