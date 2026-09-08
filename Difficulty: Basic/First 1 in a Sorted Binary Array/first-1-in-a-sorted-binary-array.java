class Solution {
    public int first_occ(int[] arr, int target, int low, int high){
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res=mid;
                high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    public int firstIndex(int arr[]) {
        int target=1;
        int res=-1;
        int n=arr.length;
        if(n==0) return -1;
        if(n==1 && arr[0]==target) return 0;
        int low=0, high=n-1;
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
        if(res==-1) return -1;
        res=first_occ(arr, target, 0, res);
        return res;
    }
}