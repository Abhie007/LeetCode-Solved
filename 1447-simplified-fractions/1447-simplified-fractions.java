class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        
        for(int i=1; i<n; i++){
            for(int j=2; j<=n; j++){
                if(((i/j) < 1) && !hasGCD(j,i)){
                    ans.add(i+"/"+j);
                }
            }
        }
        return ans;
    }
    private boolean hasGCD(int a, int b){
        if(b==1) return false; //no gcd, end of recursion
        if(a%b==0) return true; //have gcd
        return hasGCD(b, a%b);
    }
}