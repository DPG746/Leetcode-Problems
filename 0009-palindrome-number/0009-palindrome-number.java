class Solution {
    public boolean isPalindrome(int x) {
        int v=x;
        int c=0;
        int i=0;
        if(x==0){
            return true;

        }
        while(x>0){
            c=x%10;
            x=x/10;
            i=i*10+c;
            if(v==i){
                return true;

            }

        }
        return false;
        
    }
}