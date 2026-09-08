class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans=nums[0];
        int maxsum=nums[0];
        int minsum=nums[0];
        int totalsum=nums[0];
        int bestend=nums[0];
        //MAX_SUM_SUB_ARRAY
        for(int i=1; i<nums.length;i++){
            bestend=Math.max(nums[i], nums[i]+bestend);
            maxsum=Math.max(maxsum, bestend);
        }
        //MIN_SUM_SUB_ARRAY
        bestend=nums[0];
        for(int i=1;i<nums.length; i++){
            bestend=Math.min(nums[i],nums[i]+bestend);
            minsum=Math.min(minsum, bestend);
        }
        //TOTAL_SUM_OF_ARRAY
        for(int i=1; i<nums.length; i++){
            totalsum+=nums[i];
        }
        //CIRCULAR_SUB_ARRAY_SUM
        int circularsum=totalsum-minsum;
        if(minsum==totalsum){
            return maxsum;
        }
        ans=Math.max(ans, Math.max(circularsum, maxsum));
        return ans;
    }
}