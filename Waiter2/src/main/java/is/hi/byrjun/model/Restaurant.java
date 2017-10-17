
package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Bjarki Hreinn ViÃ°arsson
 * @date oktÃ³ber 2017
 * HBV501G HugbÃºnaÃ°arverkefni 1
 * HÃ¡skÃ³li Ã�slands
 * 
 * Restaurant klasi inniheldur nafn kennarans og heimilisfang
 */

// Skilgreinum Entity og Table fyrir gagnagrunninn
@Entity
@Table (name="restaurants")
public class Restaurant {
    
    // Skilgrein id sem auÃ°kenni (e. identity)  hlutarins 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // Lykill veitingahÃºss
    private String name;    // Nafn veitingahÃºss
    private String type;    // Tegund veitingahÃºss
    private int price;      // VerÃ°flokkur veitingahÃºss

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;

    // SmiÃ°ur til aÃ° bÃºa til tÃ³man hlut. Hefur enga parametra
    public Restaurant() {
    }



    public String getName() {
        return name;
    }

    public void setName(String nafn) {
        this.name = nafn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


   
    // HefÃ°bundinn smiÃ°ur
    public Restaurant(String n, String t, int p, String i) {
        name = n;
        type = t;
        price = p;
        info = i;
    }

    // toString aÃ°ferÃ°
    @Override
    public String toString() {
        return String.format("<BR>" + "name: "+ name + "<BR>" +"type: "+ type +
                "<BR>" +" price: "+ price + "<BR>" +" information: "+ info);
    }
    
    
    
    
}
