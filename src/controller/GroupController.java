package controller;

import dto.StudentGroup;
import service.StudentGroupServiceImpl;

public class GroupController implements ControllerInterface<StudentGroup, Integer>{
    protected final StudentGroupServiceImpl studentGroupService;

    public GroupController(StudentGroupServiceImpl studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public StudentGroup createGroup(int groupNumber) {
        return studentGroupService.getGroup(groupNumber);
    }

    @Override
    public StudentGroup save(StudentGroup entity) {
        return studentGroupService.saveGroup(entity);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return studentGroupService.findGroupByGroupNumber(id);
    }
}
