class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i=1; i<=num; i++){
            if(isEvenDigitSum(i)==true){
                count++;
            } 
        }
        return count;
    }
    public boolean isEvenDigitSum(int n){
//         if(n<10) {
            
//         }
        int sum = 0;
        while(n!=0){
          int digit = n%10;
            sum +=digit;
            n = n/10;
        }
         // return isEvenDigitSum(n);
        if(sum%2==0){
                return true;
            } else {
                return false;
            }
    }
}