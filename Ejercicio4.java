import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> listaFactoriales = palabras.stream()
                .map(x -> Ejercicio4.factorial(x))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listaFactoriales);
    }

    public static Integer factorial(Integer numero) {
        if (numero == 1){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }
    }

}