package is.hi.byrjun.controller;

import is.hi.byrjun.model.Restaurant;
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
public class SearchController {

    // Tenging yfir í þjónustu klasa fyrir forritið
    @Autowired
    SearchService searchService;
   

    @RequestMapping("/frontPage")
    public String frontPage()
    {
        return "demo/frontPage";
    }

    /**
     * Spyr hvað notandinn heitir
     *
     * @return vefsíða með spurningu fyrir notanda
     */
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotanda() {
        return "demo/inputInfo";
    }

    /**
     * Fall til að hlaða upplýsingum um
     * nýjan veitingastað inn í gagnagrunninn
     *
     * @return vefsíða með staðfestingu showNew
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
     * @return vefsíða með leitarniðurstöðum
     */
    @RequestMapping(value = "/typeResults", method = RequestMethod.POST)
    public String typeResults(@RequestParam(value = "type", required = false) String type,
                                   ModelMap model) {
        ArrayList<Restaurant> listi;
        listi = (ArrayList<Restaurant>) searchService.findByType(type);
        model.addAttribute("restaurants", listi);
        return "demo/allRestaurants";
    }

    /**
     * Birtir lista af öllum veitingahúsunum
     *
     * @param model módel fyrir samskipti við viðmót
     * @return vefsíðu með lista af veitingahúsum
     */
    @RequestMapping(value = "/allRes", method = RequestMethod.GET)
    public String allRes(Model model) {
        ArrayList<Restaurant> listi;
        listi = (ArrayList<Restaurant>) searchService.allRestaurants();
        model.addAttribute("restaurants", listi);
        return "demo/allRestaurants";
    }

    /**
     * Birtir lista af öllum veitingahúsunum
     *
     * @param model módel fyrir samskipti við viðmót
     * @param r nafn veitingahúss sem upplýsingar skulu birtar um
     * @return vefsíðu með upplýsingu um veitingahúsið
     */
    @RequestMapping(value = "/resInfo", method = RequestMethod.POST)
    public String resInfo(@ModelAttribute("restaurant") String r,
                       ModelMap model) {

        String info;
        info = searchService.finnaInfo(r);
        model.addAttribute("restaurants", info);

        return "demo/info";
    }







}
