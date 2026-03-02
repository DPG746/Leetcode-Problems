class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int current=0;
        int ans=0;


        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                current++;

            }
            while(current>k){
                if(nums[left]==0){
                    current--;

                }
                left++;


        }
            ans=Math.max(ans,r-left+1);
        }
        return ans;
    }
}