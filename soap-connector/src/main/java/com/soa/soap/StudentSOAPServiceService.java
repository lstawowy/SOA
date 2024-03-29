package com.soa.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.2.5-jbossorg-1
 * 2019-04-05T08:20:59.958+02:00
 * Generated source version: 3.2.5-jbossorg-1
 */
@WebServiceClient(name = "StudentSOAPServiceService",
        wsdlLocation = "http://localhost:8080/soapapp-ejb/StudentSOAPService?wsdl",
        targetNamespace = "http://soap.soa.com/")
public class StudentSOAPServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.soa.com/", "StudentSOAPServiceService");
    public final static QName StudentSOAPServicePort = new QName("http://soap.soa.com/", "StudentSOAPServicePort");

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/soapapp-ejb/StudentSOAPService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StudentSOAPServiceService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "http://localhost:8080/soapapp-ejb/StudentSOAPService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StudentSOAPServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StudentSOAPServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentSOAPServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public StudentSOAPServiceService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StudentSOAPServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StudentSOAPServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }


    /**
     * @return returns StudentSOAPService
     */
    @WebEndpoint(name = "StudentSOAPServicePort")
    public StudentSOAPService getStudentSOAPServicePort() {
        return super.getPort(StudentSOAPServicePort, StudentSOAPService.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns StudentSOAPService
     */
    @WebEndpoint(name = "StudentSOAPServicePort")
    public StudentSOAPService getStudentSOAPServicePort(WebServiceFeature... features) {
        return super.getPort(StudentSOAPServicePort, StudentSOAPService.class, features);
    }

}
