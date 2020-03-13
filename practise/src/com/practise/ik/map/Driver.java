package com.practise.ik.map;
/**
 * Custom Hash Map Example
 * References: https://dzone.com/articles/custom-hashmap-implementation-in-java
 * https://github.com/YogenRaii/java-core/tree/master/src/main/java/com/eprogrammerz/examples/ds/custom/map
 * @author sarat.polavarap
 *
 */
public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
  
        CustomHashMap<String, String> myMap = new CustomHashMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Nepal", "Kathmandu");
        myMap.put("India", "New Delhi");
        myMap.put("Australia", "Sydney");
        myMap.put("China", "Beijing");
        System.out.println(myMap);
        System.out.println(myMap.size()); //Expected: 4
        System.out.println(myMap.get("Nepal")); //"Kathmandu", 
        System.out.println(myMap.get("Australia")); //"Sydney"
        
    }

}
