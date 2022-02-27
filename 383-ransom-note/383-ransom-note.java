class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<m.length(); i++){
            hm.put(m.charAt(i), hm.getOrDefault(m.charAt(i),0)+1);
        }
        boolean ans = true ;
        for(int i=0; i<r.length(); i++){
            if(hm.containsKey(r.charAt(i)) && hm.get(r.charAt(i))>0){
                hm.put(r.charAt(i), hm.getOrDefault(r.charAt(i),0)-1);
            } else {
                ans = false;
            }
        }
        return ans;
    }
}