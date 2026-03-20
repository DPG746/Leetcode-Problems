class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int w=0;
        int h=0;
        int water=0;
        int maxi=0;

        while(l<r){
            w =r-l;
            h=Math.min(height[l],height[r]);
            water=w*h;

            maxi=Math.max(maxi,water);
            if(height[l]<height[r]){
                l++;


            }else{
                   r--;
        }
        }

        return maxi;
    }
}