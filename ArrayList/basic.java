
import java.util.ArrayList;

public class basic {

    public static void main(String[] args) {
//         // Syntax of ArrayList
//         ArrayList<Integer> list0 = new ArrayList<>();
//         ArrayList<String> list1 = new ArrayList<>();
//         ArrayList<Boolean> list2 = new ArrayList<>();
//         //   Operations on  ArrayList
//         //add Operations
//         list0.add(1);
//         list0.add(2);
//         list0.add(3);
//         list0.add(4);
//         list0.add(5);
//         System.out.println(list0);
//         // get Operations
//         int element = list0.get(2);
//         System.out.println("element with index 2 is:" + element);
//         // remove Operations
//         list0.remove(2);
//         System.out.println(list0);
//         //set element at index
//         list0.set(2, 10);
//         System.out.println(list0);
//         //  contains Operations
//         System.out.println(list0.contains(1));
//         System.out.println(list0.contains(11));
//         System.out.println(list0.contains(3));
//         System.out.println(list0.contains(10));
//         //how we can find the size of ArrayList
//         System.out.println(list0.size());
//         // print the ArrayList
//         for (int i = 0; i < list0.size(); i++) {
//             System.out.print(list0.get(i)+" ");
//         }
//         System.out.println();
//         //sort an AL
//         Collections.sort(list0); //ascending is by default
// System.out.println(list0);
// // descending
//  Collections.sort(list0,Collections.reverseOrder());
//  System.out.println(list0);
// // 2D-AL
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         mainList.add(list);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(2);
//         list2.add(4);
//         list2.add(6);
//         list2.add(8);
//         list2.add(10);
//         mainList.add(list2);
//         ArrayList<Integer> list3 = new ArrayList<>();
//         list3.add(3);
//         list3.add(6);
//         list3.add(9);
//         list3.add(12);
//         list3.add(15);
//         mainList.add(list3);
//         System.out.println(mainList);
//         //Another way
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i<=5; i++) {
            list1.add(i*1);
              list2.add(i*2);
              list3.add(i*3);
        }
        mainList.add(list1);
         mainList.add(list2);
          mainList.add(list3);
          System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList <Integer> currList= mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j));
            }
            System.out.println();
            
        }
    }
}
