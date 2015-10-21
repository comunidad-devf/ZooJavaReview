/**
 * Created by gerardogtn on 10/20/15.
 */
public class Elephant extends Animal{

    private String color = "Gris";
    private double tamanoColmillos = 1.0;

    public Elephant(String nombre){
        super(nombre);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(double tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }
}
