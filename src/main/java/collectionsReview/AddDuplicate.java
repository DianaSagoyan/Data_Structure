package collectionsReview;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddDuplicate {
    public static void main(String[] args) {
        String str = "Java Developer";

        Set<Character> result = new LinkedHashSet<>(); //space complexity of O(n)
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if(!result.add(str.charAt(i))){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
