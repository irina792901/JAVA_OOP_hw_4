package service;

import data.StudentGroup;
import data.Teacher;
import data.User;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherServiceImpl implements DataService{
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
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
