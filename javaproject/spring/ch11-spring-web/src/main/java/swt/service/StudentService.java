package swt.service;


import swt.domian.Student;

import java.util.List;

/**
 * @author admin
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudents();
}
