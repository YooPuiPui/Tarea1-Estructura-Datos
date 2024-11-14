import java.util.List;

public class ModificarProducto {
   public static boolean modificarProducto(List<Mueble> muebles, String nombre, double nuevoPrecio, String newtipo, String newMaterial, String newdimensiones, String newcolor, String newestilo, double newcapacidadPeso) {
        for (Mueble mueble : muebles) {
            if (mueble != null && mueble.getNombre().equalsIgnoreCase(nombre)) {
                mueble.setPrecio(nuevoPrecio);
                mueble.setTipo(newtipo);
                mueble.setMaterial(newMaterial);
                mueble.setDimensiones(newdimensiones);
                mueble.setColor(newcolor);
                mueble.setEstilo(newestilo);
                mueble.setCapacidadPeso(newcapacidadPeso);
                return true; // Producto modificado con éxito
            }
        }
        return false; // Producto no encontrado
    }
}

