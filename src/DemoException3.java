import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException3 {

    public static void main(String[] args) throws IOException { //suppress the Exception. Not handling the Exception
        int i, j, k;
        i = 8;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter j value: ");
        j = Integer.parseInt(bufferedReader.readLine());
        k = i + j;
        System.out.println("Output = "+k);
    }
}
