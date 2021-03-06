package is.hi.byrjun.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;


/**
 * Exception handler sem virkar fyrir alla klasa - ekki bara controllera 
 * hlýðir (e. handles) SQLException og DataException og hefur líka default handler
 * fyrir aðrar Exceptions 
 *
 * @author Ebba Þóra Hvannberg
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */

// Merkir að exception handlerinn virkar fyrir alla klasa 
@ControllerAdvice
public class UniversalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.
            getLogger(UniversalExceptionHandler.class);
    
    private static final String DEFAULT_ERROR_VIEW = "demo/unknownError";

    @ExceptionHandler(SQLException.class)
    public String handleSQLException(HttpServletRequest request, Exception ex) {
        LOGGER.info("SQLException undantekning URL=" + request.getRequestURL());
        return "demo/PSQLException";
    }

    /**
     * Exception handler fyrir DataException, t.d. DataAccessException. skráir
     * upplýsingar í logger og birtir villuboð á vefsíðu. 
     * @param request beiðnin
     * @param ex undantekningin 
     * @return vefsíðu með tilkynningu um undantekningu 
     */
    @ExceptionHandler(DataException.class)
    public String handleGagnaException(HttpServletRequest request, Exception ex) {
        LOGGER.info("DataException undantekning URL=" + request.getRequestURL());
        return "demo/databaseError";
    }

    /**
     * Exceptionhandler fyrir allar undantekningar nema þær sem eru
     * merktar með @ResponseStatus - nema að það sé búið að meðhöndla þær
     *
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView
            defaultHandler(HttpServletRequest req, Exception e)
                    throws Exception {

        // Ef Exception klasinn er merktur með @ResponseStatus skaltu endur-
        // framkalla hana (exception) annars lætirðu vita um Almenna villu 
        if (AnnotationUtils.findAnnotation(e.getClass(),
                ResponseStatus.class) != null) {
            throw e;
        }

        LOGGER.info("Almenn villa "+ req.getRequestURL());
        
        // Annars birtum við sjálfgefna villusíðu
        ModelAndView mav = new ModelAndView();
        mav.addObject("undantekning", e);
        mav.addObject("url", req.getRequestURL());

        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

}
