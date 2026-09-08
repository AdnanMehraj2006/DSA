class Solution {
    public int maxProduct(int[] nums) {
        int best_end_min=nums[0];
        int best_end_max=nums[0];
        int answer=nums[0];
        for(int i=1; i<nums.length; i++){
            int choice_1=best_end_min * nums[i];
            int choice_2=best_end_max * nums[i];
            int choice_3=nums[i];
            best_end_min=Math.min(choice_1, Math.min(choice_2, choice_3));
            best_end_max=Math.max(choice_1, Math.max(choice_2, choice_3));
            answer=Math.max(answer, Math.max(best_end_min, best_end_max));
        }
        return answer;
    }
}