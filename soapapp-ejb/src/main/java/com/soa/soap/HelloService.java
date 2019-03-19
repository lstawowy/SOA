package com.soa.soap;

import org.jboss.security.annotation.SecurityDomain;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
@Stateless
@SecurityDomain("other")
public class HelloService {

    @RolesAllowed("user")
    @WebMethod
    public String hello(@WebParam(name = "name") String name) {
        return "Hello " + name;
    }

}
