class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        int totalRows   = matrix.length;
        int totalColumn = matrix[0].length;

        int newRows = totalColumn;
        int newColumns = totalRows;

        int [][]ans = new int [newRows][newColumns];
        for(int i = 0;i<totalRows;i++){
            for(int j = 0;j<totalColumn;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    } 
}