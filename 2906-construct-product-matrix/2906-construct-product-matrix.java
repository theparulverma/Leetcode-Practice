class Solution {
      final int mod = 12345;
    long p = 1;
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] ans = new int[n][m];
        int[][] prefix = new int[n][m];
        int[][] suffix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prefix[i][j] = (int) p;
                p *= grid[i][j];
                p %= mod;
            }
        }
        p = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                suffix[i][j] = (int) p;
                p *= grid[i][j];
                p %= mod;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int mul = prefix[i][j] * suffix[i][j];
                ans[i][j] = mul % mod;
            }
        }
        return ans;
    }
}
