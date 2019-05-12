package com.soa.soap.dao;

import com.soa.soap.entity.StudentEntity;
import com.soa.soap.enums.Gender;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentDao {

    private Session currentSession;

    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure();
            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public void save(StudentEntity entity) {
        getCurrentSession().save(entity);
    }

    public void update(StudentEntity entity) {
        getCurrentSession().update(entity);
    }

    public void delete(StudentEntity entity) {
        getCurrentSession().delete(entity);
    }

    public StudentEntity findById(Integer id) {
        return (StudentEntity) getCurrentSession().get(StudentEntity.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<StudentEntity> findAll() {
        return (List<StudentEntity>) getCurrentSession().createQuery("from StudentEntity").list();
    }

    public List<StudentEntity> findByFirstName(String firstName) {
        return (List<StudentEntity>) getCurrentSession().createQuery("from StudentEntity where firstName like " + firstName).list();
    }

    public List<StudentEntity> findBylastName(String lastName) {
        return (List<StudentEntity>) getCurrentSession().createQuery("from StudentEntity where lastName like " + lastName).list();
    }

    public List<StudentEntity> findByEmail(String email) {
        return (List<StudentEntity>) getCurrentSession().createQuery("from StudentEntity where email like " + email).list();
    }

    public List<StudentEntity> findByGender(Gender gender) {
        return (List<StudentEntity>) getCurrentSession().createQuery("from StudentEntity where gender is " + gender).list();
    }

    public void deleteAll() {
        List<StudentEntity> entityList = findAll();
        for (StudentEntity entity : entityList) {
            delete(entity);
        }
    }


}
