package controller;

import dto.Student;
import service.StudentService;

public class StudentController implements UserControllerInterface<Student, Integer>{
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student entity) {
        return studentService.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByFio(String lastName, String firstName) {
        return studentService.findByFio(lastName, firstName);
    }
}
