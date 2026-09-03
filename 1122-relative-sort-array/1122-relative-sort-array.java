class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // frequency of arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // arr2 ke order me
        for (int num : arr2) {
            while (map.get(num) > 0) {
                arr1[index++] = num;
                map.put(num, map.get(num) - 1);
            }
            map.remove(num);
        }

        // remaining elements ascending order
        for (int num = 0; num <= 1000; num++) {
            if (map.containsKey(num)) {
                while (map.get(num) > 0) {
                    arr1[index++] = num;
                    map.put(num, map.get(num) - 1);
                }
            }
        }

        return arr1;
    }
}