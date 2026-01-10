package teoria;

public class MainAutomovil {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        System.out.println(automovil);
        automovil.setMarca("set");
        automovil.setModelo("ateca");
        automovil.setNumeroAsientos(5);
        automovil.setElectrico(true);
        System.out.println(automovil.toString());
    }
}
