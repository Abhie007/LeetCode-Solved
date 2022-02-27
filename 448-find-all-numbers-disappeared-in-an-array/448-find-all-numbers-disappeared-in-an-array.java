class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        for(int i=1; i<=nums.length; i++){
            if(!hs.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}