package ejercicios.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cilindro {
    private int radio;
    private int altura;

  /*  public Cilindro() {
    }

    public Cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }*/

    /*public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }*/
    public double calcularArea () {
        return 2 * Math.PI * radio * (radio + altura);
    }
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return String.format("CILINDRO\nradio: %d\naltura: %d\nsuperficie: %.2f\nvolumen: %.2f",
                radio, altura, calcularArea(), calcularVolumen());
    }
}






