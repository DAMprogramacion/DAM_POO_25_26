package teoria.constructores;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.setNombreProducto("colonia");
        producto1.setPrecioProducto(17.30);
        producto1.setCategoriaProducto(Categoria.DROGUERIA);
        System.out.println(producto1);
        Producto producto2 = new Producto("macarrones", 1.5, Categoria.ALIMENTACION);
        System.out.println(producto2);
    }
}
