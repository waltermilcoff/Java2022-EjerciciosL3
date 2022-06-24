import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumnos> alumnos = List.of(
            new Alumnos("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumnos("Walter", "Milcoff", LocalDate.of(1980, 12, 7)),
                new Alumnos("Soledad", "Morales", LocalDate.of(1981, 3, 10)),
                new Alumnos("Lautaro", "Milcoff", LocalDate.of(2010, 10, 29)),
                new Alumnos("Eduardo", "Ortiz", LocalDate.of(1986, 07, 15))      
        );        
        Map<Object, Object> listaAlumnos = alumnos.stream().collect(Collectors.toMap(a -> a.getDatos(), p-> p.getEdad()));
        System.out.println(listaAlumnos);
    }    
}
class Alumnos{
    String nombre, apellido;
    LocalDate nacimiento;              
    Alumnos(String nom, String ape, LocalDate nac){
    nombre = nom;
    apellido = ape;
    nacimiento = nac;              
    }
    public String getDatos(){return nombre + " " + apellido;}
    public int getEdad(){
        Period diferenciaFechas = Period.between(nacimiento, LocalDate.now());
        int años = Math.abs(diferenciaFechas.getYears());
        return años;        
    }
}