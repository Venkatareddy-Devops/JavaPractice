package practices;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnderstandingArraysList {
    public static void main(String[] args) {
        UnderstandingArraysList arraysList = new UnderstandingArraysList();
        arraysList.arrayListWithString();
        arraysList.HashSetWithSring();

    }
public void arrayListWithOutDataType(){
        List list = new ArrayList();
        list.add("selenium");
        list.add('s');
        list.add(12);
        System.out.println("list "+ list);


}



public void arrayListWithString(){
    List<String> array1 = new ArrayList<>();

    array1.add("selenium");
    array1.add("ampaium");
    array1.add("proctractor");
    array1.add("playwright");
    array1.add("webdriver");
    System.out.println("arraylist");
  System.out.println("arrayslist"+ array1);

}
public void HashSetWithSring(){
Set<String> array1= new HashSet<>();
 array1.add("selenium");
array1.add("ampium");
array1.add("playwright");
array1.add("selenium");
array1.add("webdriver");
array1.add("proctractor");
System.out.println("hash list"+array1);

}
}