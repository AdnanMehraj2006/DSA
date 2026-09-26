import java.util.Arrays;
class Solution {
    public boolean gap(int[] arr, int k, int mid){
        int n=arr.length;
        int cows=1;
        int prev=arr[0];//a[0]=cow 1
        for(int i=1; i<n; i++){
            int dist=arr[i]-prev;
            if(dist>=mid){
                cows++;
                prev=arr[i];
            }
            //continue to next iteration.
        }
        if(cows>=k){
            //found
            return true;
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        int n=arr.length;
        if(n==0 || n<k) return -1;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2; //guessed gap
            if(gap(arr, k, mid)==true){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna