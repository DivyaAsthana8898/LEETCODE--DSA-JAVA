class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int []sortedArray = new int[n];
         int i = 0;
         int count =  0;
        sortedArray = Arrays.copyOf(heights,heights.length);
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
