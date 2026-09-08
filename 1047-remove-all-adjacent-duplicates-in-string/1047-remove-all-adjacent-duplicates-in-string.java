class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()==0){
            return "";
        }else{
            stack.push(s.charAt(0));
        }
        for(int i=1; i<s.length(); i++){
            if(stack.isEmpty()==false && s.charAt(i)==stack.peek()){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder("");
        while(stack.isEmpty()==false){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}