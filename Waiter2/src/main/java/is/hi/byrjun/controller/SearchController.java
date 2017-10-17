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
 * @author Bjarki Hreinn ViÃ°arsson
 * Byggt Ã¡ DaginnKennari eftir Ebbu ÃžÃ³ru Hvannberg
 * @date oktÃ³ber 2017 HBV501G HugbÃºnaÃ°arverkefni 1 HÃ¡skÃ³li Ã�slands
 *
 *
 */
@Controller
@RequestMapping("/demo") // Notice here that the Request Mapping is set at the Class level
public class SearchController {

    // Tenging yfir Ã­ Ã¾jÃ³nustu klasa fyrir forritiÃ°
    @Autowired
    SearchService searchService;
   

    @RequestMapping("/frontPage")
    public String frontPage()
    {
        return "demo/frontPage";
    }

    /**
     * Spyr hvaÃ° notandinn heitir
     *
     * @return vefsÃ­Ã°a meÃ° spurningu fyrir notanda
     */
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotanda() {
        return "demo/inputInfo";
    }

    /**
     * Fall til aÃ° hlaÃ°a upplÃ½singum um
     * nÃ½jan veitingastaÃ° inn Ã­ gagnagrunninn
     *
     * @return vefsÃ­Ã°a meÃ° staÃ°festingu showNew
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
     * Fall sem skilar niÃ°urstÃ¶Ã°um Ãºr leit eftir tegund veitingahÃºss
     *
     * @param model mÃ³del fyrir samskipti viÃ° viÃ°mÃ³t
     * @param type tÃ½pa veitingahÃºss
     *
     * @return vefsÃ­Ã°a meÃ° leitarniÃ°urstÃ¶Ã°um
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
     * Birtir lista af Ã¶llum veitingahÃºsunum
     *
     * @param model mÃ³del fyrir samskipti viÃ° viÃ°mÃ³t
     * @return vefsÃ­Ã°u meÃ° lista af veitingahÃºsum
     */
    @RequestMapping(value = "/allRes", method = RequestMethod.GET)
    public String allRes(Model model) {
        ArrayList<Restaurant> listi;
        listi = (ArrayList<Restaurant>) searchService.allRestaurants();
        model.addAttribute("restaurants", listi);
        return "demo/allRestaurants";
    }
    
    /**
     * Gefur veitingastad af handahofi
     * @param model model fyrir samskipti vid vidmot
     * @return veitingastadur af handahofi
     */
    @RequestMapping(value = "/randRes", method = RequestMethod.GET)
    public String randRes(Model model) {
        ArrayList<Restaurant> listi;
        listi = (ArrayList<Restaurant>) searchService.allRestaurants();
        model.addAttribute("randomRestaurant", listi[(int)(listi.size()*Math.random())]);
        return "demo/randomRestaurant";
    }
    
    

    /**
     * Birtir lista af Ã¶llum veitingahÃºsunum
     *
     * @param model mÃ³del fyrir samskipti viÃ° viÃ°mÃ³t
     * @param r nafn veitingahÃºss sem upplÃ½singar skulu birtar um
     * @return vefsÃ­Ã°u meÃ° upplÃ½singu um veitingahÃºsiÃ°
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
