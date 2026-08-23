class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();


        for(int i = 0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ;j<=i;j++){
                // handling 1st and last indexes
                if(j == 0 || j==i){
                    row.add(1);
                }
                else{ // handling middle indexes
                    int value = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    row.add(value);
                }
            }
            ans.add(row);

        }
        return ans;
    }
}