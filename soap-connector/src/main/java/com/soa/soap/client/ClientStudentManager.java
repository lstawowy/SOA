package com.soa.soap.client;

import com.soa.soap.StudentSOAPService;
import com.soa.soap.StudentSOAPServiceService;

import javax.xml.ws.BindingProvider;

public class ClientStudentManager {

    public static void main(String[] args) {
        StudentSOAPServiceService service = new StudentSOAPServiceService();
        StudentSOAPService soapService = service.getStudentSOAPServicePort();
        setCreed(soapService);
        System.out.println("Client: " + soapService.hello("Łukasz"));
    }

    private static void setCreed(StudentSOAPService service) {
        BindingProvider provider = (BindingProvider) service;
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "lukasz");
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "lukasz");
    }

}