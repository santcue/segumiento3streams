import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("manzana", "naranja", "plátano", "uva", "pera");

        List<String> palabrasLargas = palabras.stream()
                .filter(p -> p.length() > 5)
                .collect(Collectors.toList());

        System.out.println(palabrasLargas);
    }
}
