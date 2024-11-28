package principal;

public class Coche {

    private String marca;
    private String modelo;
    private int velocidadMaxima;


    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("La velocidad maxima ahora es: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("Incremento no valido la velocidad no ha cambiado");
        }
    }


    @Override
    public String toString() {
        return "Coche [Marca=" + marca + ", Modelo=" + modelo + ", Velocidad Máxima=" + velocidadMaxima + " km/h]";
    }
}
