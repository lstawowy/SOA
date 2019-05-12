package com.soa.soap.client;

import com.soa.soap.GetAllStudentsResponse;
import com.soa.soap.StudentEntity;
import com.soa.soap.StudentSOAPService;
import com.soa.soap.StudentSOAPServiceService;

import javax.xml.ws.BindingProvider;

public class ClientStudentFileUtils {

    public static void main(String[] args) {
        StudentSOAPServiceService service = new StudentSOAPServiceService();
        StudentSOAPService soapService = service.getStudentSOAPServicePort();
        setCreed(soapService);
        GetAllStudentsResponse.Students students = soapService.getAllStudents();
        for (StudentEntity student : students.getStudent()) {
            System.out.println(student.toString());
        }
    }

    private static void setCreed(StudentSOAPService service) {
        BindingProvider provider = (BindingProvider) service;
        provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "lukasz");
        provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "lukasz");
    }
}