class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = hammingWeight(i);
        }
        return res;
    }

    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n & (n-1);//清零最低位的1
        }
        return count;
    }
}