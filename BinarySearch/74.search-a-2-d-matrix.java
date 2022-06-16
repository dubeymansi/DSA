import javax.lang.model.util.ElementScanner14;

/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(i>=0 && j>=0 && i<matrix.length && j<matrix[0].length)
        {
            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]<target)
            i++;
            else if(matrix[i][j]>target)
            j--;
        }
        return false;
    }
}
// @lc code=end

