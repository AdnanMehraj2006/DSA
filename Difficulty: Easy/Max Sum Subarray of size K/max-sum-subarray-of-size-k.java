class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int low=0,high=k-1,sum=0;
        for(int i=0; i<=high; i++){
            sum+=arr[i];
        }
        int max=Integer.MIN_VALUE;
        max=sum;
        while(high<arr.length-1){
            high++;
            low++;
            sum+=arr[high]-arr[low-1];
            max=Math.max(max,sum);
        }
        return max;
    }
}