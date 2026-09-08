class Solution {
    public int maxWater(int arr[]) {
        int n=arr.length;
        int lmax[]=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        int total=0,width=1;
        for(int i=0; i<n;i++){
            int w_lvl=Math.min(rmax[i], lmax[i]);
            total+=(w_lvl-arr[i])*width;
        }
        return total;
    }
}
