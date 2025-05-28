import java.util.ArrayList;

public class monotonicArrayList {

    // Brute Force Approach
    // public static boolean checkMonotonic(ArrayList <Integer> num){
    //     boolean isInc = true;
    //     boolean isDec = true;
    //     for (int i = 0; i < num.size(); i++) {
    //         for (int j = i+1; j <  num.size(); j++) {
    //             if (num.get(i) > num.get(j)) {
    //                 isInc = false;
    //             }
    //             if (num.get(i) < num.get(j)) {
    //                 isDec = false;
    //             }
    //         }
    //     }
    //     return isInc || isDec;
    // }

   // Better Approach
    public static boolean checkMonotonic(ArrayList <Integer> num){
        boolean isInc = true;
        boolean isDec = true;

        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i) > num.get(i + 1)) {
                isInc = false;
            }
            if (num.get(i) < num.get(i + 1)) {
                isDec = false; 
            }
        }

        return isInc || isDec;
    }

    

    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        System.out.println(checkMonotonic(num)); 
    }
}
