/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelapi;

/**
 *
 * @author Admin
 */
public class ExcelApiException extends Exception {

    /**
     * Creates a new instance of <code>ExcelUtilException</code> without detail
     * message.
     */
    public ExcelApiException() {
    }

    /**
     * Constructs an instance of <code>ExcelUtilException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcelApiException(String msg) {
        super("ExcelAPI: "+msg);
    }
}
