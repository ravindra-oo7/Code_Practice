package Theory_Practice;

import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        String[] names={"Ravi","Alok","Damaji","Rani","Devyani","Roshni","Narendra"};

        // Stream.of(names)
        // .filter(s->s.endsWith("i"))
        // .map(s->s.toUpperCase())
        // .forEach(s->System.err.println(s));

        System.out.println("_____________________________________");

        Stream.of(names)
        .sorted((x,y)->y.compareTo(x))
        .forEach(s->System.out.println(s));

        System.out.println("_____________________________________");

        Stream.of(names)
        .sorted()
        .forEach(s->System.out.println(s));

        System.out.println("_____________________________________");

        Stream.of(names)
        .sorted((x,y)->x.compareTo(y))
        .forEach(s->System.out.println(s));

    }
}
