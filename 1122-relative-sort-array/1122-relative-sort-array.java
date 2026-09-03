class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr1){
        map.put(num,map.getOrDefault(num,0)+1);
        }
         int index = 0;
         for(int num :arr2){
          if(map.containsKey(num)){////////// present   for one matching
            while(map.get(num)>0){// if freq > 0
            arr1[index] = num; // put the val in arr1
            index++;// move ;
            
            map.put(num,map.get(num)-1);// freq kam kro;

          }
          map.remove(num);
           }
         }
           // for remaning not matching values 
          for(int num = 0;num<= 1000;num++){
            if(map.containsKey(num)){
               while( map.get(num)>0){//// till the frequency is >0
                  arr1[index] = num; //// put the  value in arr1
                  index++;// move index ahead;
                  map.put(num,map.get(num)-1);//frequency kam kro ;
               }

            }
        
          }
         return arr1; 
     }   
}
  
    






