import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.*;

import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        stream();
        lambda();

    }
    public static void stream() {

        List<String> figures = Lists.newArrayList("circle", "square", "triangle");

        Collection<String> filteredStrings = Collections2.filter(

                figures, new Predicate<String>() {

                    public boolean apply(String input) {

                        return input.length()>6;
                    }

                });

        System.out.println(filteredStrings);
    }

    public static void lambda() {

        List<String> figures = Arrays.asList("circle", "square", "triangle");

        List<String> result = figures.stream()
                .filter(figure ->!"square".equals(figure))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
