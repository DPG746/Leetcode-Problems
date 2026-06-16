class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr= new int[n];
        //int c=1;

        arr[0]=1;
        for(int i=1;i<n;i++){

            arr[i]=arr[i-1]*nums[i-1];

        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            arr[i]=arr[i]*suffix;
            suffix=suffix*nums[i];

        }

        return arr;
    }
}

// for(int i=0;i<n;i++){
//     int c=1;
//     for(int j=0;j<n;j++){

//         if(i!=j){
//             c=c*nums[j];
//             arr[i]=c;

//         }

//     }

// }