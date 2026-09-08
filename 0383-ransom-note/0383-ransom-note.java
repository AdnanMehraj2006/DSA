class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m1=new HashMap<>();
        HashMap<Character, Integer> m2=new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            if(m1.isEmpty() || !m1.containsKey(ransomNote.charAt(i))){
                m1.put(ransomNote.charAt(i), 1);
                continue;
            }
            //!m1.isEmpty() || m1.containsKey()
            m1.put(ransomNote.charAt(i), m1.get(ransomNote.charAt(i))+1);
        }
        for(int i=0; i<magazine.length(); i++){
            if(m2.isEmpty() || !m2.containsKey(magazine.charAt(i))){
                m2.put(magazine.charAt(i), 1);
                continue;
            }
            //!m2.isEmpty() || m2.containsKey()
            m2.put(magazine.charAt(i), m2.get(magazine.charAt(i))+1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch=ransomNote.charAt(i);
            if(!m2.containsKey(ch) || m1.get(ch)>m2.get(ch)){
                return false;
            }
        }
        return true;        
    }
}