import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 3,20,578);
        List<Integer> numerosOrdenadosDeMayorAMenor = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdenadosDeMayorAMenor);
    }
}
