/*
 * Problem Link : https://leetcode.com/problems/trapping-rain-water/
 * Solution Link : 
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


class Q42_Trapping_Rain_Water 
{
    public int trap(int[] height) 
    {
        int maxHeight = 0;
        int maxHeightIndex = -1;

        int sum = 0;

        for(int index=0 ; index<height.length ; index++)
            if(maxHeight < height[index])
            {
                maxHeight = height[index];
                maxHeightIndex = index;
            }
        
        int maxLeft = height[0];

        for(int index=1 ; index<maxHeightIndex ; index++)
        {
            if(maxLeft < height[index])
                maxLeft = height[index];
            else
                sum += maxLeft - height[index];
        }


        int maxRight = height[height.length-1];

        for(int index=height.length-2 ; index>maxHeightIndex ; index--)
        {
            if(maxRight < height[index])
                maxRight = height[index];
            else
                sum += maxRight - height[index];
        }

        return sum;
    }
}
