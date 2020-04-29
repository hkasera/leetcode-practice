class Solution {
    public void dfs(int i, int j, int[][] grid, boolean[][] visited , int m, int n, int color, int val) {
        visited[i][j] = true;
        int[][] adjPositions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        for(int[] pos : adjPositions) {
            int newI = i + pos[0];
            int newJ = j + pos[1];
            if(newI < 0 || newI == m || newJ < 0 || newJ == n || (!visited[newI][newJ] && grid[newI][newJ] != val)) {
                grid[i][j] = color;
            }
            else if(newI >= 0 && newI < m && newJ >= 0 && newJ < n && grid[newI][newJ] == val && !visited[newI][newJ]) {
                dfs(newI, newJ, grid, visited, m, n, color, val);
            }
        }
    }
    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return grid;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        dfs(r0, c0, grid, visited, m, n, color, grid[r0][c0]);
        return grid;
    }
}
