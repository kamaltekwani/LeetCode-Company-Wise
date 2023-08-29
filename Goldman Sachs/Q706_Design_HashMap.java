/*
 * Problem Link : https://leetcode.com/problems/design-hashmap/
 * Solution Link : https://leetcode.com/problems/design-hashmap/solutions/1097755/js-python-java-c-updated-hash-array-solutions-w-explanation/
 * 
 *
 * Time Complexity : 
 * Space Complexity : O(1000001)
 */

class Q706_Design_HashMap 
{
    int array[];

    public MyHashMap() 
    {
        array = new int[1000001];
        Arrays.fill(array, -1);
    }
    
    public void put(int key, int value) 
    {
        array[key] = value;    
    }
    
    public int get(int key) {
        return array[key];
    }
    
    public void remove(int key) {
        array[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
