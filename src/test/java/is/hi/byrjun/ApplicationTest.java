package is.hi.byrjun;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

// Athugið vel að þessi import séu rétt

/**
 *
 * @author Bjarki Hreinn og Sigurður Andri - Byggt á klasa eftir Ebbu Þóru Hvannberg
 * @date nóvember 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 * 
 * Prófunarklasi sem framkvæmir prófanir án þess að þurfa að kalla á þjóninn 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc       // Spring MockMvc - allt "context"-ið keyrt upp 
public class ApplicationTest {
    
        // Þjónninn (Tomcat) ekki keyrður upp 
        @Autowired
        private MockMvc mockMvc;

        /**
         * Aðferð til að athuga hvort virkar að senda HttpRequest á /spyrjaNotanda
         * og fá til baka inputInfo síðuna
         */
	@Test 
        public void demoProf() throws Exception {
        this.mockMvc.perform(get("/demo/spyrjaNotanda"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("demo/inputInfo"));
    }

}
