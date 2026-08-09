class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int startingRow = 0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        // row wise left to right moving from startingcol towards the ending column
          while(startingRow <= endingRow && startingCol <= endingCol){// INT COL = CONTAINS MOVING FROM
        for(int col = startingCol ; col<= endingCol ; col++){ 
            result.add(matrix[startingRow][col]); //1- col , is  changing as it is the order of traversal.   2- where we have to traverse and eliminate is fixed  and that will be the second entity.
          //  apart from for's first entity. 


        }
          startingRow++;
               // IMPORTANT CHECK
            if (startingRow > endingRow) {
                break;
            }
    
        //  col wise top to bottom  moving from startingRow towards endingRow
        for(int row = startingRow ; row<= endingRow ; row++){
            result.add(matrix[row][endingCol]);
        }
         endingCol--;
                 // CHECK COLUMN
            if(startingCol > endingCol){
                break;
            }

         // row wise right to left moving from ending col towards startingCol;
         for(int col = endingCol; col>=startingCol; col--){
            result.add(matrix[endingRow][col]);
         }
          endingRow--;// ELIMINATED VALUE;

                // col wise bottom to top moving from endingRow to startingRow;
                for(int row = endingRow; row>=startingRow;row--){
                    result.add(matrix[row][startingCol]);
                }
                 startingCol++;
          }
          return result;

        
    }
}