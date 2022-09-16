public class ArraysInString {
    public static void main(String[] args) {

        int a[] = {234,456,678,788,987,894};

         System.out.println(a[4]);

         for (int v=0; v<=5; v++) {
             System.out.println(v);
         }


        System.out.println("******************************************************************************");
         for (int v=5; v>=0; v--){
             System.out.println(v);
         }

        System.out.println("******************************************************************************");

         for (int v=0; v<a.length; v++){
             System.out.println(a[v]);

         }
         System.out.println("******************************************************************************");

         for (int v=a.length-1; v>0; v-- ){
             System.out.println(a[v]);
         }

    }

}
