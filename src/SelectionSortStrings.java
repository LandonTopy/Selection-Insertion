import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortStrings {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();
        animals.addAll(Arrays.asList("Cat", "Dog", "Fish", "Cow"));


        for(int i = 0; i <animals.size(); i ++){
            int minIndex = i;
            for(int j = i + 1; j < animals.size(); j ++){
                if (animals.get(j).compareTo(animals.get(minIndex))<0){
                    minIndex = j;
                }
            }
            // Swaps values of i and minIndex
            String temp = animals.get(i);
            animals.set(i, animals.get(minIndex));
            animals.set(minIndex, temp);
            System.out.println(animals);
        }
    }
}