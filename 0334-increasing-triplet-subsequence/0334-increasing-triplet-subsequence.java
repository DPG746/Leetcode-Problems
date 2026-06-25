class Solution {
    public boolean increasingTriplet(int[] n) {
        int t = n.length;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int nums : n) {
            if (nums <= first) {
                first = nums;

            } else if (nums <= second) {
                second = nums;

            } else {
                return true;
            }

        }

        return false;
    }

}





// int count=0;
        // int min1=0;
        // int m=Integer.MIN_VALUE;

        // for(int i=n.length-1;i>0;i--){
        //      m=n[i];
        //     if(n[i-1]<m){ 
        //         m=n[i];
        //         count++;
        //         if(n[t-1]<m){
        //             count++;

        //         }

        //     }
        //     if(count==3){
        //      return true;

        //     }
        // }
        // int cnt =0;
        // int[] arr= new int[3];
        // int c=arr.length;
        // arr[0]=n[0];
        // int j=0;
        // for(int i=1;i<t;i++){
        //     if(n[i]==0){
        //         continue;

        //     }
        //     if(arr[j]<n[i]){
        //         arr[j]=n[i];
        //         cnt++;
        //         j++;

        //     }if(cnt==3){
        //         return true;

        //     }

        // }