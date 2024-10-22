import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        //! Solicitar al usuario los detalles del mueble
        System.out.println("Ingrese los detalles del mueble:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

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
        scanner.nextLine();

        //? Crear el objeto Mueble con los datos ingresados
        Mueble mueble = new Mueble(nombre, precio, tipo, material, dimensiones, color, estilo, capacidadPeso);

        //? Agregar el mueble al inventario
        inventario.agregarProducto(mueble);

        // Mostrar el inventario
        //inventario.mostrarInventario();

        //! Listar muebles por estilo
        System.out.println("\nIngrese el estilo de mueble a buscar (Moderno, Rústico, Clásico): ");
        String estiloBuscado = scanner.nextLine();  // Capturar correctamente el estilo a buscar

        // Listar muebles del estilo buscado
        inventario.listarEstilos(estiloBuscado);

        // Cerrar el scanner
        scanner.close();
    }
}
