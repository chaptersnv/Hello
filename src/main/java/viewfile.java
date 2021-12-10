import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class viewfile {
    private static final Scanner scanner - new Scanner(System.in);
    private static boolean isActive = true;

    public static void main(String[] args) {
        try(FileInputStream text=new FileInputStream("Тут должна быть переменная, надо руками задавать путь, а не статически")) {
            System.out.printf(" File size: %d bytes \n", text.available());
            int i=-1;
            while((i=text.read())!=-1) {
                System.out.print((char)i);
            }

        }
        catch(IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
