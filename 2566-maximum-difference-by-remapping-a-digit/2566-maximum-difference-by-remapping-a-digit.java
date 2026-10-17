class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        char first = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                first = s.charAt(i);
                break;
            }
        }

        String max = s;
        if (first != ' ') {
            max = s.replace(first, '9');
        }

        char firstMin = s.charAt(0);
        String min = s.replace(firstMin, '0');

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}