package com.practise.ik.map;

/**
 * Custom Hash Map Example
 * References: https://dzone.com/articles/custom-hashmap-implementation-in-java
 * https://github.com/YogenRaii/java-core/tree/master/src/main/java/com/eprogrammerz/examples/ds/custom/map
 * @author sarat.polavarap
 *
 */
public class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;
    
    Entry(K k, V v, Entry<K,V> e){
        this.key = k;
        this.value = v;
        this.next = e;
    }
    
    @Override
    public String toString() {
        return "[key->"+ key+", value->"+value+"]";
      
    }

}
