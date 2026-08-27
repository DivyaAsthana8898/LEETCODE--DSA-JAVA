class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int start = 0;
        int end = 0;

        // Find minimum and maximum possible capacity
        for (int weight : weights) {
            start = Math.max(start, weight);
            end += weight;
        }

        // Binary Search on answer
        while (start < end) {

            int mid = start + (end - start) / 2;

            int day = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight > mid) {
                    day++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            // Capacity mid is enough
            if (day <= days) {
                end = mid;
            }
            // Capacity mid is not enough
            else {
                start = mid + 1;
            }
        }

        return start;
    }
}