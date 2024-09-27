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

        int[] a = new int[4];
        try {
            for (int c=0; c<=4; c++){
                a[c] =c+1;
            }
            for (int value:a) {
                System.out.println(value);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
            System.out.println("Array out of bounds");
        }catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Unknown exception");
        }
    }
}
