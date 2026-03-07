class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int[] s=new int[2];
        int r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                s[0]=l+1;
                s[1]=r+1;
                break;

            }if(numbers[l]+numbers[r]>target){
                r--;

            }
            else{
                l++;
            }

        }
        return s;
    }
}