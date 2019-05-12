package com.soa.soap;

import com.soa.soap.converter.Base64Converter;
import com.soa.soap.dao.StudentsDao;
import com.soa.soap.enums.Gender;
import entity.StudentEntity;
import org.jboss.ws.api.annotation.WebContext;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.IOException;
import java.util.List;


@WebService
@Stateless
@WebContext(authMethod = "BASIC", transportGuarantee = "NONE")
public class StudentSOAPService {

    private StudentsDao dao;

    public StudentSOAPService() {
        this.dao = new StudentsDao();
    }

    @WebMethod
    public String hello(@WebParam(name = "name") String name) {
        return "Hello " + name;
    }

    @WebMethod
    public void addStudent(@NotNull @WebParam(name = "student") StudentEntity student) {
        dao.save(student);
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getAllStudents() {
        return dao.findAll();
    }

    @WebMethod
    @WebResult(name = "student")
    public StudentEntity getStudentById(@NotNull @WebParam(name = "id") Integer id) {
        return (StudentEntity) dao.findById(id);
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByFirstName(@NotNull @WebParam(name = "firstName") String firstName) {
        return dao.findByFirstName(firstName);
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByLastName(@NotNull @WebParam(name = "lastName") String lastName) {
        return dao.findByLastName(lastName);
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByEmail(@NotNull @WebParam(name = "email") String email) {
        return dao.findByEmail(email);
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByGender(@NotNull @WebParam(name = "gender") Gender gender) {
        return dao.findByGender(gender);
    }

    @WebMethod
    public void updateStudent(@NotNull @WebParam(name = "id") Integer id,
                              @NotNull @WebParam(name = "student") StudentEntity student) {
        dao.update(student);
    }

    @WebMethod
    public void deleteStudentById(@NotNull @WebParam(name = "id") Integer id) {
        dao.delete(id);
    }

    @WebMethod
    public void deleteAllStudents() {
    }

    @WebMethod
    public void uploadBase64ImageToStudent(@NotNull @WebParam(name = "id") Integer id,
                                           @NotNull @WebParam(name = "filePath") String filePath) throws IOException {
        StudentEntity entity = (StudentEntity) dao.findById(id);
        entity.setAvatar(Base64Converter.convertToBase64(filePath));
        dao.update(entity);
    }

    @WebMethod
    public void downloadStudentAvatar(@NotNull @WebParam(name = "id") Integer id,
                                      @NotNull @WebParam(name = "filePath") String filePath) throws IOException {
        StudentEntity entity = (StudentEntity) dao.findById(id);
        Base64Converter.convertBase64ToImage(entity.getAvatar(), filePath);
    }

    @WebMethod
    public String downloadStudentAvatarAsBase64(@NotNull @WebParam(name = "id") Integer id) throws IOException {
        StudentEntity entity = (StudentEntity) dao.findById(id);
        return entity.getAvatar();
    }

}
