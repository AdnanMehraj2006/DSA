class Solution {
    public boolean check(int[] arr, long k, int mid){
        long count=0;
        for(int i=0; i<arr.length; i++){
            count+=arr[i]/mid;
        }
        if(count>=k){
            return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        int res=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) max=Math.max(max, candies[i]);
        int low=1, high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(candies, k, mid)){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna