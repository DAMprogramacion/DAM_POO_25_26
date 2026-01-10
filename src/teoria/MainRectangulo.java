package teoria;

import java.util.ArrayList;
import java.util.List;

public class MainRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setAncho(5);
        rectangulo1.setAlto(7);
        System.out.printf("Rectángulo ancho: %d%n", rectangulo1.getAncho());
        System.out.printf("Rectángulo alto : %d%n", rectangulo1.getAlto());
        System.out.printf("Rectángulo área : %d%n", rectangulo1.getArea());

        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setAncho(15);
        rectangulo2.setAlto(17);
        System.out.printf("Rectángulo ancho: %d%n", rectangulo2.getAncho());
        System.out.printf("Rectángulo alto : %d%n", rectangulo2.getAlto());
        System.out.printf("Rectángulo área : %d%n", rectangulo2.getArea());

        List<Rectangulo> rectangulos = new ArrayList<>();
        rectangulos.add(rectangulo1);
        rectangulos.add(rectangulo2);
        System.out.println("=======================================");
        mostrarDatosRectangulos(rectangulos);
    }
    public static void mostrarDatosRectangulos (List<Rectangulo> rectangulos ){
        for (Rectangulo rectangulo : rectangulos) {
            System.out.printf("Rectángulo ancho: %d%n", rectangulo.getAncho());
            System.out.printf("Rectángulo alto : %d%n", rectangulo.getAlto());
            System.out.printf("Rectángulo área : %d%n", rectangulo.getArea());
        }
    }
}





