class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
		// int n=s.length();
		// int cnt=0;
		// int cn=s.length()-1;
        // char[] c= new char[n];
        // for(int i=0;i<s.length();i++){
        //     c=s.toCharArray();
        // }
        // for(int i=0;i<c.length-1;i++){
        //     if((Math.abs(c[i]-c[i+1]))==2 || (Math.abs(c[i]-c[i+1]))==1 || (Math.abs(c[i]-c[i+1]))==0){
        //         cnt++;
                
        //     }
            // else{
            //     return false;
            // }
            
        // }
        // if(cn==cnt){
        //    return true;
        // }
        // return false;

        char[] c = s.toCharArray();

        for(int i=0;i<c.length-1;i++){
            if(Math.abs(c[i]-c[i+1])>2){
                return false;

            }

        }
        return true;

    }
}