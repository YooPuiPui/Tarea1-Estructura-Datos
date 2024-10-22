import java.util.ArrayList;
import java.util.List;

public class Inventario {
    // Declaramos una lista de objetos
    private List<Mueble> muebles;    

    public Inventario(){
        muebles = new ArrayList<>();
    }

    //? Función para agregar un mueble
    public void agregarProducto(Mueble mueble) {
        // Agrega el mueble al inventario
        muebles.add(mueble);

        //? Imprime por consola mensaje de éxito con el nombre insertado del mueble 
        System.out.println("Mueble agregado: " + mueble.getNombre());
    }

    public void mostrarInventario(){
        if (muebles.isEmpty()){
            System.out.println("El inventario está vacío.");
        } else {
            for(Mueble mueble : muebles){
                System.out.println(mueble);  // Esto invoca el método toString() de Mueble
            }
        }
    }
     public void EliminarProducto(){

     }
}
