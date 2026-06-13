class Solution {
    public boolean isdivByDig(int num) {
        int n = num;
        while (n > 0) {
            int m = n % 10;
            if (m==0){
                return false;
            }else if(num % m!=0) {
                return false;
            }
            n=n/10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ll=new LinkedList<>();
        for(int i=left;i<=right;i++){
            if(isdivByDig(i)){
                ll.add(i);
            }
        }
        return ll;
    }
}