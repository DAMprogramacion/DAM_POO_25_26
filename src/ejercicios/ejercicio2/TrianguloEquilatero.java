package ejercicios.ejercicio2;

public class TrianguloEquilatero {
    private final int lado;

    public TrianguloEquilatero(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public int getPerimetro() {
        return lado * 3;
    }
    public double getArea() {
        return (lado * lado * Math.sqrt(3)) / 4;
    }
}
