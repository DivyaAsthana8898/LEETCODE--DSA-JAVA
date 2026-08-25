class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int b : bills){
            if(b == 5){
                five++;
            }else if(b == 10){
                if(five == 0)return false;
                    five--;
                    ten++;
            }
             else if(b == 20){
                if(five> 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five>=3){
                    five -= 3;
                }else{
                    return false;// 20 ka change nahi de paaye
                }
             }else{
             return false;//bill ₹5, ₹10, ₹20 mein se nahi hai
        }
        }
        return true;
    }
}