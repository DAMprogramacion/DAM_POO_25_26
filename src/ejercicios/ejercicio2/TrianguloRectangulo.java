package ejercicios.ejercicio2;

public record TrianguloRectangulo(int base, int altura) {
    public double getHipotenusa() {
        //return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return Math.hypot(base, altura);
    }
    public double getPerimetro() {
        return base + altura + getHipotenusa();
    }
    public double getArea() {
        return base * altura / 2.0;
    }
}
