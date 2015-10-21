import java.util.ArrayList;
import java.util.List;

/**
 * Created by gerardogtn on 10/20/15.
 */
public class Zoo {
    public static final String nombre = "Dev F.";
    List<Animal> animales;
    List<Persona> empleados;

    public Zoo() {
        this.animales = new ArrayList<Animal>();
        this.empleados = new ArrayList<Persona>();
    }

    public String getNombre(){
        return  nombre;
    }

    public void addAnimal(Animal animal){
        this.animales.add(animal);
    }

    public void addEmpleado(Persona empleado){
        this.empleados.add(empleado);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animales=" + animales +
                ", empleados=" + empleados +
                '}';
    }
}
