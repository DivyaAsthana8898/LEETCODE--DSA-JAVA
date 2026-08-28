class Solution {
    public boolean detectCapitalUse(String word) {

        // Case 1: ALL uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Case 2: all lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Case 3: First uppercase, rest lowercase
        if (Character.isUpperCase(word.charAt(0))) {

            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }
}