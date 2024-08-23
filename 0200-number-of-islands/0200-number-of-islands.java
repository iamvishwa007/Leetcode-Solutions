class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0)
           return 0;
        int numisland=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    numisland++;
                    island(grid,i,j);
                }
            }
        }
        return numisland;
    }
    public static void island(char grid[][],int i,int j){
        if(i<0 ||i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1')
         return;

        grid[i][j]='0';
        island(grid,i+1,j);
        island(grid,i-1,j);
        island(grid,i,j+1);
        island(grid,i,j-1);
    }
}