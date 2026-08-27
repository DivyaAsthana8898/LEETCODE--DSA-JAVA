class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> start=new HashSet<>();
        for(List<String> s:paths){
            start.add(s.get(0));
        }
        for(List<String> c:paths){
            String dest=c.get(1);
            if(!start.contains(dest)) return dest;
        }
        return "";
            }
}