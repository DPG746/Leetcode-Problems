class Solution {
    long MOD=1000000007;
    Long[][] dp;

    long solve(int n, int k){
        if(n==1 && k==1){
            return 1;

        }
        if(k==0 || k>n){
            return 0;

        }

        if(dp[n][k] != null){
            return dp[n][k];

        }

        long vis = solve(n - 1, k - 1);
        long hid = ((n - 1) * solve(n - 1, k)) % MOD;

        return dp[n][k] = (vis + hid) % MOD;

    }
     
     public int rearrangeSticks(int n, int k){
        dp=new Long[n+1][k+1];
        return(int) solve(n,k);

     }
     
    }