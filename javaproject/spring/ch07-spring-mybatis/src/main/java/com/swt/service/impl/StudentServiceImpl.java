package com.swt.service.impl;

import com.swt.dao.StudentDao;
import com.swt.domian.Student;
import com.swt.service.StudentService;

import java.util.List;

/**
 * @author admin
 */
public class StudentServiceImpl implements StudentService {

    //引用类型
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.inserStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students =studentDao.selectStudents();
        return students;
    }
}
