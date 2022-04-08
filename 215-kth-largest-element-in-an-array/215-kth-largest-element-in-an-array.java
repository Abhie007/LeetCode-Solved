class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Integer[] integerArray = new Integer[nums.length];
        PriorityQueue<Integer> pQue = new PriorityQueue<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	pQue.add(-nums[i]);
        }
        
        
        
        int res = 0;
        while(k > 0){
            res = pQue.poll();
            k--;
        }
        return -res;
    }
}