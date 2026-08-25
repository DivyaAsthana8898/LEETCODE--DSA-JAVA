import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length;
        int m = potions.length;

        int[] result = new int[n];

        // 1. Potions ko sort karo
        Arrays.sort(potions);

        // 2. Har spell ke liye binary search
        for (int i = 0; i < n; i++) {

            int start = 0;
            int end = m - 1;
            int ans = m;

            // Minimum potion chahiye jisse
            // spell * potion >= success
            long required = (success + spells[i] - 1) / spells[i];

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (potions[mid] >= required) {
                    ans = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // ans se end tak saare potions successful hain
            result[i] = m - ans;
        }

        return result;
    }
}