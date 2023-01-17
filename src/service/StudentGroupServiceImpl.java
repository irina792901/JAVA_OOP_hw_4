package service;

import dto.Student;
import dto.StudentGroup;
import dto.Teacher;
import dto.User;
import repository.Repository;
import util.ReaderFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Создать класс УчебнаяГруппаСервис, в котором реализована логика чтения
 * студентов и преподавателя из файла TXT, создания класса УчебнаяГруппа
 * и возвращения его
 */
public class StudentGroupServiceImpl implements StudentGroupService, DataService<Student> {
    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupIntegerRepository.save(studentGroup);
    }

    public StudentGroup findGroupByGroupNumber(int groupNumber) {
        return studentGroupIntegerRepository.findById(groupNumber);
    }

    @Override
    public void create(User user) {

    }

    @Override
    public User read(User user) {
        return null;
    }

    @Override
    public StudentGroup getGroup() {
        return new StudentGroup(ReaderFromTxt.getTeacherFromTxt(), ReaderFromTxt.getStudentsFromTxt());
    }

    @Override
    public StudentGroup getGroup(int number) {
        Teacher teacher = ReaderFromTxt.getTeacherFromTxt();
        List<Student> studentList = ReaderFromTxt.getStudentsFromTxt();
        return new StudentGroup(teacher, studentList, number);
    }

    @Override
    public void removeStudent(String lastName, String firstName) {
        Iterator<Student> studentGroup = getGroup().iterator();
        while (studentGroup.hasNext()) {
            Student student = studentGroup.next();
            if (lastName.equals(student.getLastName())
                    && firstName.equals(student.getFirstName()))
                studentGroup.remove();
        }
    }

    @Override
    public void sortUsers(StudentGroup studentGroup) {

    }

    @Override
    public void sortUsersByName(StudentGroup studentGroup) {

    }

    @Override
    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }



}
