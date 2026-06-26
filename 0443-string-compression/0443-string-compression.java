class Solution {
    public int compress(char[] chars) {
        int m = 0;
        int i = 0;
        while (i < chars.length) {
            char curr = chars[i];
            int cnt = 0;

            while (i < chars.length && curr == chars[i]) {
                i++;
                cnt++;

            }
            chars[m++] = curr;

            if (cnt > 1) {
                for (char c : String.valueOf(cnt).toCharArray()) {
                    chars[m++] = c;
                }

            }

        }

        return m;

    }
}

//  HashMap<Character,Integer> m = new HashMap<>();

//         for(char c: chars){
//             m.put(c,m.getOrDefault(c,0)+1);
//         }

//         String arr[] = new String[m.size()*2];

//         int i=0;

//         for(Map.Entry<Character,Integer> m1 : m.entrySet()){
//             arr[i++]=String.valueOf(m1.getKey());
//             arr[i++]=m1.getValue()>1?String.valueOf(m1.getValue()):"";

//         }
//         char[] d= String.join("",arr).toCharArray();
//         for (int j = 0; j < d.length; j++) {
//             chars[j] = d[j];
//         }

//         return d.length;