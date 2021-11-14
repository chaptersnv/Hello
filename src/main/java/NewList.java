import java.io.IOException;
import java.util.Scanner;

public class NewList {
    public static void main(String[] args) throws IOException {
        System.out.println("Что я могу");
        System.out.println("List");
        System.out.println("Hello");
        System.out.println("Bye");

        Scanner in = new Scanner(System.in);
        System.out.println("Вводи шо хош от меня: ");
        String comcmd = in.nextLine();
        if (comcmd == "List") {
            System.out.println("List");
            System.out.println("Hello");
            System.out.println("Bye");
        }
        else if (comcmd == "Hello") {
            System.out.println("Hello Timofei dude");
        }
        else if (comcmd == "Bye") {
            System.out.println();
        }

    }
}
