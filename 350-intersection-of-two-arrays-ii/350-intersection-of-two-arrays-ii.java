class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0) +1);
        }
        int ptr = 0;
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            if(hm.containsKey(nums2[i])){
                res.put(ptr++, nums2[i]);
                if(hm.get(nums2[i])>1){
                    hm.put(nums2[i], hm.getOrDefault(nums2[i], 0)-1);
                } else {
                    hm.remove(nums2[i]);
                }
            }
        }
        int k =0;
        int [] ans = new int[res.size()];
        for(Integer num : res.values()){
            ans[k++] = num;
        }
        return ans;
    }
}