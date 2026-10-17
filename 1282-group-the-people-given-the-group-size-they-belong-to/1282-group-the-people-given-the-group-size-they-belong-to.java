class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];

            if (!map.containsKey(size)) {
                map.put(size, new ArrayList<>());
            }

            List<Integer> people = map.get(size);
            people.add(i);

            if (people.size() == size) {
                ans.add(new ArrayList<>(people));
                people.clear();
            }
        }

        return ans;
    }
}