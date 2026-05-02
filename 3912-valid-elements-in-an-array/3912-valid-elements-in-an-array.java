class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int[] arr = new int[nums.length];
        List<Integer> ll = new LinkedList<>();
        int i=0;
        int min=Integer.MIN_VALUE;
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
         for(i=0;i<nums.length;i++){
             if(arr[i]!=0){
                 ll.add(arr[i]);

             }

         }
        return ll;
    }
}