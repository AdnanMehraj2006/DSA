class Solution {
    int occ(int[] arr,int target, int low, int high, boolean check){
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res=mid;
                if(check){
                   high=mid-1; 
                }else{
                    low=mid+1;
                }
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    int countFreq(int[] arr, int target) {
        int n=arr.length;
        int low=0, high=n-1, res=-1, first_occ=0, last_occ=0;
        if(n==0) return 0;
        if(n==1 && arr[0]==target) return 1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res=mid;
                break;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(res==-1) return 0;
        first_occ=occ(arr, target, 0, res, true);//first_occurance
        last_occ=occ(arr, target, res, n-1, false);//last_occurance
        res=last_occ-first_occ+1;
        return res;
    }
}
