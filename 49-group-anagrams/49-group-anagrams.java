class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> list = new ArrayList<>(); //ans list
        
        for(int i=0; i<strs.length; i++){
            String temp = strs[i];
            char[] c = temp.toCharArray();
            Arrays.sort(c);
            if(hm.containsKey(String.valueOf(c))){
                hm.get(String.valueOf(c)).add(strs[i]);
            } else {
                List<String> lt = new ArrayList<>();
                lt.add(strs[i]);
                hm.put(String.valueOf(c), lt);
            }
        }
        for( List<String> item : hm.values()){
            list.add(item);
        }
        return list;
    }
}