package Theory_Practice;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        String[] names={"Ravi","Alok","Damaji","Rani","Devyani","Roshni","Narendra","Rani"};

        // Stream.of(names)
        // .filter(s->s.endsWith("i"))
        // .map(s->s.toUpperCase())
        // .forEach(s->System.err.println(s));

        // System.out.println("_____________________________________");

        // Stream.of(names)
        // .sorted((x,y)->y.compareTo(x))
        // .forEach(s->System.out.println(s));

        // System.out.println("_____________________________________");

        // Stream.of(names)
        // .sorted()
        // .forEach(s->System.out.println(s));

        // System.out.println("_____________________________________");

        // Stream.of(names)
        // .sorted((x,y)->x.compareTo(y))
        // .forEach(s->System.out.println(s));

        // System.out.println("_____________________________________");

        // Stream.of(names)
        //     .skip(2)
        //     .limit(4)
        //     .forEach(s->System.out.println(s));

        // System.out.println("_____________________________________");

        // Stream.of(names)
        //     .distinct()
        //     .forEach(s->System.out.println(s));

        // System.out.println("_____________________________________");

        // long cnt = Stream.of(names)
        //     .count();

        // System.out.println(cnt);  
        
        // System.out.println("_____________________________________");

        // List<String> list = Stream.of(names)
        //                          .collect(Collectors.toList());

        // for (String e : list) {
        //     System.out.println(e);
        // }

        //  System.out.println("_____________________________________");

        //  Set<String> set = Stream.of(names) 
        //                     .collect(Collectors.toSet());
        //  for (String e : set) {
        //     System.out.println(e);
        //  }       
           
        System.out.println("_____________________________________");

        Integer result = Stream
                        .iterate(1,i-> i+1)
                        .limit(5)
                        .reduce(0,(x,y)->x+y);
        System.out.println(result);
                                          
    }
}
