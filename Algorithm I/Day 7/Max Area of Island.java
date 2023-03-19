class Solution {
    public int max = 0;
    public int sum = 0;
    public void areaSum(int[][] grid ,int r ,int c){
    if(r>=grid.length || c>=grid[0].length || r<0|| c<0 || grid[r][c]==0){
            return ;
        }
        sum++;
        grid[r][c] = 0;
        areaSum(grid,r,c+1);
        areaSum(grid,r,c-1);
        areaSum(grid,r+1,c);
        areaSum(grid,r-1,c);
    }
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[i].length;j++){
                if(grid[i][j]!=0){
                    sum = 0; 
                    areaSum(grid,i,j);
                    max  = Math.max(max,sum);
                }
            }
        }
        return max;
    }
}
