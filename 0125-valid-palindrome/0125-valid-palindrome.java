class Solution {
    public boolean isPalindrome(String s) {
           String result = s.replaceAll("[^a-zA-Z0-9]", "");
         String word = result.toLowerCase();
        int left = 0;
        int right = word.length()-1;

        while(left < right ){
            if( word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}