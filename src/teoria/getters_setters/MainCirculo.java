package teoria.getters_setters;

public class MainCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
       // int radioCirculo1 = circulo1.getRadio();
        System.out.printf("Radio círculo 1: %d%n", circulo1.getRadio());
        Circulo circulo2 = new Circulo();
     //   int radioCirculo2 = circulo2.getRadio();
        System.out.printf("Radio círculo 2: %d%n", circulo2.getRadio());
        circulo2.setRadio(8);
     //   radioCirculo2 = circulo2.getRadio();
        System.out.printf("Radio círculo 2: %d%n", circulo2.getRadio());
        System.out.printf("Área  círculo 2: %.2f%n", circulo2.calcularArea());
        System.out.printf("Longitud  círculo 2: %.2f%n", circulo2.calcularLongitud());
    }
}
