
public class Inventario {
    //? Declaramos un array  con un tamaño fijo
    private Mueble[] muebles;

    //?  Para llevar el control del índice del array
    private int indiceActual; 
    private int cantidadMuebles

    // Constructor que inicializa el array con un tamaño fijo de 100 muebles, por ejemplo
    public Inventario() {
        muebles = new Mueble[100];
        indiceActual = 0;  // El primer índice a ocupar será 0
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
            System.out.println("El inventario está vacío.");
        } else {
            for (int i = 0; i < indiceActual; i++) {
                System.out.println(muebles[i]);  // Esto invoca el método toString() de Mueble
            }
        }
    }

    //*  Listar productos por estilo
    public void listarEstilos(String estilo) {
        boolean encontrado = false;
        System.out.println("Muebles de estilo: " + estilo);

        for (int i = 0; i < indiceActual; i++) {
            if (muebles[i].getEstilo().equalsIgnoreCase(estilo)) {
                System.out.println(muebles[i]);
                encontrado = true;
            }
    }

        if (!encontrado) {
            System.out.println("No se encontraron muebles de este estilo: " + estilo);
        }
    }


}
