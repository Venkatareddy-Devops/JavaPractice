public class FirstTest {
    public int c;

    public static void main(String[] args){


        FirstTest firstTest = new FirstTest();
        firstTest.sum();
        firstTest.sub();
        firstTest.mul();
        firstTest.totalValue();

        double f;
        f = firstTest.sum() + firstTest.totalValue();
        System.out.println("f === " + f);

        firstTest.addition(12, 12);


        firstTest.addition(1500, 754);
    }

    public void addition(int a, int b){
        int d;
        d = a + b;

        System.out.println("addition of two varibles === " + d);

    }
    public double totalValue(){
        int a= 5;
        double b = 10.6, c= 20.7, d;
        d = a+ b+ c;
        System.out.println("d === " + d);
        return  d;
    }
    public int sum(){
        int a=5, b=5, c;
        c = a+b;
        System.out.println("c === " + c);
        return c;
    }

    public void sub(){
        int a=10, b=5, c;
        c = a-b;
        System.out.println("c === " + c);
    }
    public void mul(){
        int  a=9, b=5, c;
        c = a*b;
        System.out.println("c  ==  " + c);
    }
}
