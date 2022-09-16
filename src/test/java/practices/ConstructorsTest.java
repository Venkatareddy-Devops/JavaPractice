package practices;

public class ConstructorsTest {

    public static void main(String[] args) {
        ConstructorsTest constructorsTest = new ConstructorsTest();
        ConstructorsTest costructorsstudent = new ConstructorsTest(20,"venku");
        ConstructorsTest constructorsemp =new ConstructorsTest(1204,"siva","vijayawada",99999999 );
        constructorsemp.testcon();


    }
    public ConstructorsTest(){
        System.out.println(" default constructors");
    }

    public ConstructorsTest(int studentid, String studentname){
        System.out.println("student details==" + studentid);
        System.out.println("student name=="+studentname);

    }
    public ConstructorsTest(int empid, String empname, String empadd,int phno){
        System.out.println("emp id"+empid);
        System.out.println("employee name=="+ empname);
        System.out.println("employee add=="+ empadd);
        System.out.println("employee phone no"+ phno);
    }
    public void testcon(){
        System.out.println("test method function");

    }

      }

