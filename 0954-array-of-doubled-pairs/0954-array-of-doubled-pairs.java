
class Solution {
    public boolean canReorderDoubled(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // frequency count
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // absolute value ke according sort
        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        Arrays.sort(nums, (a, b) ->
            Integer.compare(Math.abs(a), Math.abs(b))
        );

        for (int num : nums) {

            if (map.get(num) == 0) {
                continue;
            }

            int doubleNum = num * 2;

            if (map.getOrDefault(doubleNum, 0) == 0) {
                return false;
            }

            map.put(num, map.get(num) - 1);
            map.put(doubleNum, map.get(doubleNum) - 1);
        }

        return true;
    }
}
