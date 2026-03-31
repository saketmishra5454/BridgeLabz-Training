import java.util.*;

class MyHashMap<K, V> {

    private static class Node<K, V> {
        K key;
        V val;
        Node<K, V> next;
        Node(K k, V v) { key = k; val = v; }
    }

    private List<Node<K,V>> table;
    private int size = 16; // default size just random

    public MyHashMap() {
        table = new ArrayList<>(Collections.nCopies(size, null));
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % size; // hashing mod size
    }

    public void put(K key, V value) {
        int idx = getIndex(key);
        Node<K,V> head = table.get(idx);

        // chnage value if key already exists
        Node<K,V> curr = head;
        while (curr != null) {
            if (curr.key.equals(key)) {
                curr.val = value;
                return;
            }
            curr = curr.next;
        }

        // insert new node at head (lazy way)
        Node<K,V> newNode = new Node<>(key, value);
        newNode.next = head;
        table.set(idx, newNode);
    }

    public V get(K key) {
        int idx = getIndex(key);
        Node<K,V> curr = table.get(idx);

        while (curr != null) {
            if (curr.key.equals(key))
                return curr.val;
            curr = curr.next;
        }
        return null; // not found
    }

    public void remove(K key) {
        int idx = getIndex(key);
        Node<K,V> curr = table.get(idx);
        Node<K,V> prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) table.set(idx, curr.next);
                else prev.next = curr.next;
                return; // removed
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

public class CustomHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("banana", 30); // update value

        System.out.println(map.get("banana")); // 30
        map.remove("apple");
        System.out.println(map.get("apple")); // null
    }
}
