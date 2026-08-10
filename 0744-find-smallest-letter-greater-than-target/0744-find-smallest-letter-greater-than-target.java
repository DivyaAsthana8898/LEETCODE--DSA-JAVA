class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0;
        int upper = n;
        int end = n -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] > target){// using upper bound concept as greater then target asked.
                upper = mid;
                end = mid -1;

            }
            else{
                start = mid + 1;

            }
             
        }// check in case target not prsent
        // // If no letter is greater than target,
        // wrap around to the first letter
         if(upper == n){
            return letters[0];
         }
         return letters[upper];
    }
}