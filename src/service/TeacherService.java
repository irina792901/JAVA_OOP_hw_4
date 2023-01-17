package service;

import dto.StudentGroup;
import dto.Teacher;
import dto.User;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherService implements DataService{
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
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

    @Override
    public void removeStudent(String firstName, String lastName) {

    }

    @Override
    public void sortUsers(StudentGroup studentGroup) {

    }

    @Override
    public void sortUsersByName(StudentGroup studentGroup) {

    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findByFio(String lastName, String firstName) {
        return teacherRepository.findByFio(lastName, firstName);
    }
    public Teacher findBuId(int id){
        return teacherRepository.findById(id);
    }
}
