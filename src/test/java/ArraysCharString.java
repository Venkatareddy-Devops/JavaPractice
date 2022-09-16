public class ArraysCharString {

    public static void main(String[] args) {
        char a[] = {'v', 's', 'r', 'a', 'z'};
          System.out.println(a[4]);

          System.out.println(a.length);
          for (int v=0; v<=a.length-1; v++){
              System.out.println(a[v]);
          }

          for (int v=a.length-1; v>=0; v--){
              System.out.println(a[v]);
          }



    }


}