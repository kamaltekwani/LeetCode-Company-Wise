/*
 * Problem Link : https://leetcode.com/problems/lru-cache/
 * Solution Link : (1) https://www.youtube.com/watch?v=xDEuM5qa0zg 
                   (2) https://www.youtube.com/watch?v=Xc4sICC8m4M
 *
 * Time Complexity : O(1)
 * Space Complexity : O(N) N -> Capacity of the LRU Cache
 */

class Q146_LRU_Cache 
{
    class Node
    {
        Node previous;
        Node next;
        int key;
        int value;

        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }

    Map<Integer,Node> map = new HashMap<Integer,Node>();
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;

    public LRUCache(int capacity) 
    {
        this.capacity = capacity;
        head.next = tail;
        tail.previous = head;
    }
    
    public int get(int key) 
    {
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            remove(node);
            insert(new Node(node.key, node.value));
            return node.value;
        }   
        else
            return -1; 
    }

    public void remove(Node node)
    {
        map.remove(node.key);
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    public void insert(Node node)
    {
        map.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.previous = head;
        node.next = headNext;
        headNext.previous = node;
    }
    
    public void put(int key, int value) 
    {
        if(map.containsKey(key))
            remove(map.get(key));

        if(map.size() == capacity)
            remove(tail.previous);

        insert(new Node(key, value));
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
