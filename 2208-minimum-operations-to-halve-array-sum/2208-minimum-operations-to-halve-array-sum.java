class Solution {
    public int halveArray(int[] nums) {
        double target=0;
        PriorityQueue<Double> p = new PriorityQueue<>(Comparator.reverseOrder());

        for(double num: nums){
            target+=num;
            p.add(num);

        }

        target /= 2;
        int ans=0;
        while(target>0){
            ans++;
            double x = p.remove();
            target=target-(x/2);
            p.add(x/2);


        }

        return ans;
    }
}