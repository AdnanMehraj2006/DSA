class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0,high=0,sum=0,min=Integer.MAX_VALUE;
        while(high<nums.length){
            sum+=nums[high];
            while(sum>=target){
                min=Math.min(min,(high-low+1));
                sum-=nums[low];
                low++;
            }
            high++;
        }
        return (min==Integer.MAX_VALUE?0:min);
    }
}