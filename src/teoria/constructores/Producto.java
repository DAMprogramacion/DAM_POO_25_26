package teoria.constructores;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private String nombreProducto;
    private double precioProducto;
    private Categoria categoriaProducto;

    /*public Producto(String nombreProducto, double precioProducto, Categoria categoriaProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
    }*/

    @Override
    public String toString() {
        return String.format("%s;%.2f;%s", nombreProducto, precioProducto, categoriaProducto);
    }
}
