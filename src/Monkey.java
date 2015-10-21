/**
 * Created by gerardogtn on 10/20/15.
 */
public class Monkey extends Animal implements Primate{

    private String color;
    private int platanosComidos = 0;

    public Monkey(String nombre) {
        super(nombre);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void treparArbol(double tamanoArbol) {
        if (tamanoArbol < 40){
            System.out.println("Woo!! Ya trepe el arbol :D");
        } else {
            System.out.println("El arbol esta demasiado alto. Me da miedo :(");
        }

    }

    @Override
    public void comerPlatano() {
        if (platanosComidos < 5){
            platanosComidos++;
        } else {
            System.out.println("Estoy muy lleno, necesito dormir!"); 
        }
    }

    @Override
    public void lucharPorTerritorio() {
        System.out.println("VETE O TE MATO!");
    }
}
