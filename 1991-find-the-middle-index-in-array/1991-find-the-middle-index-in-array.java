class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefix_sum=0;//nums[0]
        //total_sum
        int total_sum=0;
        for(int i=0; i<nums.length; i++){
            total_sum+=nums[i];
        }
        //pivot_check
        for(int i=0; i<nums.length; i++){
            int suffix_sum=total_sum-nums[i]-prefix_sum;
            if(prefix_sum==suffix_sum){
                return i;
            }
            prefix_sum+=nums[i];//for next iteration
        }
        return -1;
    }
}