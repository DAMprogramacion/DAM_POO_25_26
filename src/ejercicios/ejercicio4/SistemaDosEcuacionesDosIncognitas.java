package ejercicios.ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SistemaDosEcuacionesDosIncognitas {
    private int a, b, e;
    private int c, d, f;

    public boolean esResoluble() {
        return a * d - b * c != 0;
    }
    public double getX () {
        return 1.0 * (e * d - b * f) / (a * d - b * c);
    }
    public double getY () {
        return 1.0 * (a * f - e * c) / (a * d - b * c);
    }

    @Override
    public String toString() {
        return String.format("SOLUCIÓN: X = %.2f e Y = %.2f", getX(), getY());
    }
}
