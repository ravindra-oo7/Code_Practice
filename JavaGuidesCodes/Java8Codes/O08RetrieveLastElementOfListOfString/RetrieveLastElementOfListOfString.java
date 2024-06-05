package Java8Codes.O08RetrieveLastElementOfListOfString;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RetrieveLastElementOfListOfString {
    public static void main(String[] args)
    {
        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        //Approachg-01
        int size = strings.size();
        System.out.println("Last Element : "+strings.get(size-1) );

        //Approach-02
        Optional<String> lastElement = strings.stream()
                                                .reduce((first,second)->second);

        lastElement.ifPresent(ele->System.out.println("Last Element : "+ele));
    }
}
