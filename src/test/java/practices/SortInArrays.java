package practices;

import java.util.Arrays;

public class SortInArrays {
    public static void main(String[] args) {

        String test = "testing";
        char vr[] = test.toCharArray();
        Arrays.sort(vr);
        for (int i=0; i<=vr.length; i++){
            System.out.println(vr[i]);
        }
    }
}
