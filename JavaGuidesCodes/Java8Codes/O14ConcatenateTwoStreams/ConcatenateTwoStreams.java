package Java8Codes.O14ConcatenateTwoStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {
    public static void main(String[] args) 
    {
        Stream<String> stream1 = Stream.of("Java", "Python", "C++");
        Stream<String> stream2 = Stream.of("JavaScript", "TypeScript", "Kotlin");

        Stream<String> concatinatedStream = Stream.concat(stream1, stream2);

        List<String> resualtList = concatinatedStream.collect(Collectors.toList());
        
        System.out.println("Concatenated Stream : "+resualtList);
    }
}
