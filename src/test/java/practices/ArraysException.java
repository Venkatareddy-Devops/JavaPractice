package practices;

public class ArraysException {

    public int a=5;
    public static int b=10;

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        try {
            int a[]= {1,2,3,4,};
            System.out.println(a[3]);
        }
        catch (ArrayIndexOutOfBoundsException indexOutOfBoundsException){

            indexOutOfBoundsException.printStackTrace();



        }
    }
}
