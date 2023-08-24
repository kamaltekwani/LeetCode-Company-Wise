/*
 * Problem Link : https://leetcode.com/problems/permutations/
 * Solution Link : https://www.youtube.com/watch?v=R3Sm9V2OSCo
 *
 * Time Complexity : O(N! * N) -> [ https://leetcode.com/problems/permutations/solutions/2992590/easiest-faang-method-ever/ ]
 * Space Complexity : O(N)
 */

class Q46_Permutations 
{
    public void findPermutations(int nums[], boolean visited[], List<Integer> list, List<List<Integer>> result)
    {
        if(list.size() == nums.length)
        {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for(int index=0 ; index<nums.length ; index++)
        {
            if(visited[index])
                continue;

            visited[index] = true;
            list.add(nums[index]);
            findPermutations(nums, visited, list, result);
            visited[index] = false;
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        boolean visited[] = new boolean[nums.length];
        findPermutations(nums, visited, list, result);
        return result;
    }
}
