package com.practise.test.contigiousrange;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//guava imports
import com.google.common.collect.Range;
import com.google.common.collect.Streams;

public class Intervals {
    
    public static void main(String[] args) {
        Intervals intervals = new Intervals();
        Set<Long> resultSet = new HashSet<Long>();
        resultSet.add(1l);
        resultSet.add(2l);
        resultSet.add(3l);
        resultSet.add(6l);
        resultSet.add(7l);
        resultSet.add(9l);
        resultSet.add(10l);
        resultSet.add(11l);   
        resultSet.add(-1l);   
       
        List<Range<Long>> ranges = intervals.findContiguousIntervals(resultSet);
        
        for(Range<Long> r: ranges) {
            System.out.println("LowerEnd: "+r.lowerEndpoint() +" UpperEnd:" +r.upperEndpoint());
        }
        
    }

  public static List<Range<Long>> findContiguousIntervals(Set<Long> resultSet){
     if(resultSet.isEmpty()) {
         return null;
     }
      
    //starts stream
    Stream<Long> starts = resultSet
                            .stream()
                            .filter( x -> !resultSet.contains(x-1L) )
                            .sorted();

    //ends stream
    Stream<Long> ends = resultSet
                          .stream()
                          .filter( x -> !resultSet.contains(x+1L) )
                          .sorted();
    
    //build intervals
    List<Range<Long>> intervals = Streams.zip(
          starts,
          ends,
          (st, en) -> Range.closed(st, en)
        ).collect(Collectors.toList());
    
    return intervals;
  } 
}