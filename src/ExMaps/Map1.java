import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(new Alumno("Juan", 8), new Alumno("María", 7), new Alumno("Pedro", 9));
        List<String> nombresConNotas = alumnos.stream()
                .map(a -> a.getNombre() + " - Nota: " + a.getNota())
                .collect(Collectors.toList());
        System.out.println(nombresConNotas);
    }
}

class Alumno {
    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}

