class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Integer, Integer> hm = new HashMap<>();
         int bull=0,cow=0;
        int n = secret.length();
        for(int i = 0; i<n; i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++; }
            else             
            hm.put(Integer.valueOf(secret.charAt(i)), hm.getOrDefault(Integer.valueOf(secret.charAt(i)),0)+1);
        }
    
       
        for(int i=0; i<n;i++ ){             
            if(secret.charAt(i)!=guess.charAt(i))
     if(hm.containsKey(Integer.valueOf(guess.charAt(i))) && hm.get(Integer.valueOf(guess.charAt(i)))>0){
                cow++;
                hm.put(Integer.valueOf(guess.charAt(i)), hm.getOrDefault(Integer.valueOf(guess.charAt(i)),0)-1);     
            }
            
        }
        String str = bull + "A" + cow + "B";
        return str;
        
    }
}