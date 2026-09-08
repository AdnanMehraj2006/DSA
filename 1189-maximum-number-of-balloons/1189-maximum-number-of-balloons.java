class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> need=new HashMap<>();
        HashMap<Character, Integer> have=new HashMap<>();
        for(int i=0; i<text.length(); i++){
            if(have.isEmpty() || !have.containsKey(text.charAt(i))){
                have.put(text.charAt(i), 1);
                continue;
            }
            have.put(text.charAt(i), have.get(text.charAt(i))+1);
        }
        need.put('b', 1); need.put('a', 1); need.put('l', 2); need.put('o', 2); need.put('n', 1);
        int res=Integer.MAX_VALUE;
        for(char ch : need.keySet()){
            int fneed=need.get(ch);
            int fhave;
            if(have.get(ch)==null){
                fhave=0;
            }else{
                fhave=have.get(ch);
            }
            int freq=fhave/fneed;
            res=Math.min(res, freq);
        }
        return res;
    }
}