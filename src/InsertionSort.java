import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.addAll(Arrays.asList(3,7,10,1,90,7,3,5,6,8,10));


        for(int i = 1; i <nums.size(); i ++){
            int current = nums.remove(i);
            int place = i;

            while(place > 0 && current < nums.get(place-1)){
                place--;
            }
            nums.add(place,current);
            System.out.println(nums);
        }
    }
}
