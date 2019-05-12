package com.soa.soap.dao;

import entity.StudentEntity;
import org.jboss.logging.Logger;

import javax.ejb.Stateless;

@Stateless
public class StudentsDao extends AbstractDao {

    private static final Logger LOGGER = Logger.getLogger("SoaLab" + StudentsDao.class.toString());

    @Override
    protected Logger getLogger() {
        return LOGGER;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Class<StudentEntity> getType() {
        return StudentEntity.class;
    }

}