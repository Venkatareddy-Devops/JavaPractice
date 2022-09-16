package practices;

public class TypesOfException {
    public static void main(String[] args) {

        int a;

        try{
             a=5/5;
             System.out.println("try block exception ");

        }
        catch (Exception exception){
            exception.printStackTrace();
            System.out.println("catch block exception ");
        }
        finally {
            System.out.println("finally exeption handle");

        }


    }
}
