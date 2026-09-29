class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] count = new int[n + 1];

        for (int[] t : trust) {
            count[t[0]]--;  // jo trust kar raha hai, woh judge nahi
            count[t[1]]++;  // jisko trust kiya gaya, uska trust count +1
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}