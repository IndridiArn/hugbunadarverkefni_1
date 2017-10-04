/*
 * Copyright (C) 2017 Ebba Þóra Hvannberg 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
@Table (name="restaurants")
public class Restaurant {
    
    // Skilgrein id sem auðkenni (e. identity)  hlutarins 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // Lykill veitingahúss
    private String name;    // Nafn veitingahúss
    private String type;    // Tegund veitingahúss
    private int price;      // Verðflokkur veitingahúss

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;

    // Smiður til að búa til tóman hlut. Hefur enga parametra
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


   
    // Hefðbundinn smiður
    public Restaurant(String n, String t, int p, String i) {
        name = n;
        type = t;
        price = p;
        info = i;
    }

    // toString aðferð
    @Override
    public String toString() {
        return String.format("<BR>" + "name: "+ name + "<BR>" +"type: "+ type +
                "<BR>" +" price: "+ price + "<BR>" +" information: "+ info);
    }
    
}
