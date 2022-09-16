package practices;

public class ClassB {
    public static void main(String[] args){
        ClassB classB= new ClassB();
        classB.addition(5,6);
        classB.cashWithDraw();

    }
    public void addition(int a, int b){
        int d;
        d=a+b;
        System.out.println("sum of two variables  ====" + d);
    }

    public void cashWithDraw(){
        System.out.println("cash with draw");
    }





}
