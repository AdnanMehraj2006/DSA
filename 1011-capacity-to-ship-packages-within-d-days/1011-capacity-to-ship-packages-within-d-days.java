class Solution {
    public boolean result(int[] arr, int d, int mid){
        int count=1;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > mid) {
                return false;
            }
            if(sum+arr[i]>mid){
                count++;
                sum=0;
            }
            sum+=arr[i];
            if(count>d){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        if(n==0) return -1;
        int res=-1;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int val : weights){
            min=Math.min(min, val);
            sum+=val;
        }
        int low=min, high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(result(weights, days, mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}