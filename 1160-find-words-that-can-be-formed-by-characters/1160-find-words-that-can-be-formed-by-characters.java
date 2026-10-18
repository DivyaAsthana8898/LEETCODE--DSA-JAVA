class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];

        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;// incrementing particular characters count;
            
        }

        int ans = 0;

        for (String word : words) {
            int[] count = freq.clone();
            boolean valid = true;

            for (char c : word.toCharArray()) {
                if (count[c - 'a'] == 0) {
                    valid = false;
                    break;
                }
                count[c - 'a']--;// dec the count;
            }

            if (valid) {
                ans += word.length();
            }
        }

        return ans;
    }
}