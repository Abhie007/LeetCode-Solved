class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> lt = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int s = nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i]==1){
                i++;
            }
            if(s!=nums[i]){
                lt.add(s+"->"+nums[i]);
            } else {
                lt.add(s+"");
            }
        }
        return lt;
    }
}