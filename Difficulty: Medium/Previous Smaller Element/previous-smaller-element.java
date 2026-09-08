class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        st.push(arr[0]);
        res.add(0, -1);
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res.add(i, -1);
            }else{
                int temp=st.peek();
                res.add(i, temp);
            }
            st.push(arr[i]);
        }
        return res;
    }
}