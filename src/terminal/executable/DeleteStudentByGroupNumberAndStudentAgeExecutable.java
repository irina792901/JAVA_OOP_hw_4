package terminal.executable;

import dto.Student;
import service.StudentService;

public class DeleteStudentByGroupNumberAndStudentAgeExecutable implements CommandExecutable {
    private StudentService studentService;
    private Integer groupNumber;
    private Integer studentAge;

    public DeleteStudentByGroupNumberAndStudentAgeExecutable(StudentService studentService,
                                                             Integer groupNumber, Integer studentAge) {
        this.studentService = studentService;
        this.groupNumber = groupNumber;
        this.studentAge = studentAge;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByGroupNumberAndStudentAge(groupNumber, studentAge);
    }
}
