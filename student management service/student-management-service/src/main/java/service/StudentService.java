package service;

import java.util.List;

//import entity.Student;
import entity.Student;
//import sms.entity.Student;
//import net.javaguides.sms.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    static Object getStudentById(Long id) {
        return id;
    }

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}