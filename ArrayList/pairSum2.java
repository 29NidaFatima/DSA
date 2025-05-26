
import java.util.ArrayList;

public class pairSum2 {
    public static boolean  pairSumTwo(ArrayList <Integer> list,int target){
        int n=list.size();
       
        int bp=-1;
        for (int i = 0; i < n; i++) {
            if (list.get(i)>list.get(i+1)) {
                bp=i;
            }
        }
         int left=bp+1;
        int right=bp;
while(left<right){
    // case1
    if (list.get(left)+list.get(right)==target) {
        return true;
    }
    else if(list.get(left)+list.get(right)<target){
        left=(left+1)%n;
    }else{
        right=(n+right-1)%n;
    }
}
return false;

    }
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        // 11,15,6,8,9,10  --- Sorted and Rotated Array
        list.add(11);
        list.add(15);
           list.add(6);
              list.add(8);
                 list.add(9);
                         list.add(10);
        
int target=16;
 int result= pairSumTwo(list,target);
         System.out.println("Pair with sum " + target + " exists: " + result);

        

    }
}
