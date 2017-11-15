package is.hi.byrjun.controller;

import is.hi.byrjun.exceptions.DataException;
import is.hi.byrjun.model.Review;
import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.services.ReviewService;
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
public class ReviewController {

    // Tenging yfir í þjónustuklasa fyrir forritið
    @Autowired
    ReviewService reviewService;
    @Autowired
    SearchService searchService;

    @RequestMapping("/mkRev")
    public String spyrjaNotanda(ModelMap model) throws DataException {

        ArrayList < Restaurant > listi;
        listi = (ArrayList < Restaurant > ) searchService.allRestaurants();
        model.addAttribute("restaurants", listi);

        return "demo/makeReview";
    }

    /**
     * Fall til að hlaða upplýsingum um
     * nýjan veitingastað inn í gagnagrunninn
     *
     * @param restaurant nafn veitingahúss
     * @param rating fjöldi sæta sem bókuð eru
     * @param txt dagsetning bókunnar
     * @param model módel fyrir samskipti við viðmót
     *
     * @return vefsíða með bókunarstaðfestingu confirm
     */
    @RequestMapping(value = "/newRev", method = RequestMethod.POST)
    public String newRev(@RequestParam(value = "restaurant", required = false) String restaurant,
                         @RequestParam(value = "rating", required = false) int rating,
                         @RequestParam(value = "txt", required = false) String txt,
                       ModelMap model) throws DataException {

        Review r = new Review(restaurant, rating, txt);
        model.addAttribute("review", r);
        reviewService.addReview(r);
            return "demo/confirmReview";

    }

    /**
     * Birtir lista af öllum veitingahúsunum
     *
     * @param model módel fyrir samskipti við viðmót
     *
     * @return vefsíða allRestaurants með lista af veitingahúsum
     */
    @RequestMapping(value = "/allRevs", method = RequestMethod.GET)
    public String allReviews(Model model) throws DataException {
        ArrayList < Review > listi;
        listi = (ArrayList < Review > ) reviewService.allReviews();
        model.addAttribute("reviews", listi);
        return "demo/allReviews";
    }

    /**
     * Birtir lista af öllum veitingahúsunum
     *
     * @param model módel fyrir samskipti við viðmót
     * @param r nafn veitingahúss sem upplýsingar skulu birtar um
     * @return vefsíða info með upplýsingu um veitingahúsið
     */
    @RequestMapping(value = "/getReviews", method = RequestMethod.POST)
    public String resInfo(@ModelAttribute("restaurant") String r,
                          ModelMap model) throws DataException {

        ArrayList < Review > listi;
        listi = (ArrayList < Review > ) reviewService.getReviews(r);
        model.addAttribute("restaurants", listi);

        return "demo/info";
    }
}
