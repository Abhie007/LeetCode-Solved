class Solution {
    public void moveZeroes(int[] n) {
        HashMap<Integer, Integer> hm =  new HashMap<>();
        int k=1;
        for(int i=0; i<n.length; i++){
            if(n[i]!=0){
                hm.put(k++, n[i]);
            }
        }
        
        int x = 1;
        for (; x<=hm.size(); x++) {
            n[x-1] = hm.get(x);
        }
        while(x-1<n.length){
            n[x-1] = 0;
            x++;
        }
    }
}