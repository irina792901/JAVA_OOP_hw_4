package terminal;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser){
        if (terminalReader==null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }
    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }



    // можно отдельно сделать private final static Scanner in ... вне метода
    public void getI(int f) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String command = in.nextLine();
            String[] cool = commandParser.parseCommand(command);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);
            commandExecutable.execute();
        }
    }
}
