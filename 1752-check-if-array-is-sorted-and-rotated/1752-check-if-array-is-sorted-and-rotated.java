class Solution {
    public boolean check(int[] nums) 
    {
        int n=nums.length;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        for(int x=0;x<n;x++){
            if(arr[x]==nums[0]){
            int[] b= new int[n];
            for(int i=0;i<n;i++){
                b[i]=arr[(i+x)%n];
            }
            if(Arrays.equals(nums,b)){
                return true;
            }
            }
        }
        return false;
    }
}