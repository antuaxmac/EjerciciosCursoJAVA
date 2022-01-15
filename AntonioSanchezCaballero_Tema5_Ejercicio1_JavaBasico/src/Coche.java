public class Coche {

    String marca;
    String modelo;
    String color;
    int numPuertas;
    double velMax;
    boolean sportMode;


    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int numPuertas, double velMax, boolean sportMode) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPuertas = numPuertas;
        this.velMax = velMax;
        this.sportMode = sportMode;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numPuertas=" + numPuertas +
                ", velMax=" + velMax +
                ", sportMode=" + sportMode +
                '}';
    }
}
