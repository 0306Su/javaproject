package swt.dao;


import swt.domian.Student;

import java.util.List;

/**
 * @author admin
 */
public interface StudentDao {
    int inserStudent(Student student);
    List<Student> selectStudents();
}
