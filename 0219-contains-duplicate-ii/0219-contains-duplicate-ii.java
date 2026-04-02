class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> s= new HashSet<>();
        for(int j=0;j<nums.length;j++){
            if(s.contains(nums[j])){
                    return true;
                }
            s.add(nums[j]);

            if(s.size()>k){
                s.remove(nums[j-k]);
            }
        }
        return false;
    }
}