class Solution {
    public int maxSubArray(int[] nums) {
        int csum = 0, count =0;
        int fsum = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]<0)
        //     count ++;
        // }
        // if(count == nums.length) return -1;
            
        for (int i=0; i<nums.length; i++){
           
            if(csum <0 ){
                csum = nums[i];
            } else {
                 csum += nums[i];
            }
            // if(csum > fsum ){
                fsum = Math.max(fsum,csum);
            // }
        }
        return fsum;
    }
}