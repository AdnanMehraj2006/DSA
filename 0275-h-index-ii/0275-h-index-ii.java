class Solution {
    public int hIndex(int[] citations) {
       int n=citations.length;
       if(n==0) return -1;
       int low=0, high=n-1;
       int ans=0;
       while(low<=high){
            int mid=low+(high-low)/2;
            int papers=n-mid;
            if(citations[mid]>=papers){
                ans=n-mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna