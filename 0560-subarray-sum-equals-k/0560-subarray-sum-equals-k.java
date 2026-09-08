class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix_sum=0;
        int count=0;
        HashMap <Integer, Integer> map=new HashMap<>();
        map.put(0,1);//initial condition
        for(int i=0;i<nums.length; i++){
            //Prefix Sum Calculation
            prefix_sum+=nums[i];
            int temp=prefix_sum-k;
            //Result Updation
            if(map.containsKey(temp)){
                count+=map.get(temp);
            }
            //HashMap Updation
            if(map.containsKey(prefix_sum)){
                map.put(prefix_sum, map.get(prefix_sum)+1);
            }else{
                map.put(prefix_sum,1);
            }
        }
        return count;
    }
}