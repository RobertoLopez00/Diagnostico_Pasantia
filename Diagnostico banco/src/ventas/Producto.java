package src.ventas;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private static int contadorProductos = 0;  //El contador cuenta como atributo?? Supongo que no, ya que no es informacion que se enseña
//  Producto()



    // Constructor
        public Producto(int idProducto, String nombreProducto, double precio) {
            this.idProducto = idProducto;
            this.nombreProducto = nombreProducto;
            this.precio = precio;
        }
    
        // Getter para idProducto
        public int getIdProducto() {
            return idProducto;
        }
    
        // Setter para idProducto
        public void setIdProducto(int idProducto) {
            this.idProducto = idProducto;
        }
    
        // Getter para nombreProducto
        public String getNombreProducto() {
            return nombreProducto;
        }
    
        // Setter para nombreProducto
        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }
    
        // Getter para precio
        public double getPrecio() {
            return precio;
        }
    
        // Setter para precio
        public void setPrecio(double precio) {
            this.precio = precio;
        }


        //ToString()
}
