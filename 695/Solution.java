class Solution {
    public int findIslands(int i, int j, int m, int n, int[][] grid, boolean[][] visited) {
        visited[i][j] = true;
        int[][] adjCells = { {-1,0}, {1,0}, {0,-1}, {0,1}};
        int adjArea = 0;
        for(int[] adjCell : adjCells) {
            int newX = adjCell[0] + i;
            int newY = adjCell[1] + j;
            if(newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1 && !visited[newX][newY]) {
                adjArea = adjArea + findIslands(newX, newY, m, n, grid, visited);
            }
        }
        return 1 + adjArea;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxArea = 0;
        for(int i = 0; i < m ; ++i) {
            for (int j = 0; j < n ; ++j) {
                if(!visited[i][j] && grid[i][j] == 1) {
                    int currentArea = findIslands(i, j, m, n, grid, visited);
                    if(currentArea > maxArea) {
                        maxArea = currentArea;
                    }
                }
            }
        }
        return maxArea;
    }
}
