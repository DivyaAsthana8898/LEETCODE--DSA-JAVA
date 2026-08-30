class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        int flower = n;

        if(flower==0){
            return true;
        }

        for(int i = 0;i<m;i++){
            if(flowerbed[i] == 1){
                i++;
            }
          else  if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) &&( i==m-1|| flowerbed[i+1] == 0)){
          flowerbed[i] = 1;
          flower--;
          i++;
        }else{
            continue;
        }
         if(flower==0){
            return true;
        }

    }
        return false;
    }

}