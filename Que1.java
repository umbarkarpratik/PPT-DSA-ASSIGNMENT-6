package PrePlacementTraning.DSaAssingnment6;

import java.util.ArrayList;
import java.util.List;

public class Que1 {
    public static int[] reconstructPermutation(String s) {
        int n = s.length();
        List<Integer> perm = new ArrayList<>();
        int low = 0;
        int high = n;

        for (char c : s.toCharArray()) {
            if (c == 'I') {
                perm.add(low);
                low++;
            } else if (c == 'D') {
                perm.add(high);
                high--;
            }
        }

        perm.add(low);

        int[] result = new int[n + 1];
        for (int i = 0; i < perm.size(); i++) {
            result[i] = perm.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] result = reconstructPermutation(s);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
