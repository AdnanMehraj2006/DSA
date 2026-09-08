class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            if(map.isEmpty() || !map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
                continue;
            }
            //!map.isEmpty() || map.containsKey(s.charAt(i))
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
            if(map.get(s.charAt(i))==2){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}