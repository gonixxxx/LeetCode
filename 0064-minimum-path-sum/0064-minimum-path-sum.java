class Solution {
    static int maxNum = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                grid[i][j] += Math.min(j == 0 ? maxNum : grid[i][j-1], 
                                       i == 0 ? maxNum : grid[i-1][j]);
            }
        }
        
        return grid[m-1][n-1];
    }
}