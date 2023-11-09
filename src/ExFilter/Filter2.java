import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        List<Integer> numerosMayores50 = numeros.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println(numerosMayores50);
    }
}
