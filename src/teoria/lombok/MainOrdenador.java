package teoria.lombok;

import java.util.ArrayList;
import java.util.List;

public class MainOrdenador {
    public static void main(String[] args) {
        //crear una lista de objetos ordenador
        List<Ordenador> ordenadores = new ArrayList<>();
        Ordenador ordenador1 = new Ordenador();
        ordenador1.setRam(16);
        ordenador1.setProcesador(5.4f);
        ordenador1.setTarjetaRedIntegrada(true);
        System.out.println(ordenador1);
        Ordenador ordenador2 = new Ordenador();
        ordenador2.setRam(32);
        ordenador2.setProcesador(6.4f);
        ordenador2.setTarjetaRedIntegrada(false);
        System.out.println(ordenador2);
        //añadimos los ordenadores a la lista
        ordenadores.add(ordenador1);
        ordenadores.add(ordenador2);
        //llamar al metodo para mostrar los datos
        System.out.println("\n\n--------------------------------------");
        mostrarDatosOrdenadores(ordenadores);
    }
    public static void mostrarDatosOrdenadores(List<Ordenador> ordenadores){
        for (Ordenador ordenador : ordenadores)
            System.out.println(ordenador);
    }
}
