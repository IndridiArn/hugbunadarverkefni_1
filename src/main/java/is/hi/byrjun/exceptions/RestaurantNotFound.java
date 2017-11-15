package is.hi.byrjun.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Er Exception sem lýsir því að kennari fannst ekki í gagnagrunni 
 * 
 * @author Bjarki Hreinn Viðarsson
 * byggt á KennariFannstEkki eftir Ebbu Þóru Hvannberg
 * @date nóvember 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */

// Þegar RestaurantNotFound hlutur (exception) er búinn til er svarið HttpStatus.NOT_FOUND
// sent til forritsins. Ef controller meðhöndlar ekki undantekninguna með @ExceptionHandler
// eða Global Exception handler meðhöndlar hana ekki 
// þá verður til venjuleg Http villa og /error síðan meðhöndlar hana 

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such restaurant")  // 404
public class RestaurantNotFound extends Exception {

    private String nafn;
    private static final Logger LOGGER = 
            LoggerFactory.getLogger(RestaurantNotFound.class);
    
    public String getNafn() {
        return nafn;
    }
    
    public RestaurantNotFound(String nafn) {
        super(nafn + " not found");
        LOGGER.error("Restaurant not found "+nafn);
        this.nafn = nafn;
        
    }
}
