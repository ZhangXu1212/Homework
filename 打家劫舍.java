class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int[][] a = new int[n][2];
		
		//初始化，两种情况，偷或者不偷
        a[0][0] = 0;
        a[0][1] = nums[0];

        for (int i = 1; i < n; i++) {
			//dp方程
			//0：不偷，1：偷
            a[i][0] = Math.max(a[i-1][0],a[i-1][1]);
            a[i][1] = a[i-1][0] + nums[i];
        }
        return Math.max(a[n-1][0],a[n-1][1]);
    }
}