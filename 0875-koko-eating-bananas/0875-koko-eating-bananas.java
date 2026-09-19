class Solution {
    public long hours(int[] arr, int mid){
        long hours=0;
        for(int i=0; i<arr.length; i++){
            hours+=arr[i]/mid;
            if(arr[i]%mid!=0){
                hours++;
            }
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        if(n==0) return 0;
        int res=-1;
        int low=1;//min
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int high=max;//max
        while(low<=high){
            int mid=low+(high-low)/2;
            if(hours(piles, mid)<=h){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}