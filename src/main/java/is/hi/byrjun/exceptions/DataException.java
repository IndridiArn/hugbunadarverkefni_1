/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package is.hi.byrjun.exceptions;

/**
 *
 * @author Bjarki Hreinn Viðarsson
 * byggt á GagnaException eftir Ebbu Þóru Hvannberg
 * @date 
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
public class DataException extends Exception{
    
    public DataException(Exception e) {
        super(" database operation was unsuccessful");
    }
}
