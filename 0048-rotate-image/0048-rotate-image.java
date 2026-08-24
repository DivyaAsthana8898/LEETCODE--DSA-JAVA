class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        // transposing
        // with diagonal technique
         
        for(int i = 0;i<N ; i++){
            for(int j = i+1;j<N;j++){
                // now swaping;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                // transposing been done;

            }// now reversing
        }
             for(int row = 0;row < N ; row++ ){
            int startCol = 0;
            int endCol = N-1;
            while(startCol <= endCol){// CONDITION
                //reversing the first and the last column 
            int temp = matrix[row][startCol];
            matrix[row][startCol] = matrix[row][endCol];
            matrix[row][endCol] = temp;
            
            startCol++;
            endCol--;


             }
             
        }
    }
    }

    
