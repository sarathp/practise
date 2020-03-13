package com.practise.ik.map;

public class CustomHashMap<K, V> {
    
    private static final int INITIAL_CAPACITY = 1<<4;
    private Entry<K, V> buckets[] = null;
    private int size=0;
    
    /**
     * Custom Hash Map Example
     * References: https://dzone.com/articles/custom-hashmap-implementation-in-java
     * https://github.com/YogenRaii/java-core/tree/master/src/main/java/com/eprogrammerz/examples/ds/custom/map
     * @author sarat.polavarap
     *
     */
    CustomHashMap(){
        this(INITIAL_CAPACITY);
    }
    
    CustomHashMap(int capacity) {
        buckets = new Entry[capacity];
    }
    
    public void put(K key, V value) {
        Entry<K, V> newEntry = new Entry<K, V>(key, value, null);
        int bucket = getHash(key) % getBucketSize(); //Very Important Step
        Entry<K, V> existing = buckets[bucket];
        if(existing == null) {
            buckets[bucket] = newEntry;
            size++;
        }else {
            while(existing.next != null) {
                if(existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }
            if(existing.key.equals(key)) {
                existing.value = value;
                
            }else {
                existing.next =newEntry;
                size++;    
            }
            
        }
        
    }
    
    public V get(K k) {
        int bucket = getHash(k) % getBucketSize();
        Entry<K, V> existing = buckets[bucket];
        while(existing != null) {
            if(existing.key.equals(k)) {
                return existing.value;
            }
            existing = existing.next;
        }
        
       return null;
    }
    
   private int getHash(K key) {
        if(key ==null) {
            return 0;
        }else {
           return Math.abs(key.hashCode());
        }
    }
   
   private int getBucketSize() {
       return buckets.length;
   }
   
   public int size() {
       return size;
   }
   
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       for (Entry<K, V> entry : buckets) {
           sb.append("[");
           while (entry != null) {
               sb.append(entry);
               if (entry.next != null) {
                   sb.append(", ");
               }
               entry = entry.next;
           }
           sb.append("]");
       }
       return "{" + sb.toString() + "}";
   }
    

}
