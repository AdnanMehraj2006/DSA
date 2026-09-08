class Solution {
    public int longestKSubstr(String s, int k) {
        int result=-1;
        int low=0, high=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(high<s.length()){
            char ch1=s.charAt(high);
            if(map.containsKey(ch1)){
                map.put(ch1, map.get(ch1)+1);
            }else{
                map.put(ch1, 1);
            }
            while(map.size()>k){
                char ch2=s.charAt(low);
                if(map.containsKey(ch2)){
                    map.put(ch2, map.get(ch2)-1);
                }
                if(map.get(ch2)==0){
                    map.remove(ch2);
                }
                low++;
            }
            if(map.size()==k){
                result=Math.max(result, (high-low+1));
            }
            high++;
        }
        return result;
    }
}