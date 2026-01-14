package teoria.getters_setters;

public class Estudiante {
    private String nombreCompleto;
    private String dni;
    private Curso curso;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%nDNI: %S%nCurso: %s", nombreCompleto, dni, curso);
    }
}
