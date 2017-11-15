/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package is.hi.byrjun.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * byggt á GagnaException eftir Ebbu Þóru Hvannberg
 * @date nóvember 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 *
 * Exception klasi fyrir þau tilvik þar sem notandi slær
 * inn upplýsingar á vitlausu formi.
 *
 */


@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Input on the wrong format")  // 404
public class InputException extends Exception {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(RestaurantNotFound.class);


    public InputException() {
        super(" Wrong format");
        LOGGER.error("Incorrect input format. Please make sure all fields are filled. ");
    }
}
