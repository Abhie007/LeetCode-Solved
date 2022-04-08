class Solution {
    public int[] twoSum(int[] nums, int target) {  
          int[] arr= new int[2];
           HashMap<Integer,Integer> comp = new HashMap<Integer, Integer>();
            for (int i=0;i<nums.length; i++) {
           if (comp.containsKey(nums[i])){
              arr[0]=comp.get(nums[i]);
              arr[1]=i;
               return arr;
           }
           else comp.put(target- nums[i],i);
       }
        return arr;
    }
}