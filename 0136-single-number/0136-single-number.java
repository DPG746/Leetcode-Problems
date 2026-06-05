class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
    for(Map.Entry<Integer,Integer> entry : m.entrySet()){
        if(entry.getValue().equals(1)){
            return entry.getKey();
        }
        
        
    }
        return 1;
    }
}