public class PolymarfisamA {
    public static void main(String[] args) {

    }
    public void sum(int a,int b){
        int c;
        c=a+b;
        System.out.println("sum of numbers");
    }

    public void sum(int a,double b){
        double c;
        c=a+b;
        System.out.println("sum of numbers");
    }



    public void sum(int a,int b,int c){
        int d;
        d=a+b+c;

        System.out.println("sum of three numbers");
    }

    public void sum(int a,int b,int c, int d){
        int e;
        e=d+a+b+c;
        System.out.println("sum of three numbers");
    }

    public void empRegistration(String empName,int empId,String empAdd){
        System.out.println("employee name==" + empName);
        System.out.println("employee id==" +empId);
        System.out.println("employee address" + empAdd);
    }

    public void empRegistration(String empName,int empId,String empAdd, int phoneNumber){
        System.out.println("employee name==" + empName);
        System.out.println("employee id==" +empId);
        System.out.println("employee address" + empAdd);
    }

}
