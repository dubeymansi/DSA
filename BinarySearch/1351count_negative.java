class Solution {
    public int countNegatives(int[][] grid) {
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
}