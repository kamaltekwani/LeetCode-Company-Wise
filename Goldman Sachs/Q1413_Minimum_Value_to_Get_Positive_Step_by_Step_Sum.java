/*
 * Problem Link : https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 * Solution Link : https://www.youtube.com/watch?v=SUagl73pWuY
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q1413_Minimum_Value_to_Get_Positive_Step_by_Step_Sum 
{
    public int minStartValue(int[] nums) 
    {
        int prefix = 0;
        int minimum = Integer.MAX_VALUE;

        for(int index=0 ; index<nums.length ; index++)
        {
            prefix += nums[index];
            minimum = Math.min(minimum, prefix);
        }
        
        return minimum < 0 ? Math.abs(minimum) + 1 : 1;
    }
}
