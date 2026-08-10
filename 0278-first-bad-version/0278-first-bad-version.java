/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int start = 1;
        int end  = n;
        int ans = n;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                 ans = mid;
               // Applying the concepts of lower bound as in q first bad version is been called so LB.
                    end = mid - 1;

            }
             else {
                start = mid + 1;
             }
        }
        return ans;

    }
}