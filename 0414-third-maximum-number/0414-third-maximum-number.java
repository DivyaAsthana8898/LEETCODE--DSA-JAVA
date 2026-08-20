class Solution {
    public int thirdMax(int[] arr) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for (int num : arr) {
            if (num == max || num == smax || num == tmax) continue; // skip duplicates

            if (num > max) {
                tmax = smax;
                smax = max;
                max = num;
            }else if (num > smax) {
                tmax = smax;
                smax = num;
            } else if (num > tmax) {
                tmax = num;
            }
        }

        // if third max doesn't exist, return the max
        if (tmax == Long.MIN_VALUE) return (int) max;
        return (int) tmax;
    }
}
