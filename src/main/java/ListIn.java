import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListIn {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ListIn = reader.readLine();
        System.out.println(ListIn);
    }
}
