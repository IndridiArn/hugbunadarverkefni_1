package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**Indriði Arnaldsson ina23@hi.is, 
 * Grétar Guðmundur Sæmundsson ggs12@hi.is, 
 * Bjarki Hreinn Viðarsson bhv2@hi.is, 
 * Sigurður Andri Jóhannsson saj43@hi.is
 **DemoController tekur við inntakinu frá hvadaNotandi.jps og skilar því í 
 ** synaNotandi.jsp sem síðan birtir svarið á vef. 
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class DemoController {


    // Þar sem klasinn hefur slóðina "/demo", er þessi slóð "/demo/page"
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo"; // skilar .jsp skrá sem er /webapp/WEB-INF/vefvidmot/demo/demo.jsp
                            // skoðið application.properties til að sjá hvernig slóðin er sett
    }
    //tekur við inntakinu frá hvadaNotandi
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi(){
    	return "demo/hvadaNotandi";
    }
    //skilar inntakinu frá hvaðaNotandi til synaNotandi 
    @RequestMapping(value="/hver",method=RequestMethod.POST)
    public String hver(@RequestParam(value="nafn",required = false)
    		String nafn,ModelMap model){
    	model.addAttribute("nafn",nafn);
    	return"demo/synaNotandi";
    }
    
    

}
