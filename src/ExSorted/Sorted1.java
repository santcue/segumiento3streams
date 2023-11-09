import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted1 {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(new Producto("Laptop", 800), new Producto("Smartphone", 500), new Producto("Tablet", 300));
        List<Producto> productosOrdenadosPorPrecio = productos.stream()
                .sorted(Comparator.comparing(Producto::getPrecio))
                .collect(Collectors.toList());
        System.out.println(productosOrdenadosPorPrecio);
    }
}

class Producto {
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + precio + ")";
    }
}
