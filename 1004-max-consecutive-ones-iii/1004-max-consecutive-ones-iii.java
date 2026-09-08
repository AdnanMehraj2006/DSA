class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0, high=0;
        int max=Integer.MIN_VALUE;
        int f[]=new int[2];
        while(high<nums.length){
            f[nums[high]]++;
            while(f[0]>k){
                f[nums[low]]--;
                low++;
            }
            max=Math.max(max, (high-low+1));
            high++;
        }
        return max;
    }
}