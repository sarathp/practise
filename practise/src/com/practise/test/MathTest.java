package com.practise.test;

public class MathTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double d = 17.0;
            System.out.println(Math.pow(Math.ceil(Math.sqrt(d)), 2) == d);
            
            System.out.println(Math.pow(4.47, 2));
            
            
            int n = 8;
            int m = 5764801;
            double sq = Math.sqrt(m);
            System.out.println(sq);
            System.out.println(Math.pow(7, 8));
            if(Math.pow(sq, n)==m){
                System.out.println(sq);
            }else{
                System.out.println(-1);
            }
    }

}
