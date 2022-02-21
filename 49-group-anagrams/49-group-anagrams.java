class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        // 
        HashMap<String, List<String>> mp = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String temp = strs[i];
            char [] ch = temp.toCharArray();
            Arrays.sort(ch);
            if(mp.containsKey(String.valueOf(ch))){
                mp.get(String.valueOf(ch)).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                mp.put(String.valueOf(ch), list);
            }
        }
        for(List<String> item: mp.values()){
            res.add(item);
        }
        return res;
        
    }
}