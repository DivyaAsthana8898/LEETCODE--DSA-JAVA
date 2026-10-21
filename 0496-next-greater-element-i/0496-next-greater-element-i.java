class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[]result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i>=0;i--){
           
                while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i] = -1;
                }else{
                    result[i] = stack.peek();
                }
                stack.push(nums2[i]);
            }
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums2.length ;i++){
            map.put(nums2[i] , result[i]);    
        }
         int []answer = new int[nums1.length];
         for(int i = 0;i < nums1.length;i++){
            answer[i] = map.get(nums1[i]);
         }
         return answer;

    }
}