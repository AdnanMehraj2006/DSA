class Solution {
    public boolean result(int[] arr, int m, int k, int days){
        int flowers=0;
        int bouquet=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=days){
                flowers++;
            }else{
                flowers=0;
            }
            if(flowers==k){
                bouquet++;
                flowers=0;
            }
            if(bouquet==m){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n==0) return -1;
        int res=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i : bloomDay){
            max=Math.max(max, i);
            min=Math.min(min, i);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;//guessed_day
            if(result(bloomDay, m, k, mid)){
               res=mid;
               high=mid-1; 
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}