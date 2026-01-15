package teoria.records;

public record Persona(String nombre, String direccion, int edad) {
    public Persona (int edad) {
        this("administrador", "dirección administrador", edad);
    }
}
