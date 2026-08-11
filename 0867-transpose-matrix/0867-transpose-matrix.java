class Solution {
    public int[][] transpose(int[][] matrix) {
        //  condition if matrix is emptty or null
        if(matrix == null || matrix.length == 0){
            return new int[0][0];


        }
         // original MATRIX
         int totalRows = matrix.length;
         int totalColumn = matrix[0].length;

         // new MATRIX been built WITH THIS ORDER R=C C=R
         int newTotalRows = totalColumn;
         int newTotalColumn = totalRows;
         int [][]ans = new int [newTotalRows][newTotalColumn];
         // actual logic 
                             // for traversing over prev matrix
         for(int i = 0; i<totalRows;i++ ){
            for(int j = 0;j<totalColumn;j++){

                // to pour the values of old matrix into new in transpose manner;
                ans[j][i] = matrix[i][j];
            }
         }
         return ans;
    }
}