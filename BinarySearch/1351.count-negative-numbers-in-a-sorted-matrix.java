/*
 * @lc app=leetcode id=1351 lang=java
 *
 * [1351] Count Negative Numbers in a Sorted Matrix
 */

// @lc code=start
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
           int j=grid[0].length-1;
           if(grid[i][j]>=0)
           continue;
           else if(grid[i][j]<0)
           {
            while(j>=0 && grid[i][j]<0)
            {
                j--;
                c++;

            }

           }
    }
  
    return c;
}
}
// @lc code=end

