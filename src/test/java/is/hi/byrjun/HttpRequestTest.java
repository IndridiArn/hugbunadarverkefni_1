package is.hi.byrjun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Bjarki Hreinn og Sigurður Andri - Byggt á klasa eftir Ebbu Þóru Hvannberg
 * @date nóvember 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 * 
 * Prófunarklasi sem sendir URL á test web client
*/

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    
        // Fyrir random port
        @LocalServerPort
         private int port;
                 
        // Client klasi til að nota í integration test (samþættingarpróf) og notar Http API 
        @Autowired
        private TestRestTemplate restTemplate;
         
        /**
         * Aðferð til að athuga hvort virkar að senda HttpRequest á spyrjaNotanda og
         * fá til baka síðu sem inniheldur "Search"
        
         * @throws Exception
         */
	@Test
        public void demoProf() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/demo/spyrjaNotanda",
                String.class)).contains("Search");
    }

}
