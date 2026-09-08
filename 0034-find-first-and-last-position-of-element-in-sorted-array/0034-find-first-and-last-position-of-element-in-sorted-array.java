class Solution {
    public int occ(int[] nums, int target, int low, int high, boolean first){
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                res=mid;
                if(first){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int low=0, high=len-1, res=-1, ans1=-1, ans2=-1;
        if(len==0) return new int[]{-1,-1};
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                res=mid;
                break;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(res==-1){
            return new int[]{ans1,ans2};
        }                                   
        ans1=occ(nums, target, 0, res, true);
        ans2=occ(nums, target, res, len-1, false);
        return new int[]{ans1, ans2};
    }
}