class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startIndex = 0;

        for(int i = 0; i<gas.length;i++){
            int net = gas[i] - cost[i];
            totalGas = totalGas + net ;
            currentGas = currentGas + net;


              if(currentGas < 0){
                 startIndex = i + 1;
                currentGas = 0;
              }
    }
     return totalGas >= 0 ? startIndex : -1;
    }
}
