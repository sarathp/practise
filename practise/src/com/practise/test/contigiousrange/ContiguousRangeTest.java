package com.practise.test.contigiousrange;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContiguousRangeTest {

    public static void main(String[] args) {        
        List<Integer> range = IntStream.rangeClosed(0, 2) .boxed().collect(Collectors.toList());
        for(Integer r: range ) {
            System.out.println(r);
        }
        BigInteger bigInteger = BigInteger.valueOf(1);
        BigInteger bigInteger2 = BigInteger.valueOf(2);
        
        Map<BigInteger, String> testMap = new HashMap<BigInteger, String>();
        testMap.put(bigInteger, "hello");
        testMap.put(bigInteger2, "helloworld");
        
        
        for(BigInteger key : testMap.keySet()) {
            System.out.println("key:"+key+ " , value:"+testMap.get(key));
        }
        
        BigInteger dbLeadID1 = BigInteger.valueOf(1);
        BigInteger dbLeadID2 = BigInteger.valueOf(2);
        BigInteger dbLeadID3 = BigInteger.valueOf(3);
        BigInteger currentKey = BigInteger.valueOf(-1);
        System.out.println(currentKey == BigInteger.valueOf(-1));
        System.out.println(dbLeadID2.subtract(dbLeadID1).equals(BigInteger.ONE));
        System.out.println(dbLeadID3.subtract(dbLeadID1).equals(BigInteger.ONE));
        System.out.println(currentKey);
        System.out.println("currentKey is: "+currentKey);
        
        BigInteger minusOne = BigInteger.valueOf(-1);
        BigInteger currentKey2 = minusOne;
        System.out.println(currentKey2 == minusOne);
        
        Map<BigInteger, BigInteger> contiguousMap = new HashMap<BigInteger, BigInteger>();
        contiguousMap.put(dbLeadID1, dbLeadID3);
        contiguousMap.put(dbLeadID2, dbLeadID3);
        for (BigInteger key : contiguousMap.keySet()){
            System.out.println("Total Leads Between "+ key + " And "+ contiguousMap.get(key) +" is: "+contiguousMap.get(key).subtract(key).add(BigInteger.ONE));
         
        }
        Object obj = null;
        
        String.valueOf(obj);
        ArrayList<Integer> list = null;
        System.out.println(list == null ? 0 : list.size());
        
        Long totalCount = 24l+ 1;
        String indexedResult = null;
        System.out.println (totalCount.longValue());
        if(totalCount.equals(Long.valueOf(indexedResult)) ){
            System.out.println("Range Count Matched:: Total Leads Count: "+totalCount+" , Indexed Leads Count: "+indexedResult);
        }else{
            System.out.println("ERROR - RANGE COUNT NOT MATCHED!!! - Total Leads Count: "+totalCount+" , Indexed Leads Count: "+indexedResult);
        }

    }

}
