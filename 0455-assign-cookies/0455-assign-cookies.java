// class Solution {
    //public int findContentChildren(int[] g, int[] s) {
//         Arrays.sort(g);
//         Arrays.sort(s);
//         int count = 0;
//         int index = 0;
//         for(int i = 0;i<g.length;i++){
//         while( index < s.length && g[i] > s[index]){
//             index++;
//         }
//         if(index < s.length && s[index] >= g[i]){
//              count++;
//             index++;
          
//         }
//     }
//      return count;
// }
// }
//--------------------------------


class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // Children pointer
        int j = 0; // Cookies pointer

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // Child is satisfied
            }
            j++; // Move to the next cookie
        }

        return i;
    }
}