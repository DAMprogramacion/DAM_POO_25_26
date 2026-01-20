package ejercicios.ejercicio3;

public class EcuacionSegundoGrado {
    private final int a;
    private final int b;
    private final int c;

    public EcuacionSegundoGrado(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularX1(){
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    public double calcularX2(){
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
