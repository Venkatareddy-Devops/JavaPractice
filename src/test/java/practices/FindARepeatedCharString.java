package practices;

public class FindARepeatedCharString {
    public static void main(String[] args) {
        String str= "Hello Java I Am Java Student";

        String st[] = str.split(" ");
        // System.out.println("print srt== "+ st[0]);

        for (int i=0; i<st.length; i++){
            for (int j=i+1; j<st.length; j++){

                if(st[i].equals(st[j])){
                    System.out.println("repete  "+  st[i]);
                }
            }
        }
    }
}

