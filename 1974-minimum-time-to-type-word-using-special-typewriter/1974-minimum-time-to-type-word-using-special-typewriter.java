class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char current = 'a';

        for (int i = 0; i < word.length(); i++) {
            int diff = Math.abs(word.charAt(i) - current);
            time += Math.min(diff, 26 - diff);
            time++;
            current = word.charAt(i);
        }

        return time;
    }
}