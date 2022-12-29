package controller;

import data.Student;
import service.StudentServiceImpl;

public class StudentController implements UserControllerInterface<Student, Integer>{
    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
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
