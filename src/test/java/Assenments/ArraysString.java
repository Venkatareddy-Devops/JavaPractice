package Assenments;

public class ArraysString {
    public static void main(String[] args) {

        int a[] = {2343, 44, 55, 322, 4445, 4553,};

        System.out.println(a[5]);

        for (int v = 0; v <= 4; v++) {

            System.out.println(a[v]);

        }
        for (int v=0; v>=a.length-1; v++){


            System.out.println(a[v]);
        }
        /*for (int v=a.length-1; v<=0; v++){
            System.out.println(a[v]);
        }*/

    }
}