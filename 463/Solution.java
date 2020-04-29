class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int perimeter = 0;
        int[][] adjPositions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0; j < n ; ++j) {
                if(grid[i][j] == 1) {
                    for(int[] pos : adjPositions) {
                        int newI = i + pos[0];
                        int newJ = j + pos[1];
                        if(newI < 0 || newJ < 0 || newI == m  || newJ == n || grid[newI][newJ] == 0) {
                            perimeter = perimeter + 1;
                        }
                    }
                }
            }
        }
        return perimeter;
    }
}
