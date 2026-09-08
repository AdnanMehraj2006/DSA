import java.util.*;
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<AbstractMap.SimpleEntry<Character, Integer>> st=new Stack<>();
        for(int i=0; i< s.length(); i++){
            if(st.isEmpty()){
                st.push(new AbstractMap.SimpleEntry<>(s.charAt(i), 1));
                continue;
            }
            //st.isEmpty()==false
            if(st.peek().getKey()==s.charAt(i) && st.peek().getValue()==k-1){
                st.pop();
            }else if(st.peek().getKey()==s.charAt(i) && st.peek().getValue()<k-1){
                char key=st.peek().getKey();
                int value=st.peek().getValue();
                st.pop();
                st.push(new AbstractMap.SimpleEntry<>(key, value+1));
            }else{
                //st.peek().getKey()!=st.charAt(i)
                st.push(new AbstractMap.SimpleEntry<>(s.charAt(i), 1));
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            char K=st.peek().getKey();
            int v=st.peek().getValue();
            while(v!=0){
                res.append(K);
                v--;
            }
            st.pop();
        }
        return res.reverse().toString();
    }
}