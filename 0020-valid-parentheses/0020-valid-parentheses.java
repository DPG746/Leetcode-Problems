class Solution {
    public boolean isValid(String s) {
       Map<Character,Character> m=new HashMap();
	    m.put('(',')');
	    m.put('{','}');
	    m.put('[',']');


	Stack<Character> stack=new Stack<>();
	    for(char c:s.toCharArray()){
		    if(m.containsKey(c)){
			    stack.push(c);

         }else{
	         if(stack.empty()){
		           return false;
         }

        char previousOpening=stack.pop();
        if(m.get(previousOpening)!=c){
	     return false;
	}


}
}

	return stack.empty(); 
    }
}