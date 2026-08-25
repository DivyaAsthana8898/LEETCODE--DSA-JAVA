

class Solution {

    static int getFirstZeroIndex(int[] row) {

        int totalCol = row.length;

        int start = 0;
        int end = totalCol - 1;
        int ans = totalCol;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (row[mid] == 0) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public int[] rowAndMaximumOnes(int[][] mat) {

        int totalRow = mat.length;

        int maxRowWaliIndex = 0;
        int maxi = 0;

        for (int row = 0; row < totalRow; row++) {

            // Making a sorted copy (ascending), then reverse it,
        
            // binary search actually needs to work correctly.
            int[] sortedRow = mat[row].clone();
            Arrays.sort(sortedRow);
            reverse(sortedRow);

            int firstZeroIndex = getFirstZeroIndex(sortedRow);

            // First zero index = number of 1s
            int onesCount = firstZeroIndex;

            // > keeps the first row in case of a tie
            if (onesCount > maxi) {
                maxi = onesCount;
                maxRowWaliIndex = row;
            }
        }

        return new int[] { maxRowWaliIndex, maxi };
    }
}