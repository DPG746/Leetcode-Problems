class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s= new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();

        for(int x:nums1){
            s.add(x);

        }
        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i])){
                a.add(nums2[i]);
                s.remove(nums2[i]);

            }

        }
        int[] arr = new int[a.size()];

        for(int i = 0; i < a.size(); i++){
            arr[i] = a.get(i);
        }

        return arr;
    }
}