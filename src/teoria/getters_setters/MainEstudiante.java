package teoria.getters_setters;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1);
        estudiante1.setNombreCompleto("Pedro Higueras Ruíz");
        estudiante1.setDni("12345678a");
        estudiante1.setCurso(Curso.DAM);
        Estudiante estudiante2 = new Estudiante();
      //  System.out.println(estudiante1);
        estudiante2.setNombreCompleto("Isabel Higueras Jiménez");
        estudiante2.setDni("12345678b");
        estudiante2.setCurso(Curso.SMR);
        System.out.println("Estudiante 1");
        System.out.println(estudiante1);
        System.out.println("Estudiante 1");
        System.out.println(estudiante2);
    }
}
