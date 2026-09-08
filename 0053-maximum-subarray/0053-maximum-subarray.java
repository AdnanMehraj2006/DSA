class Solution {
    public int maxSubArray(int[] nums) {
        int best_ending=nums[0];
        int max=nums[0];
        for(int i=1; i<nums.length; i++){
            int c1=best_ending+nums[i];
            int c2=nums[i];
            best_ending=Math.max(c1, c2);
            max=Math.max(max, best_ending);
        }
        return max;
    }
}