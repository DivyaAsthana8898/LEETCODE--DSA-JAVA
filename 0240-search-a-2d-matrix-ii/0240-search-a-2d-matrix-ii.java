class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalColumn = matrix[0].length;


        // setting pointers
        int row = 0;
        int col = totalColumn-1;//col pointer starting from the end pos;

        while(row < totalRow && col >= 0){
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
            return false;

    }
   
}
