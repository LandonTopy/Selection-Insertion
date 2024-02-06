import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.addAll(Arrays.asList(3,7,10,1,90,7,3,5,6,8,10));


        for(int i = 0; i <nums.size(); i ++){
            int minIndex = i;
            for(int j = i + 1; j < nums.size(); j ++){
                if (nums.get(j) < nums.get(minIndex)){
                    minIndex = j;
                }
            }
            // Swaps values of i and minIndex
            int temp = nums.get(i);
            nums.set(i, nums.get(minIndex));
            nums.set(minIndex, temp);
            System.out.println(nums);
        }
    }
}