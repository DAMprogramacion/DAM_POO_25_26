package teoria.getters_setters;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona.darInformacion());
        persona.setApellidos("abolafia pérez");
        persona.setNombre("juan");
        persona.setEdad(21);
        System.out.println(persona.darInformacion());
        String mensaje = persona.esMayorEdad() ? "mayor edad" : "menor edad";
        System.out.printf("Información: %s%n", mensaje);
        System.out.println(persona);

    }
}
