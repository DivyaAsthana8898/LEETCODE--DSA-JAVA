class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3)return false;
        int i =0;// starting the array from zeroth index

        while(i+1 < n && arr[i] < arr[i+1]){// checking  that the currents  next element < no of el  & current element less then the next element while going up
            i++; //then move the pointer to the next
        }
        if(i==0 || i==n-1)return false;// if peak at start or at end return false;

        while(i+1 <n && arr[i] > arr[i+1]){//checking the that the current array < no of el & current element greater then the next element while going down
            i++;

        }
         return i== n-1;// returning the last value; 
         
    
    }
     
}
 

 
 

