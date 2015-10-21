/**
 * Created by gerardogtn on 10/20/15.
 */
public class Orangutan extends Animal implements Primate {

    private String color = "Cafe";
    private int platanosComidos = 0;

    public Orangutan(String nombre) {
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
        if (tamanoArbol > 2){
            System.out.println("El arbol esta muy alto, no lo puedo trepar :(");
        } else {
            System.out.println("Ya trepe el arbol!! :D");
        }
    }

    @Override
    public void comerPlatano() {
        if (platanosComidos < 10){
            platanosComidos++;
        } else {
            System.out.println("Estoy muy lleno!! Ya no puedo comer :(");
        }
    }

    @Override
    public void lucharPorTerritorio() {
        System.out.println("GRRRRRRRRRR");
    }
}
