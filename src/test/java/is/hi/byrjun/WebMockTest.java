package is.hi.byrjun;


import is.hi.byrjun.controller.SearchController;
import is.hi.byrjun.services.ReviewService;
import is.hi.byrjun.services.SearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

// Athugið vel að þessi import séu rétt

/**
 *
 * @author Bjarki Hreinn og Sigurður Andri - Byggt á klasa eftir Ebbu Þóru Hvannberg
 * @date nóvember 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Prófunarklasi sem framkvæmir prófanir á weblayer og notar WebMvcTest og
 * Mockito til að prófa service klasa 
*/

@RunWith(SpringRunner.class)
/**
 *  Aðeins veflagið er keyrt upp en ekki allur "context"-inn
 *  Getum beðið um að keyra bara upp KennariController klasann 
 *  Biðjum um að bæta SearchService inn í "context-inn" sem Mock (prófanahlut)
 */
@WebMvcTest(SearchController.class)
                                            
public class WebMockTest {

    // Þjónninn (Tomcat) ekki keyrður upp 
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    ReviewService reviewService;

    // Bætum við prófunar (e. Mock) service klasa - kemur úr springframework safninu (fyrir Mockito
    // sérstaklega gert fyrir Mockito safnið 
    @MockBean
    SearchService searchService;

     
    /**
     * Aðferð sem prófar /front á SearchController með
     * erALifi() true. Ættum að fá til baka frontPage síðuna
     */
    @Test
    public void testaLifirTrue() throws Exception {
        // Látum erNafnRett() skila true 
        // Notum Mockito í prófanirnar - Mockito er Framework fyrir unit testing í Java 
        // http://site.mockito.org/   
        
        // Prófið ætti að takast - prófum sönnu leiðina í if-setningunni
        when(searchService.erALifi()).thenReturn(true);
        this.mockMvc.perform(get("/demo/front"))
                .andDo(print())
                .andExpect(status()
                .isOk())
                .andExpect(view().name("demo/frontPage"));
      
    }
    /**
     * Aðferð sem prófar /front á KennariController en með
     * erALifi() false. Ættum að fá til baka frontPage síðuna
     */
    @Test
    public void testaLifirFalse() throws Exception {
        
        // Prófið ætti að takast - prófum ósönnu leiðina í if-setningunni 
        when(searchService.erALifi()).thenReturn(false);
        this.mockMvc.perform(get("/demo/front")).andDo(print())
                .andExpect(status().isOk())
                        .andExpect(view().name("demo/frontPage"));
    }
    
    /**
     * Prófið ætti að mistakast - prófum ósönnu leiðina erALifi() en berum
     * saman við rangan streng 
     * @throws Exception 
     */
    @Test
    public void testaLifirFalseMedRongumStreng() throws Exception {
        
        // Prófið ætti að ekki takast - prófum ósönnu leiðina í if-setningunni 
        when(searchService.erALifi()).thenReturn(false);
        
      
        this.mockMvc.perform(get("/demo/front")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("demo/frontPage"));
        }

       
    }
