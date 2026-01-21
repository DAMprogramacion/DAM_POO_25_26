package ejercicios.ejercicio4;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaDosEcuacionesDosIncognitas s1 = new SistemaDosEcuacionesDosIncognitas();
        s1.setA(1);
        s1.setB(1);
        s1.setC(2);
        s1.setE(2);
        s1.setD(11);
        s1.setF(10);
        System.out.printf("Resoluble: %B%n", s1.esResoluble());
        System.out.println(s1);
        SistemaDosEcuacionesDosIncognitas s2 = new SistemaDosEcuacionesDosIncognitas(1, 1, 22, 2, 2, 5);
        System.out.printf("Resoluble: %B%n", s2.esResoluble());
        System.out.println(s2);
        SistemaDosEcuacionesDosIncognitas s3 = crearEcuacion();
        String mensaje = s3.esResoluble() ? "RESOLUBLE" : "NO RESOLUBLE";
        System.out.println(mensaje);
        if (s3.esResoluble())
            System.out.println(s3);
        List<SistemaDosEcuacionesDosIncognitas> sEcuaciones = List.of(s1, s2, s3);
        System.out.println("================================");
        mostrarInformacionEcuaciones(sEcuaciones);

    }

    private static void mostrarInformacionEcuaciones(List<SistemaDosEcuacionesDosIncognitas> sEcuaciones) {
        for (SistemaDosEcuacionesDosIncognitas s : sEcuaciones){
            String mensaje = s.esResoluble() ? "RESOLUBLE" : "NO RESOLUBLE";
            System.out.println(mensaje);
            if (s.esResoluble())
                System.out.println(s);
        }
    }

    private static SistemaDosEcuacionesDosIncognitas crearEcuacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el valor de a");
        int a = scanner.nextInt();
        System.out.println("introduce el valor de b");
        int b = scanner.nextInt();
        System.out.println("introduce el valor de c");
        int c = scanner.nextInt();
        System.out.println("introduce el valor de d");
        int d = scanner.nextInt();
        System.out.println("introduce el valor de e");
        int e = scanner.nextInt();
        System.out.println("introduce el valor de f");
        int f = scanner.nextInt();
        scanner.close();
        SistemaDosEcuacionesDosIncognitas s = new SistemaDosEcuacionesDosIncognitas(a,b,e,c,d,f);
        return s;
    }
}






