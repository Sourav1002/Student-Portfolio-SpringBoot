package Student.Portfolio.Service;

import Student.Portfolio.Model.Student;
import Student.Portfolio.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
  @Autowired
  private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student)
    {
        return studentRepo.save(student);
    }

  @Override
  public List<Student> getAllStudents() {
    return studentRepo.findAll();
  }
}
