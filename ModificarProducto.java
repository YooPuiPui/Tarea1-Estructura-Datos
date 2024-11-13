import java.util.List;

public class ModificarProducto {
   public static boolean modificarProducto(List<Mueble> muebles, String nombre, double nuevoPrecio, String newtipo, String newMaterial, String newdimensiones, String newcolor, String newestilo, double newcapacidadPeso) {
        for (Mueble Mueble : muebles) {
            if (Mueble.getNombre().equalsIgnoreCase(nombre)) {
                Mueble.setPrecio(nuevoPrecio);
                Mueble.setTipo(newtipo);
                Mueble.setMaterial(newMaterial);
                Mueble.setDimensiones(newdimensiones);
                Mueble.setColor(newcolor);
                Mueble.setEstilo(newestilo);
                Mueble.setCapacidadPeso(newcapacidadPeso);
                return true; // Producto modificado con éxito
            }
        }
        return false; // Producto no encontrado
    }
}

