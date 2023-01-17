package terminal.executable;

import dto.Student;
import service.StudentService;

public class CommandExecutableFactory {

    private StudentService studentService;

    public CommandExecutable create(String[] input) {
        return switch (input[0]) {
            case "/add" -> new CreateStudentExecutable(studentService, new Student(input[1]));
            case "/deleteStudent" -> new DeleteStudentExecutable(studentService, new Student(input[1]));
            case "/deleteStudentByFio" -> new DeleteStudentByFioExecutable(studentService, input[1]);
            default -> new DeleteStudentByGroupNumberAndStudentAgeExecutable(studentService,
                    Integer.parseInt(input[1]), Integer.parseInt(input[2]));
        };
    }
}
