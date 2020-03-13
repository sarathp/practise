package com.practise.ik.floater.api;

public class LongTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
       System.out.println((Long) null);
       System.out.println((String) null); 
       System.out.println((Object) null); 

    }
    
    public static long parseLong(Object value) {
        try {
                return Long.parseLong(String.valueOf(value));
        } catch (Exception exce) {
            // Suppress exception
        }
        return 0l;
    }
    

}


