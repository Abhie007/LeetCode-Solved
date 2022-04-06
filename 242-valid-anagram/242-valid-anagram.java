class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
   
        if(n!=t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<n; i++){
            int count = hm.getOrDefault(t.charAt(i),0);
            if(count==0) return false;
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i),0)-1);                            
        }
        return true;
    }
}