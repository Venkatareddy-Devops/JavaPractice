package practices;

import com.sun.source.tree.CatchTree;

public class ArthameticExceptionTest {
    public static void main(String[] args) {
        int a, b, c=0;
        a = 5;
        b = 0;
        try {


            c = a / b;
        }
        catch (ArithmeticException ae){
            System.out.println("catchtest");
            c = a+b;

        }
        finally {
            System.out.println("finally block exception");
        }

    }
}
