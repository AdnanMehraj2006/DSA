class Solution {
    public boolean result(int[] arr, int d, int mid){
        int count=1;//always day 1 as per constraints
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > mid) {
                return false;
            }
            if(sum+arr[i]>mid){
                count++;
                sum=0;
            }
            sum+=arr[i];
            if(count>d){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        if(n==0) return -1;
        int res=-1;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int val : weights){
            max=Math.max(max, val);
            sum+=val;
        }
        int low=max, high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(result(weights, days, mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna