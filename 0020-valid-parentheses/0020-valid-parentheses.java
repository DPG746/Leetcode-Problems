class Solution {
    public boolean isValid(String s) {
       Stack<Character> ss = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            
            if( c == '('  || c == '[' || c == '{'){
                ss.push(c);
                
            }
            else if(ss.size()>0 &&
                (c == ')'  && ss.peek() == '('||
                c == ']' && ss.peek() == '[' ||
                c == '}' && ss.peek()=='{')){
                ss.pop();
                
            }
            else{
                return false;
            }
            
        }
        if(ss.size()==0){
            return true;
            
        }else{
            return false;
        }
    }
}