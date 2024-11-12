
public class Inventario {

    //? Declaramos un array  con un tamaño fijo
    private Mueble[] muebles;

    //?  Para llevar el control del índice del array
    private int indiceActual; 

    // Constructor que inicializa el array con un tamaño fijo de 100 muebles, por ejemplo
    public Inventario() {
        muebles = new Mueble[100];
        indiceActual = 1;
    }

    // Función para agregar un mueble
    public void agregarProducto(Mueble mueble) {
        if (indiceActual < muebles.length) {
            //* Añadimos el mueble en el índice actual
            muebles[indiceActual] = mueble;
            //* Avanzamos a la siguiente posicion 
            indiceActual++;  
            System.out.println("Mueble agregado: " + mueble.getNombre());
        } else {
            System.out.println("El inventario está lleno. No se pueden agregar más muebles.");
        }
    }

    //* muestra el inventario y solo lo recorre hasta el ultimo espacio ocupado
    public void mostrarInventario() {
        if (indiceActual == 0) {
            System.out.println("\n El inventario está vacío.");
        } else {
            for (int i = 0; i < indiceActual; i++) {
                System.out.println(muebles[i]);
            }
        }
    }

    //*  Listar productos por estilo
    public void listarEstilos(String estilo) {
        boolean encontrado = false;
        System.out.println("Muebles de estilo: " + estilo);

        for (int i = 1; i < indiceActual; i++) {
            if (muebles[i].getEstilo().equalsIgnoreCase(estilo)) {
                System.out.println(muebles[i]);
                encontrado = true;
            }
    }

        if (!encontrado) {
            System.out.println("No se encontraron muebles de este estilo: " + estilo);
        }
    }

    //* Eliminar un producto */

    public void eliminarProducto(String nombre, double precio) {
        boolean encontrado = false;
        
    
        for (int i = 1; i < indiceActual; i++) {  // Comenzamos en 1 para evitar la posición 0 (mueble "eliminado")
            if (muebles[i] != null && muebles[i].getNombre().equalsIgnoreCase(nombre) && muebles[i].getPrecio() == precio) {
                encontrado = true;
    
                // Mover el último elemento a la posición actual
                muebles[i] = muebles[indiceActual - 1];
                muebles[indiceActual - 1] = null;  // Limpiamos la última posición
    
                indiceActual--;  // Reducimos el índice actual del inventario
                System.out.println("Producto eliminado:\nNombre: " + nombre + "\nPrecio: " + precio);
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("No se encontró ningún mueble con el nombre '" + nombre + "' y precio " + precio);
        }
    }
    
}