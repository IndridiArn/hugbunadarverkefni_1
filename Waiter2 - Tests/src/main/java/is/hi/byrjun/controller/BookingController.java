package is.hi.byrjun.controller;

import is.hi.byrjun.model.Booking;
import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.services.BookingService;
import is.hi.byrjun.services.SearchService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * Byggt á DaginnKennari eftir Ebbu Þóru Hvannberg
 * @date október 2017 HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 *
 */
@Controller
@RequestMapping("/demo") // Notice here that the Request Mapping is set at the Class level
public class BookingController {

    // Tenging yfir í þjónustuklasa fyrir forritið
    @Autowired
    BookingService bookingService;

    /**
     * Fall til að hlaða upplýsingum um
     * nýjan veitingastað inn í gagnagrunninn
     *
     * @param res nafn veitingahúss
     * @param seats fjöldi sæta sem bókuð eru
     * @param date dagsetning bókunnar
     * @param time tímasetning bókunnar
     * @param model módel fyrir samskipti við viðmót
     *
     * @return vefsíða með bókunarstaðfestingu confirm
     */
    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String book(@RequestParam(value = "res", required = false) String res,
                       @RequestParam(value = "seats", required = false) int seats,
                       @RequestParam(value = "date", required = false) String date,
                       @RequestParam(value = "time", required = false) String time,
                       ModelMap model) {

        Booking b = new Booking(res, seats, time, date);
        model.addAttribute("booking", b);
        bookingService.addBooking(b);
        return "demo/confirm";

    }
}
