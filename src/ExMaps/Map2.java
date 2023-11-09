import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {
    public static void main(String[] args) {
        List<String> numerosEnTexto = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numeros = numerosEnTexto.stream()
                .map(n -> Integer.parseInt(n))
                .collect(Collectors.toList());
        System.out.println(numeros);
    }
}
