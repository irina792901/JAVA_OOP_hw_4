package controller;

import data.Teacher;
import service.TeacherServiceImpl;

public class TeacherController implements UserControllerInterface<Teacher, Integer>{
    private final TeacherServiceImpl teacherService;

    public TeacherController(TeacherServiceImpl teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher entity) {
        return teacherService.save(entity);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findBuId(id);
    }

    @Override
    public Teacher findByFio(String lastName, String firstName) {
        return teacherService.findByFio(lastName, firstName);
    }
}
