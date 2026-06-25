class Solution {
    public String reverseWords(String s) {
       // ArrayList<String> arr= new 
    
    
     String[] s1 = s.trim().split("\\s+");
       StringBuilder s2 = new StringBuilder();
    

        for(int i=s1.length-1;i>=0;i--){
           
            s2.append(s1[i]);
            
            if(i != 0) {

                s2.append(" ");}


        }
        String b =s2.toString();
        return b;
}
    
        
    }