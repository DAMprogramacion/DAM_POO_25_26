package ejercicios.ejercicio2;

public class MainTrianguloEquilatero {
    public static void main(String[] args) {
        TrianguloEquilatero tEquilatero = new TrianguloEquilatero(5);
        System.out.printf("Triángulo equilatero de lado %d%n", tEquilatero.getLado());
        System.out.printf("Triángulo equilatero de longitud %d%n", tEquilatero.getPerimetro());
        System.out.printf("Triángulo equilatero de superficie %.2f%n", tEquilatero.getArea());
    }
}
