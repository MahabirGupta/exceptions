import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Try with Resource
public class InputDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter name: ");
            try {

            String name = bufferedReader.readLine();
            } catch (IOException e) {
//                throw new RuntimeException(e);
                System.out.println(e);
            }
            finally {

        bufferedReader.close();
            }
//            creating a try block with a Resource
            try(BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in))) {
                String name = bufferedReader.readLine();
            }catch (Exception e){ // do not need a catch block
                System.out.println(e);
            }
            }
    }

