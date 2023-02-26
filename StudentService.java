package Student.Portfolio.Service;

import Student.Portfolio.Model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
