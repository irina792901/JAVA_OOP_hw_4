package service;

import dto.Student;
import dto.StudentGroup;
import dto.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentService implements DataService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }

    @Override
    public StudentGroup getGroup() {
        return null;
    }

    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }

    public void deleteStudentByFio(String fio) {
        studentRepository.deleteStudentByFio(fio);
    }

    public void deleteStudent(Student student) {
        studentRepository.deleteStudent(student);
    }

    public void deleteStudentByGroupNumberAndStudentAge(int groupNumber, int studentAge){
        studentRepository.deleteStudentByGroupNumberAndStudentAge(groupNumber, studentAge);
    }

    @Override
    public void sortUsers(StudentGroup studentGroup) {
    }

    @Override
    public void sortUsersByName(StudentGroup studentGroup) {

    }

    public Student save(Student entity) {
        studentRepository.save(entity);
        return entity;
    }

    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    public Student findByFio(String lastName, String firstName) {
        return studentRepository.findByFio(lastName, firstName);
    }
}
