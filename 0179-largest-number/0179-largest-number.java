

class Solution {
public String largestNumber(int[] nums) {
String[] arr = new String[nums.length];

    for (int i = 0; i < nums.length; i++) {
        arr[i] = String.valueOf(nums[i]);
    }

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if ((arr[i] + arr[j]).compareTo(arr[j] + arr[i]) < 0) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    if (arr[0].equals("0")) {
        return "0";
    }

    String ans = "";
    for (int i = 0; i < arr.length; i++) {
        ans += arr[i];
    }

    return ans;
}

}
