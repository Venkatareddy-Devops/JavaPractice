public class MainClassPractese {
    public static void main(String[] args) {
        MainClassPractese mainclasspractese= new MainClassPractese();
        mainclasspractese.add(55, 4444, 33);
        mainclasspractese.sub(44,444,999);
        mainclasspractese.mul(455,33,444);
        mainclasspractese.div(555,333);
    }
    public void add(int a,int b, int c){
        int d;
        d =a+b+c;
        System.out.println("addition of three numbers" + d);
    }
    public void sub(int a,int b,int c){
        int d;
        d=a-b-c;
        System.out.println("subStraction of three no ++ " + d);
    }
    public void mul(int aValue, int bValue,int cValue){
        int dValue;
        dValue=aValue*bValue*cValue;
        System.out.println("multiplication of some numbers ==" + dValue);
    }
    public void div(int aValue,int bValue){
        int cValue;
        cValue=aValue/bValue;
        System.out.println("multiplication of two numbers == " + cValue);
    }
}
