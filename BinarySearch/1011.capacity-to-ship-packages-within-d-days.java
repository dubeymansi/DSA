/*
 * @lc app=leetcode id=1011 lang=java
 *
 * [1011] Capacity To Ship Packages Within D Days
 */

// @lc code=start
class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int max=Integer.MIN_VALUE;
       int sum=0;
       int ans=0;
       for(int i=0;i<weights.length;i++)
       {
        sum+=weights[i];
        max=Math.max(max, weights[i]);
       }
       int start=max;
       int end=sum;
       while(start<=end)
       {
        int mid=start+(end-start)/2;
        if(isPossible(weights,days,mid))
        {
            ans=mid;
            end=mid-1;
        }
        else
        start=mid+1;
       }
       return ans;

    }
    static boolean isPossible(int weights[],int days,int mid)
    {
        int w=0;
        int d=1;

        for(int i=0;i<weights.length;i++)
        {
            if (weights[i] > mid || d > days) return false;
            if (w + weights[i] > mid) {
                w = weights[i];
                d++;
            } else {
                w += weights[i];
            }
        }
        return d<=days;
    }
}
// @lc code=end

