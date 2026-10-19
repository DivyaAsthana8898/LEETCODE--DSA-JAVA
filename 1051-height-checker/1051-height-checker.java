class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int i = 0;
        int num = 0;
        int []sortedArray = new int[n];
        sortedArray = Arrays.copyOf(heights,heights.length);
        int count = 0;
        Arrays.sort(sortedArray);
        while( i < n){
            if(sortedArray[i] != heights[i]){
            count++;
            i++;
        }else{
            i++;
        }
    }
        return count;
        
    }
}
