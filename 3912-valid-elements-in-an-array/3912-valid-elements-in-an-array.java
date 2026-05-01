class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int [] arr=new int [nums.length];
        int min=Integer.MIN_VALUE;
        int i;
        for(i=0;i<nums.length;i++){
            if(min<nums[i]){
                min=nums[i];
                arr[i]=nums[i];
            }
        }
        min=Integer.MIN_VALUE;
        for(i=nums.length-1;i>=0;i--){
            if(min<nums[i]){
                min=nums[i];
                arr[i]=nums[i];
            }
        }
        List<Integer> l=new LinkedList<>();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                l.add(arr[i]);
            }
        }
        return l;
    }
}