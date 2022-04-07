class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <2) return false;
        int count = 1 ;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                
                if(i*i == num){
                    count += i;
                }
                else {
                    count += i + num/i;
                }    
            }
        }
        // System.out.println(count);
        // System.out.println(num);
        if(count == num){
            return true;
        }
        else return false;
    }
}