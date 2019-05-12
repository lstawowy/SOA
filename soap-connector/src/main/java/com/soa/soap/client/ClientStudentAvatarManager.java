package com.soa.soap.client;

import com.soa.soap.IOException_Exception;
import com.soa.soap.StudentSOAPService;
import com.soa.soap.StudentSOAPServiceService;
import org.apache.commons.io.FileUtils;

import javax.xml.ws.BindingProvider;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class ClientStudentAvatarManager {

    public static void main(String[] args) throws IOException_Exception, IOException {
        StudentSOAPServiceService service = new StudentSOAPServiceService();
        StudentSOAPService soapService = service.getStudentSOAPServicePort();
        setCreed(soapService);
        String base64encoded = soapService.downloadStudentAvatarAsBase64(14);
        byte[] decodedBytes = Base64.getDecoder().decode(base64encoded);
        String outputFileName = "/mount/Data/Projects/SOA/asd.jpg";
        FileUtils.writeByteArrayToFile(new File(outputFileName), decodedBytes);
    }

    private static void setCreed(StudentSOAPService service) {
        BindingProvider provider = (BindingProvider) service;
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "lukasz");
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "lukasz");
    }

}