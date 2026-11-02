class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int addition = 0;

        for(char ch : s.toCharArray()){
            if( ch == '('){
                open++;
            }else {
                // if case of a closing bracket )
                if(open > 0){
                open--;
            }else{
            //  counting ) only closing brackets
            addition++;
        }
    }
        }
       int finalAns = open + addition;
       return finalAns;

}
}