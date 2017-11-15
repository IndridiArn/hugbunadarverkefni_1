package is.hi.byrjun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Klasi sem sýnir hvernig Controller meðhöndlar villu í URL
 *
 * @author Ebba Þóra Hvannberg
 * @date  október 2017
 * HBV501G Hugbúnaðarverkefni 1 
 */


public class ErrController implements org.springframework.boot.autoconfigure.web.ErrorController {

    // villuslóðin 
    protected static final String PATH = "/error";

    // attribute sem lýsa villunum 
    @Autowired
    private ErrorAttributes errorAttributes;

    

    /**
     * Skilar slóðinni fyrir villu
     */
    @Override
    public String getErrorPath() {
        return PATH;
    }

    /**
     * Nær í villu-attribute sem komu út úr Http beiðni
     *
     * @param request Http beiðnin
     * @param includeStackTrace ef true þá er skilað stack trace annars ekki
     * @return mengi af pörum með nafni af attributi og gildi þeirra
     */
    protected Map<String, Object> getErrorAttributes(HttpServletRequest request,
            boolean includeStackTrace) {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return this.errorAttributes.getErrorAttributes(requestAttributes,
                includeStackTrace);
    }

}
