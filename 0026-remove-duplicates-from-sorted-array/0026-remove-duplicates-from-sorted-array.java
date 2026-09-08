class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0,j=i+1;
      int k=1;//because first element will be always unique
      while(j<nums.length){
        if(nums[j]==nums[j-1]){//same or dupliacte
            j++;
            continue;//skip the current itration and move to the next.            
        }
            nums[i+1]=nums[j];
            i++;
            j++;
            k++;
      }
      return k;  
    }
}