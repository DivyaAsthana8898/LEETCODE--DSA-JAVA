class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
          String str1 = String.join("" , word1);
          String str2 = String.join("", word2);


       if(str1.equals(str2)){
        return true;
       }
       return false;
    }
}
    
  

