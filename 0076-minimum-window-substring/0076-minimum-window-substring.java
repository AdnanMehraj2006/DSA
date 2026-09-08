class Solution {
    public boolean check(int arr[], int x[]){
        boolean z=true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<x[i]){
                z=false;
                break;
            }
        }
        return z;
    }
    public String minWindow(String s, String t) {
        int high=0, low=0;
        int arr[]=new int[123];
        int x[]=new int[123];
        String result=null;
        int min_len=Integer.MAX_VALUE;
        int start_index=0;
        for(int i=0; i<t.length(); i++){
            x[t.charAt(i)]++;
        }
        while(high<s.length()){
            //false case
            arr[s.charAt(high)]+=1;
            while(check(arr, x)){
                //true case
                int len=high-low+1;
                arr[s.charAt(low)]-=1;
                if(len<min_len){
                    min_len=len;
                    start_index=low;
                }
                low++;
            }
            high++;
        }
        return (min_len==Integer.MAX_VALUE?"":s.substring(start_index,start_index+min_len));
    }
}