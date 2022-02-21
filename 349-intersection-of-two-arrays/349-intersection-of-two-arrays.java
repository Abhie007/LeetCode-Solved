class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            hm.add(nums1[i]);
        }
        int k=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(hm.contains(nums2[i])){
                hs.add(nums2[i]);
            }
        }
        
        int n = hs.size();
        int [] ans = new int [n];
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            int x = it.next();
            if(hm.contains(x)){
                ans[k++]=x;
            }
        }
        return ans;
    }
}