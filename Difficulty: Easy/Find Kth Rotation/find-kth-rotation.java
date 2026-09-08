class Solution {
    public int findKRotation(int arr[]) {
        int n=arr.length;
        int low=0, high=n-1, res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[n-1]){
                low=mid+1;
            }else if(arr[mid]<=arr[n-1]){
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
}