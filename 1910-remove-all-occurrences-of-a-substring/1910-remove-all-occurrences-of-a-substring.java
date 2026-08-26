class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int index = s.indexOf(part);// tells the starting index of part
             s = s.substring(0,index) + s.substring(index + part.length());
          
        }
        return s;

    }
}