class Solution {
    public int maxCircularSum(int arr[]) {
        int ans=arr[0];
        int maxsum=arr[0];
        int minsum=arr[0];
        int totalsum=arr[0];
        int bestend=arr[0];
        //MAX_SUM_SUB_ARRAY
        for(int i=1; i<arr.length;i++){
            bestend=Math.max(arr[i], arr[i]+bestend);
            maxsum=Math.max(maxsum, bestend);
        }
        //MIN_SUM_SUB_ARRAY
        bestend=arr[0];
        for(int i=1;i<arr.length; i++){
            bestend=Math.min(arr[i],arr[i]+bestend);
            minsum=Math.min(minsum, bestend);
        }
        //TOTAL_SUM_OF_ARRAY
        for(int i=1; i<arr.length; i++){
            totalsum+=arr[i];
        }
        //CIRCULAR_SUB_ARRAY_SUM
        int circularsum=totalsum-minsum;
        if(minsum==totalsum){
            return maxsum;
        }
        ans=Math.max(ans, Math.max(circularsum, maxsum));
        return ans;
    }
}
