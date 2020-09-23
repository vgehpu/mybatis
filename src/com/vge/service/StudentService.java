package com.vge.service;

import com.vge.domain.Student;

import java.util.List;

public interface StudentService {

    public Student getById(String id);

    public void save(Student s);

    public List<Student> getAll();

    public void update(Student s);

    public void delete(String id);
}
