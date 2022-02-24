class Solution {
    public int search(int[] nums, int target) {
        int s = 0 ;
        int e = nums.length - 1;
        int ans = 0;
        while(s <= e){
            int m = (s+e)/2;
            if(nums[m] < target){
                s = m + 1;
            } else if(nums[m] > target) {
                e = m - 1;
            } else {
                return m;
            }
        }
        
        return -1;
    }
}