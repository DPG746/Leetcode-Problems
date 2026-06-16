import java.util.*;

class Solution {
    public int getLength(int[] arr) {
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> freq = new HashMap<>();      // value -> count
            HashMap<Integer, Integer> freqOfFreq = new HashMap<>(); // count -> how many distinct values have this count

            for (int j = i; j < n; j++) {
                int val = arr[j];
                int oldCount = freq.getOrDefault(val, 0);
                int newCount = oldCount + 1;

                // remove val's old count from freqOfFreq
                if (oldCount > 0) {
                    int c = freqOfFreq.get(oldCount);
                    if (c == 1) {
                        freqOfFreq.remove(oldCount);
                    } else {
                        freqOfFreq.put(oldCount, c - 1);
                    }
                }

                // update freq and add val's new count to freqOfFreq
                freq.put(val, newCount);
                freqOfFreq.put(newCount, freqOfFreq.getOrDefault(newCount, 0) + 1);

                int windowLen = j - i + 1;

                if (freq.size() == 1) {
                    ans = Math.max(ans, windowLen);
                    continue;
                }

                if (freqOfFreq.size() == 2) {
                    Iterator<Integer> it = freqOfFreq.keySet().iterator();
                    int a = it.next();
                    int b = it.next();
                    int lo = Math.min(a, b);
                    int hi = Math.max(a, b);
                    if (hi == 2 * lo) {
                        ans = Math.max(ans, windowLen);
                    }
                }
            }
        }
        return ans;
    }
}