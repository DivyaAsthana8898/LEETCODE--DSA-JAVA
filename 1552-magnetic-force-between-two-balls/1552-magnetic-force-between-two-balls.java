class Solution {

    static boolean isValidAnswer(int[] position, int m, int minDistance) {

        int ballCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < position.length; i++) {

            if (position[i] - position[lastPosition] >= minDistance) {

                ballCount++;
                lastPosition = i;

                if (ballCount == m) {
                    return true;
                }
            }
        }

        return false;
    }

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int start = 0;
        int end = position[position.length - 1] - position[0];
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValidAnswer(position, m, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}