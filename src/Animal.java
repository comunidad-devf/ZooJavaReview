/**
 * Created by gerardogtn on 10/20/15.
 */
public abstract class Animal {
    protected String nombre;
    private static int counter = 1;
    private int id;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.id = counter++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
