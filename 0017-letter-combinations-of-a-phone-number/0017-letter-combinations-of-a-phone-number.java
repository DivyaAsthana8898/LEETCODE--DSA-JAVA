class Solution {
    // preparing base condition 
    static  void solve(String digits,String[] mapping,ArrayList<String> result,StringBuilder output,int index){
        // preparing base case ;
         if(index >= digits.length()){
            result.add(output.toString());
            return; 
        }

          // string to int conversion;
          int value = digits.charAt(index) - '0';// if array digits[index]
          String mappedString = mapping[value];// 5=> "j" 


          for(int i = 0;i<mappedString.length();i++){
            output.append(mappedString.charAt(i));// ek character pkadaya ex => "j"

            // baki ab age ka recursion 
            solve(digits,mapping,result,output,index+1); // now "k" pkdaya => then recursion m,n ,o wli condition dekhega
            // baqcktracking
            output.deleteCharAt(output.length()-1);

          } 
    }
   
    public List<String> letterCombinations(String digits) {
        String [] mapping  = {" "," ", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> result = new ArrayList<>();
        int index = 0;
        StringBuilder output  = new StringBuilder();
        solve(digits,mapping,result,output,index);
        return result;

    }
}