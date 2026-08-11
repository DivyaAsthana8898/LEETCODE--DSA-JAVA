class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int max = 0;// max is ac
         // traversing to find max 
        for(int i = 0;i < n; i++){// this is been used to find the max value ;
        if(candies[i] >= max ){
            max = candies[i]; //replace candies[i] which is max with max;

          }
        }
        // now traversing to check every children
         for( int i = 0; i<n;i++  ){
            if(candies[i] + extraCandies >= max){
                result.add(true);
                    }else{
                        result.add(false);
                    }
                }
                return result;
            }
         }

        
    
