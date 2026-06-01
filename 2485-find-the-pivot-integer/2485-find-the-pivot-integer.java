class Solution {
    public int pivotInteger(int n) {
        int l=1;
        int r=0;
        int cnt=0;
        for(int i=1;i<=n;i++){
            cnt = cnt+i;

        }
        int cntl=0;
        for(;l<=n;l++){
            cntl=cntl+l;
            r=cnt-cntl+l;
            if(r==cntl){
                return l;

            }

        }
        return -1;

    }
}