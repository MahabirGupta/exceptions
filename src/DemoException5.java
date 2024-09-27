public class DemoException5 {

    public static void main(String[] args) {
        int i=5;
        if (i<10){
            try {
                throw new MyException("Error");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyException extends Exception{

    public MyException(String msg) {
            super(msg);
    }
}
