class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int low=0, high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid-1;
            }else{
                //nums[mid]<nums[mid+1]
                low=mid+1;
            }
        }
        return low;
    }
}