package principal;

public class Estudiantes{
    private String nombre;
    private int edad;
    private double notasPromedios;

    public Estudiantes(double notasPromedios, int edad, String nombre) {
        this.notasPromedios = notasPromedios;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Estudiantes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El constructor no puede estar vacio");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa ni 0");
        }
    }

    public double getnotasPromedios() {
        return notasPromedios;
    }

    public void setnotasPromedios(double notasPromedios) {
        if (notasPromedios >= 0 && notasPromedios <= 5) {
            this.notasPromedios = notasPromedios;
        } else {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0 y 5");
        }
    }


}