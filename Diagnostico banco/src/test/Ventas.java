package src.test;
import java.util.Scanner;

import src.ventas.Orden;

public class Ventas {

    public static void main(String[] args) {
        int opcion;
        Orden orden = new Orden();
        Scanner scanner = new Scanner(System.in); //Para poder guardar ordenes
        do{  //Menu para agregar ordenes
            System.out.println("\nMenu:");
            System.out.println("1. Agregar Orden:");
            System.out.println("2. Mostrar ordenes:");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
                    switch (opcion) { //Casos para poder agregar mas productos
                        case 1:
                        while (true) {
                            int idProducto;
                    String nombreProducto;
                    double precio;

                    System.out.println("A continuacion veras la lista de productos:");
                    System.out.println("1. Jabon: $3");
                    System.out.println("2. Shampoo $5");
                    System.out.println("3. Cepillo de dientes: $1");
                    System.out.print("Ingrese el número del producto que desea agregar: ");
                    idProducto = scanner.nextInt();

                    if (idProducto >= 1 && idProducto <= 3) {
                        if (idProducto == 1) {
                            idProducto = 1;
                            nombreProducto = "Jabon";
                            precio = 3;
                            orden.AgregarProducto(idProducto, nombreProducto, precio);
                        }
                        if (idProducto == 2) {
                            idProducto = 2;
                            nombreProducto = "Shampoo";
                            precio = 5;
                            orden.AgregarProducto(idProducto, nombreProducto, precio);
                        }
                        if (idProducto == 3) {
                            idProducto = 3;
                            nombreProducto = "Cepillo de dientes";
                            precio = 1;
                            orden.AgregarProducto(idProducto, nombreProducto, precio);
                        }
                    } else {
                        System.out.println("El producto que has ingresado no está en la lista.");
                    }

                    System.out.print("¿Desea agregar otro producto? (s/n): ");
                    String respuesta = scanner.next();
                    if (!respuesta.equalsIgnoreCase("s")) {
                        break;
                    }
                }  //Termina el case 1
                case 2:
                System.out.println("Entrando al caso 2");
                //orden.MostrarOrden(idProducto, nombreProducto, precio); Terminar despues
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida");;
            }
        } while (opcion != 7);

        scanner.close();
    }
    
}
