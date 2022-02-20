class Solution {
    // public List<Integer> findAnagrams(String s, String p) {
        public List<Integer> findAnagrams(String s, String p) {
        int slen = s.length(), plen = p.length();
        List<Integer> startIndices = new ArrayList<>();
        int[] dictS = new int[26], dictP = new int[26];
        
        // Map char to frequency in p.
        for (char ch : p.toCharArray())
            dictP[ch - 'a']++;
        
        int j = 0; // [i, j) is current window.
        for (int i = 0; i < slen; i++) {
            while (j < slen && j - i + 1 <= plen) { 
                dictS[s.charAt(j) - 'a']++;
                j++;
            }
            if (Arrays.equals(dictS, dictP)) startIndices.add(i);
            dictS[s.charAt(i) - 'a']--;
        }
        
        return startIndices;
    }
        
        
    // }
}
