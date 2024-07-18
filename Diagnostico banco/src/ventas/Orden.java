package src.ventas;

public class Orden {
    private int idOrden;
    private Producto [] producto;
    private Cliente cliente;
    private static int contadorOrdenes = 0;
    private static int contadorProductos = 0;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.producto = new Producto[MAX_PRODUCTOS]; //Inicializamos para poder recibir los datos desde ventas
    };

    void AgregarCliente(String nombre, String apellido){
        
    };

    public void AgregarProducto(int idProducto, String nombreProducto, double precio){ // Procedimiento para poder agregar un producto
        if(contadorProductos < MAX_PRODUCTOS){
            producto[contadorProductos++] = new Producto(idProducto, nombreProducto, precio);
            System.out.println("Producto agregado correctamente");
        } else { 
            System.out.println("Haz llegado al limite de productos");
            
        }
    };

    double calcularTotal(){

        return 0;
    };

    void MostrarOrden(int idProducto, String nombreProducto, double precio){
        System.out.println("Prueba de que enseña las ordenes");
    };
}
