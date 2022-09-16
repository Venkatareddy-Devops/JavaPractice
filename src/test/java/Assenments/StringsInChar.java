package Assenments;

public class StringsInChar {
    public static void main(String[] args) {

        String psr = "venkatareddyy";
        char vr[] = psr.toCharArray();

        for (int i = 0; i < vr.length; i++) {

            for (int j =i+1; j <vr.length; j++) {

                if (vr[j] == vr[i]) {

                    System.out.println("repeated in name ==" + vr[i]);
                }
            }
        }
    }
}