class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minn=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minn]){
                    minn=j;
                }

            }
                    int temp=nums[i];
                    nums[i]=nums[minn];
                    nums[minn]=temp;

        }
    }
}