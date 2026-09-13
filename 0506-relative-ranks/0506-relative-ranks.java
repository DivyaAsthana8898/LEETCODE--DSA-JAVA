class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];

        Integer[] index = new Integer[n];

        // Original indexes store kar rahe hain
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        // Scores ke basis par indexes ko descending order me sort
        Arrays.sort(index, (a, b) -> score[b] - score[a]);

        // Rank assign
        for (int rank = 0; rank < n; rank++) {

            int originalIndex = index[rank];

            if (rank == 0) {
                ans[originalIndex] = "Gold Medal";
            }
            else if (rank == 1) {
                ans[originalIndex] = "Silver Medal";
            }
            else if (rank == 2) {
                ans[originalIndex] = "Bronze Medal";
            }
            else {
                ans[originalIndex] = String.valueOf(rank + 1);
            }
        }

        return ans;
    }
}