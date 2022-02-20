class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        // int flag=0
        while(true){
            if(hs.contains(original)){
                original = original*2;
            } else break;
        }
               return original;
    }
}