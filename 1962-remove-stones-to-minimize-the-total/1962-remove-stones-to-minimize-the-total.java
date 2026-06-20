class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());

        for(int num:piles){
            p.add(num);

        }
        for(int i=0;i<k;i++){
            double c=0;
            int d=p.remove();
            int remove=d/2;
            int j=d-remove;
            p.add(j);



        }int n=0;
        for(int nums:p){
            n=n+nums;

        }
        return n;
    }
}