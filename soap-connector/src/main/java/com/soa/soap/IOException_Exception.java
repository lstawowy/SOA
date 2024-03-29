
package com.soa.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5-jbossorg-1
 * 2019-04-05T08:20:59.914+02:00
 * Generated source version: 3.2.5-jbossorg-1
 */

@WebFault(name = "IOException", targetNamespace = "http://soap.soa.com/")
public class IOException_Exception extends Exception {

    private com.soa.soap.IOException ioException;

    public IOException_Exception() {
        super();
    }

    public IOException_Exception(String message) {
        super(message);
    }

    public IOException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IOException_Exception(String message, com.soa.soap.IOException ioException) {
        super(message);
        this.ioException = ioException;
    }

    public IOException_Exception(String message, com.soa.soap.IOException ioException, java.lang.Throwable cause) {
        super(message, cause);
        this.ioException = ioException;
    }

    public com.soa.soap.IOException getFaultInfo() {
        return this.ioException;
    }
}
