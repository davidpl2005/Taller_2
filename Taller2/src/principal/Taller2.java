package principal;

public class Taller2 {
    public static void main(String[] args) {
        Estudiantes user = new Estudiantes(5, 18, "Steven");
        System.out.println("Detalles = " + user.getNombre() + user.getnotasPromedios() + user.getEdad());


        Coche coche = new Coche("Toyota", "Corolla", 180);

        System.out.println("Detalles iniciales del coche: " + coche);
        coche.acelerar(20); 
        coche.acelerar(-10); 


        System.out.println("Detalles finales del coche: " + coche);
    }
}
