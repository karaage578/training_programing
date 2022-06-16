
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// If you want to check, copy the data in the following 【】 to test-input.txt
// 【"foobarbaz"】

class Solution {
    public int solution(String S) {
        // write your code in Java 8
        char[] slist = S.toCharArray();
        List<String> duplicateList = new ArrayList<>();
        for (char s: slist) {
            if (duplicateList.contains(String.valueOf(s))) {
                continue;
            }
            boolean isDuplicate = false;
            int duplicateCount = 0;
            for (char a: slist) {
                if (s == a) {
                    duplicateCount++;
                }
            }
            if(duplicateCount > 1){
                duplicateList.add(String.valueOf(s));
            }
        }
        return duplicateList.size();
    }
}
