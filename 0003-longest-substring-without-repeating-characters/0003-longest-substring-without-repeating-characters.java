import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int l = 0;
        int maxLen = 0;

        for(int r = 0; r < s.length(); r++) {

            // If duplicate found
            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}

//Eclipse execution
/* 
import java.util.*;

public class window {

		
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		Set<Character> set=new HashSet<>();
		int l=0;
		int max=0;
		
		for(int r=0;r<s.length();r++) {
			while(set.contains(s.charAt(r))) {
				set.remove(s.charAt(l));
				l++;
			}
			set.add(s.charAt(r));
			max=Math.max(max, r-l+1);
			
			
		}
		System.out.println(max);
		scan.close();
		
		
	}

}
*/
