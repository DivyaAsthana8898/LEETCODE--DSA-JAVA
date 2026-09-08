class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        
        // int indexj = 0;
        int count = 0;
       // int []nums = Arrays.copyOf(g,g.length);
        //int n = nums.length;
         // for traversing over the Childrens greed.
        
           for(int i = 0;i<g.length;i++){
          while( index < s.length && g[i] > s[index] ){
            index++;
          }
            if (index < s.length && s[index] >= g[i]){
               
                index++;
                count++;

        }
    
        }
        return count;
        
    }
        
            
        }

    
