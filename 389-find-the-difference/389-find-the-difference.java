class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        char ans = ' ';
        for(int i=0; i<t.length(); i++){
            if(hm.containsKey(t.charAt(i)) && hm.get(t.charAt(i))>0){
                hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i),0)-1);
                continue;
            } else {
                ans =  t.charAt(i);
            }
        }
        return ans;
    }
}