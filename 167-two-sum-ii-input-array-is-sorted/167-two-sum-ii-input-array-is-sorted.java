class Solution {
    public int[] twoSum(int[] n, int t) {
        int[] ans = new int[2];
        for(int i=0, j=n.length-1; i<j; ){
            if(n[i]+n[j] < t){
                i++;
            } else if(n[i]+n[j] > t){
                j--;
            } else {
                ans[0]=i+1;
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
}