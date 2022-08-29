package com.swt.dao;

import com.swt.domian.Student;

import java.util.List;

/**
 * @author admin
 */
public interface StudentDao {
    int inserStudent(Student student);
    List<Student> selectStudents();
}
