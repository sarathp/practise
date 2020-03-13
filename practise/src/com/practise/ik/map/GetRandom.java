package com.practise.ik.map;

import java.util.HashMap;
import java.util.Random;
/**
 * Get random key generator on hash map
 * References:
 * https://stackoverflow.com/questions/929554/is-there-a-way-to-get-the-value-of-a-hashmap-randomly-in-java
 * https://crunchify.com/java-how-to-get-random-key-value-element-from-hashmap/
 * @author sarat.polavarap
 *
 */
public class GetRandom {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        HashMap<String, String> companies = new HashMap<String, String>();
        companies.put("eBay", "South San Jose");
        companies.put("Paypal", "North San Jose");
        companies.put("Google", "Mountain View");
        companies.put("Yahoo", "Santa Clara");
        companies.put("Twitter", "San Francisco");
        
        Object[] objKeys = companies.keySet().toArray();
        Object key = objKeys[new Random().nextInt(objKeys.length)];
        System.out.println("************ Random Value ************ \n" + key + " :: " + companies.get(key));

    }

}
