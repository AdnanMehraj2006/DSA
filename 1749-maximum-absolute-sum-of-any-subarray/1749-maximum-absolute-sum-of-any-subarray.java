class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=nums[0];
        int minsum=nums[0];
        int best_end=nums[0];
        int ans=Math.abs(nums[0]);
        for(int i=1; i<nums.length; i++){
            best_end=Math.max(nums[i], nums[i]+best_end);
            maxsum=Math.max(maxsum, best_end);
        }
        best_end=nums[0];
        for(int i=1; i<nums.length; i++){
            best_end=Math.min(nums[i], nums[i]+best_end);
            minsum=Math.min(minsum, best_end);
        }
        ans=Math.max(maxsum, Math.abs(minsum));
        return ans;
    }
}