package com.soa.soap;

import com.soa.soap.converter.Base64Converter;
import com.soa.soap.dao.StudentDao;
import com.soa.soap.entity.StudentEntity;
import com.soa.soap.enums.Gender;
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

    private StudentDao dao;

    public StudentSOAPService() {
        this.dao = new StudentDao();
    }

    @WebMethod
    public String hello(@WebParam(name = "name") String name) {
        return "Hello " + name;
    }

    @WebMethod
    public void addStudent(@NotNull @WebParam(name = "student") StudentEntity student) {
        dao.openCurrentSessionwithTransaction();
        dao.save(student);
        dao.closeCurrentSessionwithTransaction();
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getAllStudents() {
        dao.openCurrentSession();
        List<StudentEntity> students = dao.findAll();
        dao.closeCurrentSession();
        return students;
    }

    @WebMethod
    @WebResult(name = "student")
    public StudentEntity getStudentById(@NotNull @WebParam(name = "id") Integer id) {
        dao.openCurrentSession();
        StudentEntity student = dao.findById(id);
        dao.closeCurrentSession();
        return student;
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByFirstName(@NotNull @WebParam(name = "firstName") String firstName) {
        dao.openCurrentSession();
        List<StudentEntity> students = dao.findByFirstName(firstName);
        dao.closeCurrentSession();
        return students;
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByLastName(@NotNull @WebParam(name = "lastName") String lastName) {
        dao.openCurrentSession();
        List<StudentEntity> students = dao.findBylastName(lastName);
        dao.closeCurrentSession();
        return students;
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByEmail(@NotNull @WebParam(name = "email") String email) {
        dao.openCurrentSession();
        List<StudentEntity> students = dao.findByEmail(email);
        dao.closeCurrentSession();
        return students;
    }

    @WebMethod
    @WebResult(name = "student")
    @XmlElementWrapper(name = "students")
    public List<StudentEntity> getStudentsByGender(@NotNull @WebParam(name = "gender") Gender gender) {
        dao.openCurrentSession();
        List<StudentEntity> students = dao.findByGender(gender);
        dao.closeCurrentSession();
        return students;
    }

    @WebMethod
    public void updateStudent(@NotNull @WebParam(name = "id") Integer id,
                              @NotNull @WebParam(name = "student") StudentEntity student) {
        dao.openCurrentSessionwithTransaction();
        student.setId(id);
        dao.update(student);
        dao.closeCurrentSessionwithTransaction();
    }

    @WebMethod
    public void deleteStudentById(@NotNull @WebParam(name = "id") Integer id) {
        dao.openCurrentSessionwithTransaction();
        StudentEntity entity = dao.findById(id);
        dao.delete(entity);
        dao.closeCurrentSessionwithTransaction();
    }

    @WebMethod
    public void deleteAllStudents() {
        dao.openCurrentSessionwithTransaction();
        dao.deleteAll();
        dao.closeCurrentSessionwithTransaction();
    }

    @WebMethod
    public void uploadBase64ImageToStudent(@NotNull @WebParam(name = "id") Integer id,
                                           @NotNull @WebParam(name = "filePath") String filePath) throws IOException {

        dao.openCurrentSessionwithTransaction();
        StudentEntity entity = dao.findById(id);
        entity.setAvatar(Base64Converter.convertToBase64(filePath));
        dao.update(entity);
        dao.closeCurrentSessionwithTransaction();
    }

    @WebMethod
    public void downloadStudentAvatar(@NotNull @WebParam(name = "id") Integer id,
                                      @NotNull @WebParam(name = "filePath") String filePath) throws IOException {
        dao.openCurrentSessionwithTransaction();
        StudentEntity entity = dao.findById(id);
        Base64Converter.convertBase64ToImage(entity.getAvatar(), filePath);
        dao.update(entity);
        dao.closeCurrentSessionwithTransaction();
    }

}
