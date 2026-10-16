
class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;
             // moving from left to right 
        for(int i = 0; i < n; i++) {
            // comparing  others with 0 th index house
            if(colors[i] != colors[0]) {
                max = Math.max(max, i);
            }
                 // comparing  others with last indexth house
            if(colors[i] != colors[n - 1]) {
                max = Math.max(max, (n - 1) - i);//return maxi
            }
        }

        return max;
    }
}