public class EmployeeRegistration {
    public int e = 20,d= 30;

    public static void main(String[] args) {
        EmployeeRegistration employeeRegistration= new EmployeeRegistration();
        employeeRegistration.employeeName();
        employeeRegistration.employeeId();
        employeeRegistration.employeeDob();
        employeeRegistration.employeeAdd();
        employeeRegistration.employeeExperence();
        employeeRegistration.employeePastCompany();
        employeeRegistration.employeeBloodGroup();

        employeeRegistration.add();
        employeeRegistration.sum(77,23);
        employeeRegistration.total(employeeRegistration.e, employeeRegistration.d);
    }

    public void add(){
        int a=6, b=7,c;
        c = a+b;
        System.out.println("c value == " + c);
    }

    public void sum(int a, int b){
        int c;
        c = a+b;

        System.out.println("c value == " + c);
        //System.out.println("sum of a & b  == " + (a+b) );
    }

    public void total(int aValue, int bValue){
        int c;
        c = aValue+bValue;

        System.out.println("c value == " + c);

    }


    public void employeeName(){
        System.out.println("employee name");
    }
    public void employeeId(){
        System.out.println("employee id no");
    }
    public void employeeDob(){
        System.out.println("date of birth");
    }
    public void employeeAdd(){
        System.out.println("employee address");
    }
    public void employeeExperence(){
        System.out.println("emp experence");
    }
    public void employeePastCompany(){
        System.out.println("company name");
    }
    public void employeeBloodGroup(){
        System.out.println("blood group");
    }
    public void employeetech(){
        System.out.println("employee techonology");
    }

}
