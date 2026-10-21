
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return word;
        }

        int left = 0;
        int right = index;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
