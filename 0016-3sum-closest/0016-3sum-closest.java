class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);        
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int finalresult=0;
        for(int i=0; i<n-2; i++){
            int j=i+1,k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(sum-target);
                if(diff<min){
                    min=diff;
                    finalresult=sum;
                }
                if(sum==target){
                    diff=0;
                    return sum;
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return finalresult;
    }
}