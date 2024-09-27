import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException4 {

    public static void main(String[] args) {
        int i, j, k = 0;
        i = 8;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter j value: ");
        try {
            j = Integer.parseInt(bufferedReader.readLine());
            k = i + j;
            if (k<10){
                throw new ArithmeticException();
            }
            System.out.println("Output = "+k);
        } catch (NumberFormatException e) {
            System.out.println("Enter integers only");
        }
        catch (ArithmeticException exception) { // unchecked exception
            System.out.println("Minimum value for the output is 10 ");

        } catch (IOException e) {
            System.out.println("Some input output error");
        }finally {
            System.out.println("Bye");

        }


    }
}
