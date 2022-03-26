class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        
        int f = 0;
        int s = 1;
        int num = s;
        for(int i=2;i<=n; i++){
            num = f+ s;
            f = s;
            s = num;
        }
        return num + f;
    }
}