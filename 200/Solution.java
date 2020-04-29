class Solution {
    public void dfs(int i, int j, char[][] grid, boolean[][] visited , int m, int n) {
        visited[i][j] = true;
        int[][] adjPositions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        for(int[] pos : adjPositions) {
            int newI = i + pos[0];
            int newJ = j + pos[1];
            if(newI >= 0 && newI < m && newJ >= 0 && newJ < n && grid[newI][newJ] == '1' && !visited[newI][newJ]) {
                dfs(newI, newJ, grid, visited, m, n);
            }
        }
    }
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int numIslands = 0;
        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0; j < n ; ++j) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    numIslands++;
                    dfs(i, j, grid, visited, m, n);
                }
            }
        }
        return numIslands;
    }
}
