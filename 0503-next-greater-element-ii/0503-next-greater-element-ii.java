class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        st.push(nums[n-1]);
        int ans[]=new int[n];
        for(int i=(2*n)-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%n]=-1;
            }else{//p>a
                int tmp=st.peek();
                ans[i%n]=tmp;
            }
            st.push(nums[i%n]);
        }
        return ans;
    }
}