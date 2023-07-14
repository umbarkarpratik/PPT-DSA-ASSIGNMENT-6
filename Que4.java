package PrePlacementTraning.DSaAssingnment6;

import java.util.HashMap;
import java.util.Map;

public class Que4 {
    public static int findMaxLength(int[] nums) {
        int maxLen = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if (countMap.containsKey(count)) {
                maxLen = Math.max(maxLen, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        int maxLen = findMaxLength(nums);
        System.out.println(maxLen); // Output: 2
    }
}

