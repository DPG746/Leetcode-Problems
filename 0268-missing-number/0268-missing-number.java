class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int cnt=0;
		for(int i=0;i<n;i++) {
			cnt+=nums[i];
			
		}
		
		int sum=n*(n+1)/2;
		int res=sum-cnt;
		
		return res;
    }
}