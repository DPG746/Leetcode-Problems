class Solution {
    public boolean isHappy(int n) {
        Set<Integer> m=new HashSet<>();
        while(n!=1){
            if(m.contains(n)){
                return false;

            }
            m.add(n);
            n=getNext(n);
        }

        return true;
    }

    public int getNext(int n){
        int sum =0;

        while(n>0){
            int digit=n%10;
            sum +=digit*digit;
            n/=10;


        }

        return sum;

    }
}