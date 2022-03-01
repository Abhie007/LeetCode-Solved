class Solution {
    public int[] countBits(int n) {
        int[] ans = new int [n+1];
        for(int i=0; i<=n; i++){
            ans[i] = countOnes(i);
        }
        return ans;       
    }
    public int countOnes(int x){
        int ans = 0;
        while(x>0){
            ans += x%2;
            x = x/2;
        }
        return ans;
    }
}