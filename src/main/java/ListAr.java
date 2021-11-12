import java.util.ArrayList;

public class ListAr {
    public static void main(String[] args) {
        ArrayList<String> command = new ArrayList<String>();
        command.add("List");
        command.add("Hello");
        command.add("By");

        for (int i = 0; i < command.size(); i++)
            System.out.println(command.get(i));

        System.out.println("Чаво хотите?: ");
    }
}
