class Solution {
    private boolean helper(int[] arr, int k, int mid){
        int count=1;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mid) return false;
            if(sum+arr[i]>mid){
                count++;
                sum=0;
            }
            sum+=arr[i];
            if(count>k) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(n<k) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int val : nums){
            low=Math.max(low, val);
            high+=val;
        }
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(nums, k, mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}