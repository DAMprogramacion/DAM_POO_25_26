package ejercicios.ejercicio2;

public class MainTrianguloRectangulo {
    public static void main(String[] args) {
        TrianguloRectangulo tRectangulo = new TrianguloRectangulo(2, 3);
        System.out.println(tRectangulo);
        System.out.printf("Triángulo rectángulo de altura %d%n", tRectangulo.altura());
        System.out.printf("Triángulo rectángulo de base %d%n", tRectangulo.base());
        System.out.printf("Triángulo rectángulo de hipotenusa %.2f%n", tRectangulo.getHipotenusa());
        System.out.printf("Triángulo rectángulo de perímetro %.2f%n", tRectangulo.getPerimetro());
        System.out.printf("Triángulo rectángulo de área %.2f%n", tRectangulo.getArea());
    }
}
