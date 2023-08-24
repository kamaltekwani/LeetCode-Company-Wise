/*
 * Problem Link : https://leetcode.com/problems/merge-sorted-array/
 * Solution Link : https://leetcode.com/problems/merge-sorted-array/solutions/2847423/runtime-0-ms-beats-100-c-java/
 *
 * Time Complexity : O(M + N)
 * Space Complexity : O(1)
 */


class Q88_Merge_Sorted_Array 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int index = m + n - 1;

        m--;
        n--;

        while(m >= 0 && n >= 0)
        {
            if(nums1[m] > nums2[n])
                nums1[index--] = nums1[m--];
            else
                nums1[index--] = nums2[n--];
        }

        while(n >= 0)
            nums1[index--] = nums2[n--];
    }
}
