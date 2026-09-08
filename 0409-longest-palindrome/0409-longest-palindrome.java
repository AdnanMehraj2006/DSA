class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            if(map.isEmpty() || !map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
                continue;
            }
            //!map.isEmpty() || map.containsKey(s.charAt(i))
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }
        if(n==1){
            return n;
        }
        if(map.size()==1){
            return map.get(s.charAt(0));
        }
        boolean flag=true;
        for(char ch : map.keySet()){
            if(map.get(ch)%2!=0 && flag==true){
                flag=false;
                continue;
            }
            if(map.get(ch)%2==0){
                continue;
            }
            //map.get(s.charAt(i))%2!=0 && map.get(s.charAt(i))!=1
            map.put(ch, map.get(ch)-1);
        }
        int count=0;
        for(int val : map.values()) {
            count += val;
        }
        return count;
    }
}