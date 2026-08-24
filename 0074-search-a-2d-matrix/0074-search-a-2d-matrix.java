class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
        int totalRow = matrix.length;
        int totalColumn = matrix[0].length;

         int n = totalRow * totalColumn;
         int start = 0;
         int end = n - 1;
         while(start<= end){
            int mid = start + (end - start)/2;
            int rowIndex = mid / totalColumn;// formulae only applicable if prevlast el is less then current
            int colIndex = mid % totalColumn;// formulae
            
            if(matrix[ rowIndex][colIndex] == target){
                return true;
            }
            if(matrix[ rowIndex][colIndex] < target){
                start = mid + 1;

            }
            else{
                end = mid -1;
            }

         }
         return false;
    }
}