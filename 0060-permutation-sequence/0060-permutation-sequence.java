class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=n;i++){
            numbers.add(i);


        }

        int[] factorial = new int[n+1];
        factorial[0]=1;
        for(int i=1;i<=n;i++){
            factorial[i]=factorial[i-1]*i;

        }

        k=k-1;

        StringBuilder res = new StringBuilder();

        for(int i=n;i>=1;i--){
            int blocksize=factorial[i-1];
            int index = k/blocksize;

            res.append(numbers.get(index));
            numbers.remove(index);

            k=k%blocksize;

        }
        return res.toString();
    }
}