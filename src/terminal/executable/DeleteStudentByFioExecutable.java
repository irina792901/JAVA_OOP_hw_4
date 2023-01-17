package terminal.executable;

import dto.Student;
import service.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable{
    private StudentService studentService;
    private String fio;

    public DeleteStudentByFioExecutable(StudentService studentService, String fio) {
        this.studentService = studentService;
        this.fio = fio;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByFio(fio);
    }
}
