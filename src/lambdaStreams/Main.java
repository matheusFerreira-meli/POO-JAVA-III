package lambdaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Exemplo de Stream
        List<String> countries = Stream.of("Brasil", "Argentina")
                .map(String::toUpperCase) // equivalente a country -> country.toUpperCase
                .collect(Collectors.toList());

        countries.forEach(System.out::println);
        System.out.println(countries);

        // Exemplo 2 de Stream
        List<Integer> numbers = Arrays.asList(4, 2, 6, 9, 8, 5, 1);
        List<Integer> filteredNumbers = numbers.stream().filter(number -> number > 5).collect(Collectors.toList());
        System.out.println("filteredNumbers" + filteredNumbers);

        // Exemplo 3 de Stream
        Integer result = numbers.stream().mapToInt(number -> number * number).sum();
        System.out.println(result);

        // Exemplo 4 Stream
        Map<String, List<Integer>> group = numbers
                .stream()
                .collect(Collectors.groupingBy(number -> {
                    if (number % 2 == 0) return "Par";
                    return "Impar";
                }));

        System.out.println("groupingBy: " + group);

        // Exemplo 5 Stream
        String joining = numbers.stream()
                .map(String::valueOf) // Transformei em strings, pois o joining só aceita string
                .collect(Collectors.joining(" - ")); // parametro que separa cada item da lista (opcional)

        System.out.println("joining: " + joining);
    }
}
