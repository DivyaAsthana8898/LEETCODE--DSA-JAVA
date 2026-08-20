class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
    
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
              int age = 2 * arr[j];
                if(i != j && arr[i] == age ){
                    return(true);
                }
                   
                    }
                }
                return false;
               
            }
        }
    

             
