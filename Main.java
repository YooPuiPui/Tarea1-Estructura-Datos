import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; 

        while (continuar) {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Listar productos por estilo");
            System.out.println("4. Eliminar un producto");
            System.out.println("5. Salir");
            System.out.print("\nSeleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  
            switch (opcion) {
                case 1:
                    //! Agregar un mueble
                    System.out.println("Ingrese los detalles del mueble:");

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();  // Consumir el salto de línea

                    System.out.print("Tipo de mueble (Sofá, Silla, Mesa, etc.): ");
                    String tipo = scanner.nextLine();

                    System.out.print("Material: ");
                    String material = scanner.nextLine();

                    System.out.print("Dimensiones (por ejemplo: 200x90x100): ");
                    String dimensiones = scanner.nextLine();

                    System.out.print("Color: ");
                    String color = scanner.nextLine();

                    System.out.print("Estilo (Moderno, Rústico, Clásico): ");
                    String estilo = scanner.nextLine();

                    System.out.print("Capacidad de peso (en kg): ");
                    double capacidadPeso = scanner.nextDouble();
                    scanner.nextLine();  // Consumir el salto de línea

                    //! Crear el objeto Mueble con los datos ingresados
                    Mueble mueble = new Mueble(nombre, precio, tipo, material, dimensiones, color, estilo, capacidadPeso);
                    
                    //? Agregar el mueble al inventario
                    inventario.agregarProducto(mueble);
                    break;

                case 2:
                    //! Mostrar inventario
                    inventario.mostrarInventario();
                    break;

                case 3:
                    //! Listar muebles por estilo
                    System.out.print("\n Ingrese el estilo de mueble a buscar (Moderno, Rústico, Clásico): ");
                    String estiloBuscado = scanner.nextLine();
                    inventario.listarEstilos(estiloBuscado);
                    break;

                case 4:
                    //! Eliminar  mueble
                    System.out.println("\nIngrese las posicion del mueble a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    scanner.nextLine();

                    inventario.eliminarProducto(indiceEliminar);
                break;


                case 5:
                    //! Salir del programa
                    continuar = false;
                    System.out.println("\n Saliendo del programa...");
                    break;

                default:
                    System.out.println("\n Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
                    break;
            }System.out.println("Presione Enter para continuar...");
            Scanner scanner3 = new Scanner(System.in);
            scanner3.nextLine();
            
        }

        scanner.close();
    }
}
