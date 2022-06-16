/*
 * @lc app=leetcode id=1237 lang=java
 *
 * [1237] Find Positive Integer Solution for a Given Equation
 */

// @lc code=start
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
      List<List<Integer>> ans=new ArrayList<>();
      for(int i=1;i<=1000;i++)
      {
        int res=binarySearch(z,i,customfunction);
        if(res!=-1)
        {
            ArrayList<Integer> temp =new ArrayList<>();
            temp.add(i);
            temp.add(res);
            ans.add(temp);
        }
      }
      return ans;  
    }
    static int binarySearch(int z,int x ,CustomFunction customfunction )
    {
       int start=1,end=1000;
       while(start<=end)
       {
        int mid=start+(end-start)/2;
        int temp= customfunction.f(x,mid);
        if(temp==z)
        return mid;
        else if(temp>z)
        end=mid-1;
        else if(temp<z)
        start=mid+1;
       }
       return -1;
    }
}
// @lc code=end

