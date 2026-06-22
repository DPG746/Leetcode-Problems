class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long first = mass;
        for(int as: asteroids){
            if(as>first){
                return false;

            }
            first+=as;

        }
        return true;
    }
}