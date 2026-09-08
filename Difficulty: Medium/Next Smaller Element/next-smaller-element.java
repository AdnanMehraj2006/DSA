class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        st.push(arr[n-1]);
        int ans[]=new int[n];
        ans[n-1]=-1;
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                //p>a
                int temp=st.peek();
                ans[i]=temp;
            }
                st.push(arr[i]);
        }
        for(int x : ans) {
            res.add(x);
        }
        return res;
    }
}