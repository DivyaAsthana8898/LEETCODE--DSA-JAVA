class Solution {
    public int maximum69Number (int num) {
         String s = String.valueOf(num);
         char []ans = s.toCharArray();

         for(int i = 0;i<ans.length;i++){
            if(ans[i] == '6'){
                ans[i] = '9';
                break;
            }

         }
         return Integer.parseInt(String.valueOf(ans));
    }
}