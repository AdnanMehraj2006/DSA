class Solution {
    public int binarySearch(int[] nums, int low, int high, int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n==0) return -1;
        if(n==1 && target==nums[0]) return 0;
        if(n==1 && target!=nums[0]) return -1;
        if(n==2){
            if(nums[0] == target){
                return 0;
            }else if(nums[1] == target){
                return 1;
            }else{
                return -1;
            }
        }
        int low=0, high=n-1;
        if(nums[0]<nums[n-1]) return binarySearch(nums, low, high, target);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                return mid;
            }else if(nums[mid]>nums[n-1]){
                //mid is the part of P2
                if(nums[mid]<target){
                    low=mid+1;
                }else if(nums[mid]>target){
                    if(target>nums[n-1]){
                        //search in P2
                        high=mid-1;
                    }else if(target<=nums[n-1]){
                        //search in P1
                        low=mid+1;
                    }
                }
            }else if(nums[mid]<=nums[n-1]){
                //mid is the part of P1
                if(nums[mid]>target){
                    high=mid-1;
                }else if(nums[mid]<target){
                    if(target<nums[0]){
                        //search in P1
                        low=mid+1;
                    }else if(target>=nums[0]){
                        //search in P2
                        high=mid-1;
                    }
                }
            }
        }
        return -1;
    }
}