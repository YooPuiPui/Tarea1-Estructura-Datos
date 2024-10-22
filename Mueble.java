public class Mueble {
    //! Estos son los atributos 
    private String nombre;
    private double precio;
    private String tipo;
    private String material;
    private String dimensiones;
    private String color;
    private String estilo;
    private double capacidadPeso;
  
    //* constructor
    public Mueble(String nombre, double precio, String tipo, String material, String dimensiones, String color, String estilo, double capacidadPeso) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.material = material;
        this.dimensiones = dimensiones;
        this.color = color;
        this.estilo = estilo;
        this.capacidadPeso = capacidadPeso;
    }
  
    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
  
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
  
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }  // Corregido
  
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
  
    public String getDimensiones() { return dimensiones; }
    public void setDimensiones(String dimensiones) { this.dimensiones = dimensiones; }
  
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
  
    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
  
    public double getCapacidadPeso() { return capacidadPeso; }
    public void setCapacidadPeso(double capacidadPeso) { this.capacidadPeso = capacidadPeso; }
  
    // Método 
    @Override
    public String toString() {
        return "Mueble [ " + "\n" +
                "nombre:  " + nombre + "\n" +
                "- precio: " + precio + "\n" +
                "- tipo:  " + tipo + "\n" +
                "- material: " + material + "\n" +
                "- dimensiones: '" + dimensiones + "\n" +
                "- color: " + color + "\n" +
                "- estilo: " + estilo + "\n" +
                "- capacidadPeso: " + capacidadPeso +
                " ]";
    }
}
