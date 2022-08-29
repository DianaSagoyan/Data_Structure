package collectionsReview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int targetValue = 9;

        System.out.println(Arrays.toString(twoSumOptimalSolution(arr, targetValue)));
    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue - array[i];
            if(map.containsKey(potentialMatch)){
                return new int[]{i, map.get(potentialMatch)};
            }else {
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }
}
