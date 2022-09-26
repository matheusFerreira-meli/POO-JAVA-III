import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> countries = Stream.of("Brasil", "Argentina")
                .map(country -> country.toUpperCase())
                .collect(Collectors.toList());

        countries.forEach(System.out::println);
    }
}