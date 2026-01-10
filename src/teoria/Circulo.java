package teoria;

public class Circulo {
    private int radio = 7;

    public int getRadio() {
        return radio;
    }
   /* public void setRadio(int r){
        radio = r;
    }*/

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    public double calcularLongitud() {
        return 2 * Math.PI * radio;
    }
}
