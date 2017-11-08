package is.hi.byrjun.controller;

import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.model.Review;
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
 * @author Hópur 23, Hugbúnaðarverkefni 1, 2017.
 * Byggt á DaginnKennari eftir Ebbu Þóru Hvannberg
 * @date október 2017 HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 *
 */
@Controller
@RequestMapping("/demo") // Notice here that the Request Mapping is set at the Class level
public class SearchController {
    /**
     * Engar tilviksbreytur í þessum klasa svo það er engin
     * þörf fyrir gettera og settera
     *
     */

    // Tenging yfir í þjónustu klasa fyrir forritið
    @Autowired
    private SearchService searchService;
    @Autowired
    private ReviewService reviewService;

    /**
     * Einföld forsíða, lítil virkni
     *
     * @return vefsíða frontPage
     */
    @RequestMapping("/frontPage")
    public String frontPage() {
        return "demo/frontPage";
    }

    /**
     * Spyr hvað notandinn heitir
     *
     * @return vefsíða inputInfo með spurningu fyrir notanda
     */
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotanda() {
        return "demo/inputInfo";
    }

    /**
     * Fall til að hlaða upplýsingum um
     * nýjan veitingastað inn í gagnagrunninn
     *
     * @param model módel fyrir samskipti við viðmót
     * @param name nafn veitingahúss
     * @param type týpa veitingahúss
     * @param info upplýsingar um veitingahús
     *
     * @return vefsíða showNew með staðfestingu
     */

    @RequestMapping(value = "/newRes", method = RequestMethod.POST)
    public String newRes(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "type", required = false) String type,
                         @RequestParam(value = "info", required = false) String info,
                         ModelMap model) {

        Restaurant b = new Restaurant(name, type, 1, info);
        model.addAttribute("restaurant", b);
        searchService.addRestaurant(b);
        return "demo/showNew";

    }


    /**
     * Fall sem skilar niðurstöðum úr leit eftir tegund veitingahúss
     *
     * @param model módel fyrir samskipti við viðmót
     * @param type týpa veitingahúss
     *
     * @return vefsíða allRestaurants með leitarniðurstöðum
     */
    @RequestMapping(value = "/typeResults", method = RequestMethod.POST)
    public String typeResults(@RequestParam(value = "type", required = false) String type,
                              ModelMap model) {
        ArrayList < Restaurant > listi;
        listi = (ArrayList < Restaurant > ) searchService.findByType(type);
        model.addAttribute("restaurants", listi);
        return "demo/allRestaurants";
    }

    /**
     * Birtir lista af öllum veitingahúsunum
     *
     * @param model módel fyrir samskipti við viðmót
     *
     * @return vefsíða allRestaurants með lista af veitingahúsum
     */
    @RequestMapping(value = "/allRes", method = RequestMethod.GET)
    public String allRes(Model model) {
        ArrayList < Restaurant > listi;
        listi = (ArrayList < Restaurant > ) searchService.allRestaurants();
        model.addAttribute("restaurants", listi);
        return "demo/allRestaurants";
    }

    @RequestMapping(value = "/randRes", method = RequestMethod.GET)
    public String randRes(Model model) {
        ArrayList < Restaurant > listi;
        ArrayList < Restaurant > res;
        listi = (ArrayList < Restaurant > ) searchService.allRestaurants();
        int num = (int)(1 + Math.random() * listi.size());
        res = (ArrayList < Restaurant > ) searchService.randRes(num);
        model.addAttribute("restaurant", res);
        return "demo/randomRestaurant";
    }

    /**
     * Birtir lista af öllum veitingahúsunum
     *
     * @param model módel fyrir samskipti við viðmót
     * @param r nafn veitingahúss sem upplýsingar skulu birtar um
     * @return vefsíða info með upplýsingu um veitingahúsið
     */
    @RequestMapping(value = "/resInfo", method = RequestMethod.POST)
    public String resInfo(@ModelAttribute("restaurant") long r,
                          ModelMap model) {

        String info;
        info = searchService.finnaInfo((int)r);
        model.addAttribute("restaurants", info);

        String n = searchService.finnaNafn((int)r);

        ArrayList <Review> listi;
        listi = (ArrayList < Review > ) reviewService.getReviews(n);

        model.addAttribute("reviews", listi);

        return "demo/info";
    }


}