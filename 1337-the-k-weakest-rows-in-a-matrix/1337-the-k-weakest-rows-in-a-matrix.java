class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        
        int[] s_count = new int[mat.length];
        
        
        for(int i=0; i<mat.length; i++){
            int counter = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    counter++;
                }
            }
            s_count[i] = counter;
        }
        
        int[] s_copy = s_count.clone();
       
        for(int i=0; i<s_count.length; i++){
            for(int j=1; j<s_count.length-i; j++){
                if(s_count[j]<s_count[j-1]){
                    int temp = s_count[j];
                    s_count[j] = s_count[j-1];
                    s_count[j-1] = temp;
                }
            }
        }
        
        
        for(int i=0; i<k; i++){
            
            for(int j=0; j<s_copy.length; j++){
                if(s_count[i] == s_copy[j]){                 
                    ans[i] = j;
                    s_copy[j] = -1;
                    break;
                }
                
            }
            
        }
        
        return ans;
    }
}