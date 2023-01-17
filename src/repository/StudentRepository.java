package repository;

import dto.Student;

public class StudentRepository implements UserRepository<Student, Integer>{

    public void deleteStudent(Student student){
    }
    public void deleteStudentByFio(String fio){

    }
    public void deleteStudentByGroupNumberAndStudentAge(int groupNumber, int studentAge){

    }

    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String lastName, String firstName) {
        return null;
    }
}
