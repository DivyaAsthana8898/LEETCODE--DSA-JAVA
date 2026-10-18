class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {// TAKING OUT THE SUM OF DIGITS
                sum += num % 10;// 
                num = num / 10;
            
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        int maxSize = 0;

        for (int count : map.values()) {// PASSING SUM OF DIGITS THE LARGEST WILL BE THE MAXSIZE
            maxSize = Math.max(maxSize, count);
        }

        int ans = 0;

        for (int count : map.values()) {// COUNTING MAXSIZE 
            if (count == maxSize) {
                ans++;
            }
        }

        return ans;
    }
}