class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        // int[] ans = new int[]
        int sA = 0;
        int sB =0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : A ){
            sA += i;
            hs.add(i);
        }
        for(int j : B){
            sB += j;
        }
        for(int k : B){
            int t = (sA-sB + 2*k)/2;
            if(hs.contains(t)){
                return new int[]{t, k};
            }
        }
        return new int[]{0,0};
    }
}