import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<Integer> bases = List.of(1, 2, 3, 4, 5); 
        Integer exponente = 2;
        List<Integer> resultados = bases.stream()
                .map(p -> Ejercicio2.potencia(p, exponente))
                .collect(Collectors.toList());

        System.out.println("Lista de numeros enteros:" + bases);
        System.out.println("Lista con resultado de aplicar la operación de potencia a 2" + resultados);
    }

    public static Integer potencia(Integer base, Integer exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}
