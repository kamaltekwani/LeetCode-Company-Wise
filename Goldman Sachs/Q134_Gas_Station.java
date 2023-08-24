/*
 * Problem Link : https://leetcode.com/problems/gas-station/
 * Solution Link : https://www.youtube.com/watch?v=3wUa7Lf1Xjk
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q134_Gas_Station 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int position = 0;
        int sum = 0;
        int total = 0;

        for(int index=0 ; index<gas.length ; index++)
        {
            sum += (gas[index] - cost[index]);

            if(sum < 0)
            {
                total += sum;
                sum = 0;
                position = index+1;
            }
        }

        total += sum;

        return total >= 0 ? position : -1;
    }
}
