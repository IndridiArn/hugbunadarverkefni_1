package is.hi.byrjun;

import is.hi.byrjun.controller.SearchController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Bjarki Hreinn og Sigurður Andri - Byggt á klasa eftir Ebbu Þóru Hvannberg
 * @date nóvember 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Prófunarklasi sem athugar hvort SearchController keyrir
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {
    
        @Autowired 
        SearchController searchController;

        /**
         * Aðferð til að athuga hvort SearchController hlutur hefur verið búinn til
         */
        
	@Test
	public void contextLoads() {
        
                   assertThat(searchController).isNotNull();
	}

}
