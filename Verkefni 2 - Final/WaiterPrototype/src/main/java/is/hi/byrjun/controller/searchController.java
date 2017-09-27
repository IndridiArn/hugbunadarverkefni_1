package is.hi.byrjun.controller;

import is.hi.byrjun.model.Booking;
import is.hi.byrjun.model.Restaurant;
import is.hi.byrjun.model.Search;
import is.hi.byrjun.repository.RestaurantList;
import is.hi.byrjun.service.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Byrjunarcontroller sem stýrir hvað er gert þegar notandi eða viðmót
 * setur inn skipun
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir
public class searchController {

    @RequestMapping("/frontPage")
    public String frontPage()
    {
        return "demo/frontPage";
    }

    Booking booking = new Booking(null, 1, 0, false);

    // Fyrsta síðan. Hér slær notandi inn leitarskilyrði.
    // Eins og er er aðeins boðið upp á leit eftir tegund veitingahúss.
    @RequestMapping("/search")
    public String search()
    {
        return "demo/searchResults";
    }

    // Kallað er hér á síðu sem sýnir notanda niðurstöður leitarinnar
    @RequestMapping(value="/results", method=RequestMethod.POST)
    public String showResults(@RequestParam(value="type", required = false) String type, ModelMap model){

        // Search hluturinn mun seinna innihalda fleiri tög en aðeins tegund veitingahúss
        Search search = new Search(type);

        // Köllum á leitaraðferðina úr SearchService klasanum, notum 'gagnagrunninn' úr RestaurantList repository
        String[] results = SearchService.searchByType(search.getType(), RestaurantList.res);

        // Ef leitin finnur ekkert þá látum við notanda vita
        if(results[0] == null)
            model.addAttribute("nafn0", "No restaurants of type '" + type + "' were found." +
                    " Press 'new search' to perform another search.");

            // Annars sýnum við niðurstöður leitarinnar
        else {
            for (int i = 0; i < results.length; i++)
                model.addAttribute("nafn" + Integer.toString(i), results[i]);
        }

        // Köllum á showResults .jsp skrá.
        return "demo/showResults";
    }

    // Hér kemur svo síða með upplýsingum um valið veitingahús.
    // Í gegnum þessa síðu getur notandi einnig bókað borð á veitingahúsinu.
    @RequestMapping(value="/info", method=RequestMethod.POST)
    public String showInfo(@RequestParam(value="restaurant", required = false) String restaurant, ModelMap model){

        Restaurant match = SearchService.searchByName(restaurant, RestaurantList.res);
        booking.setRestaurant(match);


        model.addAttribute("info", match.getUpplysingar());

        return "demo/showInfo";
    }

    // Þessi síða birtist sem staðfesting á bókun notanda.
    @RequestMapping(value="/confirmation", method=RequestMethod.POST)
    public String showConfirmation(@RequestParam(value="number", required = false) int number, ModelMap model){

        booking.setSeats(number); //setjum fjölda sæta sem bókuð eru
        booking.setNumber(1); //setjum borðanúmer sem 1 eins og er, á meðan við erum ekki með fúnkerandi gagnagrunn
        booking.setBoolean(true); //borð 1 á veitingahúsinu er núna bókað


        model.addAttribute("confirmation", "You have a table booked at "
                + booking.getRestaurantName() + " for " + number + " people");

        return "demo/showConfirmation";
    }



}



