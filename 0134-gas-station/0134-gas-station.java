class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int net = gas[i] - cost[i];
            totalGas += net;
            currentGas += net;

            // If accumulated gas drops below 0, reset start to next station
            if (currentGas < 0) {
                startIndex = i + 1;
                currentGas = 0;
            }
        }

        // If total gas across all stations is negative, full circuit is impossible
        return totalGas >= 0 ? startIndex : -1;
    }
}