class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i: nums){
            m.put(i,m.getOrDefault(i,0)+1);

        }

        Integer maxValue= Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
                if(entry.getValue()>n/2){
                    return entry.getKey();

                }
        }
        return -1;
    }
}