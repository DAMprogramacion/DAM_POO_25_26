package teoria.lombok;

import lombok.Data;

@Data
public class Ordenador {
    private int ram;
    private float procesador;
    private boolean tarjetaRedIntegrada;

    @Override
    public String toString() {
        String mensaje = isTarjetaRedIntegrada() ? "SI" : "NO";
        return String.format("Ordenador:\n===============\nRAM: %d%nProcesador: %.1f%nTarjeta integrada: %s",
                ram, procesador, mensaje);
    }
}
