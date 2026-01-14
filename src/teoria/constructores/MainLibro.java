package teoria.constructores;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("el quijote", "cervantes", "isbn1234", 1_200);
        System.out.println(libro1);
        libro1.setNumeroPaginas(2_100);
        System.out.println(libro1);
        Libro libro2 = new Libro();
        System.out.println(libro2);
        libro2.setTitulo("La celestina");
        libro2.setAutor("fernando rojas");
        libro2.setIsbn("isbn1235");
        libro2.setNumeroPaginas(500);
        System.out.println(libro2);
        libro2.setIsbn("isbn2222");
        System.out.println(libro2);
        Libro libro3 = new Libro("isbn3344");
        System.out.println(libro3);
        libro3.setTitulo("El lazarillo");
        libro3.setAutor("anónimo");
        libro3.setNumeroPaginas(150);
        System.out.println(libro3);
    }
}
