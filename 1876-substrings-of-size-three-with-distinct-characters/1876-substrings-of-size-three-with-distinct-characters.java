class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for(int i = 0; i <= s.length() - 3; i++) {

            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);

            if(a != b && b != c && a != c) {
                count++;
            }
        }

        return count;
    }
}

/* Using Method:

import java.util.*;

public class window {

	public static int code(String s,int count) {	
		// TODO Auto-generated method stub
		for(int i=0;i<s.length()-3;i++) {
			char a =s.charAt(i);
			char b = s.charAt(i+1);
			char c = s.charAt(i+2);
		
			if(a!=b && b!=c && c!=a) {
				count++;
			
		}
	}
		return count ;
	}
		
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count =0;
		String s =scan.next();
		System.out.println(code(s,count));
		scan.close();
	}

} */

/* Using Codeforces approach:
    package slidingwindow;

import java.util.*;

public class window {

		
		// TODO Auto-generated method stub
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count =0;
		String s =scan.next();
		for(int i=0;i<s.length()-3;i++) {
			char a =s.charAt(i);
			char b = s.charAt(i+1);
			char c = s.charAt(i+2);
			
			if(a!=b && b!=c && c!=a) {
				count++;
				
			}
			
			
			
		}
		System.out.println(count);
		scan.close();
	}

}
*/
