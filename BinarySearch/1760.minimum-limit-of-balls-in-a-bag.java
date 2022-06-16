/*
 * @lc app=leetcode id=1760 lang=java
 *
 * [1760] Minimum Limit of Balls in a Bag
 */

// @lc code=start
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max=Integer.MIN_VALUE;
        int minpenalty=0;
       for(int i=0;i<nums.length;i++)
       {
        max=Math.max(max,nums[i]);
       }
       int start=1,end=max;
       while(start<=end)
    {
        int mid=start+(end-start)/2;
        if(isPossible(nums,maxOperations,mid)==true)
        {
            minpenalty=mid;
            end=mid-1;
        }
        else
        start=mid+1;
    }
    
    return minpenalty;
}

static boolean isPossible(int nums[], int maxOperations,int penalty)
{
  int opreq=0;
  for(int a:nums)
  {
    int x=a/penalty;
    if(a%penalty==0)
    x--;
    opreq+=x;
  } 
  return opreq<=maxOperations; 
}
}
// @lc code=end

