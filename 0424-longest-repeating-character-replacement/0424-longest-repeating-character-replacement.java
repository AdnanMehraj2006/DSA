class Solution {
    public int characterReplacement(String s, int k) {
        int result=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]=new int[256];
        int low=0;
        for(int high=0; high<s.length(); high++){
            //true case
            char ch1=s.charAt(high);
            arr[ch1]=arr[ch1]+1;
            int len=high-low+1;
            max=Math.max(max, arr[ch1]);
            int diff=len-max;
            while(diff>k){
                char ch2=s.charAt(low);
                arr[ch2]=arr[ch2]-1;
                low++;
                len=high-low+1;
                max=Math.max(max, arr[ch2]);
                diff=len-max;
            }
            result=Math.max(result, len);
        }
        return result;
    }
}