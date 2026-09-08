class Solution {
    public int maximumSum(int[] arr) {
        int no_deletion=arr[0];
        int one_deletion=arr[0];
        int ans=arr[0];
        for(int i=1; i<arr.length; i++){
            int prev_no_deletion=no_deletion;
            no_deletion=Math.max(no_deletion+arr[i], arr[i]);
            one_deletion=Math.max(one_deletion+arr[i], prev_no_deletion);
            ans=Math.max(ans, Math.max(no_deletion, one_deletion));
        }
        return ans;
    }
}