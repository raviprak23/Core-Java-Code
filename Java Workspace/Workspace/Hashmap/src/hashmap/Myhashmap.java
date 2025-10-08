package hashmap;


public class Myhashmap { 
 
    private Entry[] packet; 
    private int capacity = 16; 
 
    public Myhashmap() { 
        packet = new Entry[capacity]; 
    } 
 
    public void put(Object key, Object value) { 
        int hashCode = key.hashCode(); 
        int index = hashCode % capacity; 
 
        Entry old = packet[index]; 
        while (old != null) { 
            if (old.key.equals(key)) { 
                old.value = value; 
                return; 
            } 
            old = old.next; 
        } 
 
        Entry newEntry = new Entry(key, value); 
        newEntry.next = packet[index]; 
        packet[index] = newEntry; 
    } 
 
    public Object get(Object key) { 
        int hashCode = key.hashCode(); 
        int index = hashCode % capacity; 
 
        Entry old = packet[index]; 
        while (old != null) { 
            if (old.key.equals(key)) { 
                return old.value; 
            } 
            old = old.next; 
        } 
 
        return null; 
    } 
 
    public void remove(Object key) { 
        int hashCode = key.hashCode(); 
        int index = hashCode % capacity; 
 
        Entry old = packet[index]; 
        Entry prevEntry = null; 
        while (old != null) { 
            if (old.key.equals(key)) { 
                if (prevEntry == null) { 
                    packet[index] = old.next; 
                } else { 
                    prevEntry.next = old.next; 
                } 
                return; 
            } 
            prevEntry = old; 
            old = old.next; 
        } 
    } 
 
    private class Entry { 
        Object key; 
        Object value; 
        Entry next; 
 
        public Entry(Object key, Object value) { 
            this.key = key; 
            this.value = value; 
        } 
    } 
 
    public static void main(String[] args) { 
        Myhashmap map = new Myhashmap(); 
        map.put("key1", "India"); 
        map.put("key2", "Pakistan"); 
        map.put("key3", "Germany"); 
         
 
        System.out.println(map.get("key1")); // Output: 1 
        System.out.println(map.get("key2")); // Output: 2 
        System.out.println(map.get("key3")); // Output: 3 
 
        map.remove("key2"); 
        System.out.println("\n"); 
 
        System.out.println(map.get("key1")); // Output: 1 
        System.out.println(map.get("key2")); // Output: null 
        System.out.println(map.get("key3")); // Output: 3 
    } 
}