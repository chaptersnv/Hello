import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Что я могу");
        System.out.println("List");
        System.out.println("Hello");
        System.out.println("Bye");

        BufferedReader reader = new BufferedReader(InputStreamReader(System.in));
        String comcmd = reader.readLine();
        switch (comcmd) {
            case "List":
                System.out.println("List");
                System.out.println("Hello");
                System.out.println("Bye");
                break;
            case "Hello":
                System.out.println("Hello Timofei");
                break;
            case "Bye":
                break;


        }

    }
}
