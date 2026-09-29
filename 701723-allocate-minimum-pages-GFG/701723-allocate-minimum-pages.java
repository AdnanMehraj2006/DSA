class Solution {
    private boolean helper(int[] arr, int k, long mid){
        int count=1;//Always 1 student
        long sum=0;
        for(int val : arr){
            if(val>mid) return false;
            if(sum+val>mid){
                count++;
                sum=0;
            }
            sum+=val;
            if(count>k) return false;
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        int n=arr.length;
        if(n<k) return -1;
        long low=Integer.MIN_VALUE;
        long high=0;
        long res=-1;
        for(int val : arr){
            low=Math.max(low, val);
            high+=val;
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(helper(arr, k, mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return(int)res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna