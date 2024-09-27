public class DemoException {

    public static void main(String[] args) {
        int i,j,k=0;
        i=8;
        j=0;
        try {

            k = i / j;
        }
//        }catch (Exception exception){ // unchecked exception
//            System.out.println("Cannot divide by zero");
//
//        }
        catch (ArithmeticException exception){ // unchecked exception
            System.out.println("Cannot divide by zero " + exception);

        }
        System.out.println(k);
    }
}
