package collectionsReview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        //create hashmap
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");

        System.out.println(findFirstNonRepeating("Julia"));
    }

    public static Map<Character, Integer> findFirstNonRepeating(String str){
        Map<Character, Integer> nonRepeating = new HashMap<>();


        for(Character each: str.toCharArray()){

        }

        return nonRepeating;
    }
}
