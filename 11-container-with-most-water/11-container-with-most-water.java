class Solution {
    public int maxArea(int[] h) {
        
        
        int i = 0;
        int j = h.length-1;
        int ans = 0;
        for(int dis = j; dis>0; dis--){
            ans = Math.max(ans, dis*(h[i]<h[j]?h[i++]:h[j--]));
        }
        return ans;
        
        
        
        
        
        
        
        
//         int ans = 0;
        
//         for(int i=0; i<h.length; i++){
//             for(int j=i+1; j<h.length; j++){
//                 int area = (Math.min(h[i],h[j]))*(j-i);
//                 ans = Math.max(ans, area);
//             }
//         }
        
//         return ans;
//         // area = min(i,j)*(j-i+1)
//         //     ans = mx(ans, area)
    }
}