package teoria.lombok;

public class MainPrueba {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        prueba.setUno(12);
        prueba.setDos("cadena");
        System.out.println(prueba);
    }
}
