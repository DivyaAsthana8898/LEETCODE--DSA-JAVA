class Solution {
    public int strStr(String haystack, String needle) {


        for(int i = 0;i<=haystack.length()-needle.length();i++){
           if(haystack.substring(i,i+needle.length()).equals(needle)){
            //Haystack ke index i se needle jitne characters hain, utne characters nikalo aur check karo kya woh needle ke equal hain.
           
            return i;
           }


        }
        return -1;
    }
}