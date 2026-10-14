class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int start = 0;
        int end = s.length();
        int []ans = new int[n+1];

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'I'){
                ans[i] =  start;
                start++;
            
            }else{
                ans[i] = end;
                end--;
            }
        }
        ans[n] = start;
        return ans;
    }
}