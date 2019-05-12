package com.soa.soap.dao;

import com.soa.soap.enums.Gender;
import entity.StudentEntity;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class StudentsDao extends AbstractDao {

    @Override
    public Class getClassType() {
        return StudentEntity.class;
    }

    public List<StudentEntity> findByFirstName(String firstName) {
        return findBy("firstName", firstName);
    }

    public List<StudentEntity> findByLastName(String lastName) {
        return findBy("lastName", lastName);
    }

    public List<StudentEntity> findByEmail(String email) {
        return findBy("email", email);
    }

    public List<StudentEntity> findByGender(Gender gender) {
        return findBy("gender", gender.toString());
    }
}