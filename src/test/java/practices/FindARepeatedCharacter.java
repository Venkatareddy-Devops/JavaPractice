package practices;

public class FindARepeatedCharacter {
    public static void main(String[] args) {

        String vr = "venkatareddy";
        char wr[] = vr.toCharArray();


        for (int i = 0; i < wr.length; i++) {
            for (int j = i+1; j <wr.length; j++) {
                if (wr[j] == wr[i]) {
                    System.out.println("character==" + wr[i]);

                }
            }
        }

    }
}