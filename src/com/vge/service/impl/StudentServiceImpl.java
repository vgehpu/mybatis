package com.vge.service.impl;

import com.vge.dao.StudentDao;
import com.vge.domain.Student;
import com.vge.service.StudentService;
import com.vge.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {

        Student s = studentDao.getById(id);

        return s;
    }

    @Override
    public void save(Student s) {

        studentDao.save(s);

    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }

    @Override
    public void update(Student s) {
        studentDao.update(s);
    }

    @Override
    public void delete(String id) {
        studentDao.delete(id);
    }
}
