import java.util.ArrayList;
import java.util.List;

public class Inventario {

    //? Declaramos un array  con un tamaño fijo
    private Mueble[] muebles;

    //?  Para llevar el control del índice del array
    private int indiceActual; 

    //* Constructor que inicializa el array con un tamaño fijo de 100 muebles
    public Inventario() {
        muebles = new Mueble[100];
        indiceActual = 0;
    }

    //*  Función para agregar un mueble
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

        for (int i = 0; i < indiceActual; i++) {
            if (muebles[i] != null && muebles[i].getEstilo().equalsIgnoreCase(estilo)) {
                System.out.println(muebles[i]);
                encontrado = true;
            }
    }

        if (!encontrado) {
            System.out.println("No se encontraron muebles de este estilo: " + estilo);
        }
    }

    public void eliminarProducto(int indice){
        if (indice >= 0 && indice < indiceActual && muebles[indice] != null) {
            System.out.println("Mueble eliminado: " + muebles[indice].getNombre());
            muebles[indice] = null;
    

            muebles[indiceActual - 1] = null;
            indiceActual--;
        } else {
            System.out.println("Índice inválido o el mueble ya fue eliminado.");
        }
    }

    public List<Mueble> getMuebles() {
        List<Mueble> listaMuebles = new ArrayList<>();
        for (int i = 0; i < indiceActual; i++) {
            if (muebles[i] != null) {
                listaMuebles.add(muebles[i]);
            }
        }
        return listaMuebles;
    }

    //Consultar Dimensiones
    public void consultardimensiones(String Dimension){
        boolean encontrado= false;
        System.out.print("Dimensiones del mueble: "+Dimension);

        for(int i=0; i< indiceActual; i++){
            if(muebles[i].getDimensiones().equalsIgnoreCase(Dimension)){
                System.out.println(muebles[i]);
                encontrado= true;
            }

        }

        if(!encontrado){
            System.out.println("\nNo se encontraron muebles con estas dimensiones: "+ Dimension);
        }
    }

    public void verificarMateral(String material){
        boolean encontrado = false;

        System.out.println("Muebles encontrados hechos de " + material);

        for(int i=0; i < indiceActual; i++){
            if(muebles[i] !=null && muebles[i].getMaterial().equalsIgnoreCase(material)){
                System.out.println(muebles[i]);
                encontrado = true;
            }
        }
        
        if(!encontrado){
            System.out.println("No se encontraron muebles hechos de " +material);
        }
    }
}