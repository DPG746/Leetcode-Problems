class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone : stones){
            p.add(stone);

        }

        while(p.size()>1){
            int first= p.remove();
            int second= p.remove();

            if(first != second){
                p.add(first-second);

            }



        }

        return p.isEmpty() ? 0 : p.remove();
    }
}