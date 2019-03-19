package com.soa.soap;

import com.soa.soap.dao.StudentDao;
import com.soa.soap.entity.StudentEntity;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;


@WebService
@Stateless
public class StudentService {

    private StudentDao dao;

    public StudentService() {
        this.dao = new StudentDao();
    }

    @WebMethod
    public void addStudent(@WebParam(name = "student") StudentEntity student) {
        dao.openCurrentSessionwithTransaction();
        dao.persist(student);
        dao.closeCurrentSessionwithTransaction();
    }

    @WebMethod
    public List<StudentEntity> getAllStudents() {
        dao.openCurrentSession();
        List<StudentEntity> students = dao.findAll();
        dao.closeCurrentSession();
        return students;
    }

    @WebMethod
    public void updateStudent(@WebParam(name = "student") StudentEntity student) {
        dao.openCurrentSessionwithTransaction();
        dao.update(student);
        dao.closeCurrentSessionwithTransaction();
    }

    @WebMethod
    public void deleteStudent(@WebParam(name = "id") String id) {
        dao.openCurrentSessionwithTransaction();
        StudentEntity entity = dao.findById(id);
        dao.delete(entity);
        dao.closeCurrentSessionwithTransaction();
    }

}
