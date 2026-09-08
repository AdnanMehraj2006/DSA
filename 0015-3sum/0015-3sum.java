import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> total = new ArrayList<>();
        for(int i=0 ;i<nums.length-1; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1, k=nums.length-1, target=0-nums[i];
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==target){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    total.add(temp);
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return total;
    }
}