package com.vge.dao;

import com.vge.domain.Student;
import com.vge.vo.StudentAndClassroomVo;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    public Student getById(String id);

    public void save(Student s);

    public List<Student> getAll();

    public void update(Student s);

    public void delete(String id);

    public Student select1(String s);

    public List<Student> select2(int i);

    public List<Student> select3(String xiaohong, int i);

    public List<Student> select4(Student s);

    public List<Student> select5(Map<String, Object> map);

    public Student select6(String s);

    public List<Student> select7(String z);

    public List<Student> select8(String s);

    public List<Student> select9(String z);

    public String select10(String s);

    public List<String> select11();

    public int select12();

    public List<Map<String, Object>> select14();

    public List<Student> select15();

    public List<Student> select16();

    public List<Student> select17(Student s);

    List<Student> select18(String[] strArr);

    Student select19(String s);

    List<Map<String, Object>> select20();

    List<StudentAndClassroomVo> select21();

    List<StudentAndClassroomVo> select22(String z);
}
