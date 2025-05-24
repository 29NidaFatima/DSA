
import java.util.ArrayList;
import java.util.Collections;

public class basic {

    public static void main(String[] args) {
        // Syntax of ArrayList
        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        //   Operations on  ArrayList
        //add Operations
        list0.add(1);
        list0.add(2);
        list0.add(3);
        list0.add(4);
        list0.add(5);
        System.out.println(list0);
        // get Operations
        int element = list0.get(2);
        System.out.println("element with index 2 is:" + element);
        // remove Operations
        list0.remove(2);
        System.out.println(list0);
        //set element at index
        list0.set(2, 10);
        System.out.println(list0);
        //  contains Operations
        System.out.println(list0.contains(1));
        System.out.println(list0.contains(11));
        System.out.println(list0.contains(3));
        System.out.println(list0.contains(10));
        //how we can find the size of ArrayList
        System.out.println(list0.size());
        // print the ArrayList
        for (int i = 0; i < list0.size(); i++) {
            System.out.print(list0.get(i)+" ");
        }
        System.out.println();
        //sort an AL
        Collections.sort(list0); //ascending is by default
System.out.println(list0);
// descending
 Collections.sort(list0,Collections.reverseOrder());
 System.out.println(list0);
    }
}
