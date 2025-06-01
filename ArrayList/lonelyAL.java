
import java.util.ArrayList;
import java.util.HashMap;

public class lonelyAL {

    public static ArrayList<Integer> isLonely(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem : nums) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int elem : nums) {
            if (map.get(elem) > 1 || map.containsKey(elem - 1) || map.containsKey(elem + 1)) {
                continue;
            }
            list.add(elem);
        }
        return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(isLonely(nums));
    }
}
