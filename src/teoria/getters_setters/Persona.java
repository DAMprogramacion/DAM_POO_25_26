package teoria.getters_setters;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean esMayorEdad() {
        return  edad >= 18;
    }
    public String darInformacion() {
        return String.format("%s, %s: %d", apellidos, nombre, edad);
    }




}
