class Solution {
    public int countNegatives2(int[][] grid) {
        int start = 0 ;
        int end = grid[0].length - 1;
        int ans = 0 ;
        for(int i = 0 ; i< grid.length ; i++){
            start = 0 ;
            end = grid[0].length - 1;
            int min = grid[0].length; 
            while(start<=end){
                int mid = start + (end-start)/2;
                if(grid[i][mid]<0){
                    min = Math.min(min,mid);
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            ans += grid[0].length-min;
        }
        return ans;
    }
    public int countNegatives1(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length ;
        int i = n-1;
        int j = 0 ;
        int ans = 0 ;
        while(i>=0 && j<m){
            if(grid[i][j]<0){
                ans += m-j;
                i--;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}