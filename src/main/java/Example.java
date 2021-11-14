import java.util.Arrays;
import java.util.Scanner;

public class Example {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static boolean isActive = true;

    public static void main(String[] args) {
        Command command;
        processList();
        while (isActive) {
            command = Command.of(SCANNER.nextLine());
            switch (command) {
                case Hello:
                    processHello();
                    break;
                case Bye:
                    isActive = false;
                    break;
                case List:
                default:
                    processList();
            }
        }
    }

    private static void processHello() {
        System.out.println("Hello Timofei dude");
    }

    private static void processList() {
        System.out.println("Commands list");
        Arrays.stream(Command.values()).forEach(System.out::println);
        System.out.println("Take one:");
    }

    private enum Command {
        List,
        Hello,
        Bye;

        public static Command of(String s) {
            return Arrays.stream(values())
                    .filter(it -> s.equalsIgnoreCase(it.name()))
                    .findFirst()
                    .orElse(List);
        }
    }
}
