class Solution {
    public int compareVersion(String version1, String version2) {
        int n1 = version1.length();
        int n2 = version2.length();
        
        
        int i = 0;
        int j = 0;
        
        while(i<n1 || j<n2){
            String str1 = "0";
            String str2 = "0";
            
        while( i<n1 && version1.charAt(i) !='.'){
            str1 += version1.charAt(i);
            i++;
        }
        i++;
        
        while( j<n2 && version2.charAt(j)!='.'){
            str2+= version2.charAt(j);
            j++;
        }
        j++;
            
        if(str1 != "" || str2 !="")    
        if(Integer.parseInt(str1) < Integer.parseInt(str2)){
            return -1;
        } else if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
            return 1;
        } else {
            continue;
        }
    }
        
        return 0;
    }
}