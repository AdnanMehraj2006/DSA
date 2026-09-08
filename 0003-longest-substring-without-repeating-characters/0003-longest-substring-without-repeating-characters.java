class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        int high=0, low=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(high<s.length()){
            char ch1=s.charAt(high);
            if(map.containsKey(ch1)){
                map.put(ch1, map.get(ch1)+1);
            }else{
                map.put(ch1, 1);
            }
            while(map.get(ch1)!=1){ 
                char ch2=s.charAt(low);
                if(map.containsKey(ch2)){
                    map.put(ch2, map.get(ch2)-1);
                }
                if(map.get(ch2)==0){
                    map.remove(ch2);
                }
                low++;
            }
            max=Math.max(max, (high-low+1));
            high++;
        }
        return (max==Integer.MIN_VALUE?0:max);
    }
}