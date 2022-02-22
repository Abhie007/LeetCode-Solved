class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        int ans = 0;
        int odd = 0;
        boolean flag = false;
        for(Integer i : hm.values()){
            if(i%2==1){
                if(flag!=true){
                    odd = 1;
                }
                ans += i-1;
                flag = true;
            } else {
                ans += i;
            }
        }
        return ans+odd;
    }
}