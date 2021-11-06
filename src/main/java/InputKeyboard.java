import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputKeyboard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Inputkeyboard = reader.readLine();
        System.out.println(Inputkeyboard);
    }
}
