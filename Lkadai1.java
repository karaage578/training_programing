// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// If you want to check, copy the data in the following 【】 to test-input.txt
// 【[3,1,2,5,4]】

class Solution {
    public int solution(int[] A) {
        // write your code in Java 8
        if (A.length < 3){
            return -1;
        };
        Arrays.sort(A);
        return A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
    }
}
