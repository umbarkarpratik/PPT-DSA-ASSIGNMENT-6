package PrePlacementTraning.DSaAssingnment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Que6 {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        int n = changed.length;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : changed) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);
        List<Integer> original = new ArrayList<>();

        for (int num : changed) {
            if (frequency.get(num) > 0) {
                if (frequency.getOrDefault(num * 2, 0) > 0) {
                    original.add(num);
                    frequency.put(num, frequency.get(num) - 1);
                    frequency.put(num * 2, frequency.get(num * 2) - 1);
                } else {
                    return new int[0];
                }
            }
        }

        int[] result = new int[original.size()];
        for (int i = 0; i < original.size(); i++) {
            result[i] = original.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original)); // Output: [1, 3, 4]
    }
}
