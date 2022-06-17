/*
 * @lc app=leetcode id=410 lang=java
 *
 * [410] Split Array Largest Sum
 */

// @lc code=start
class Solution {
   
        public int splitArray(int[] nums, int m) {
            int sum=0, max=0;
           for(int i=0;i<nums.length;i++)
           {
               sum+=nums[i];
               max=Math.max(max,nums[i]);
               
           }
            int start=max,end=sum,ans=0;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                 if(isPossible(nums,m,mid)==true)
                 {
                     ans=mid;
                     end=mid-1;
                     
                 }
                else
                    start=mid+1;
            }
           
          return ans;  
        }
        static boolean isPossible(int nums[],int m,int mid)
        {
            int sum=0;
            int mq=1;
            for(int a:nums)
                
            {
              if(a+sum>mid)
              {
                  mq++;
                  sum=a;
                
            }
                else
                    sum+=a;
                
        }
            return mq<=m;
    }
    }
    
// @lc code=end

