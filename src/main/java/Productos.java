public class Productos {
    //Atributos
    private int codigoProducto;
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    //Relacion Producto con Categoria
    private Categoria categoria;

    //Constructor
    public Productos(int codigoProducto, String nombre, double precioUnitario, int cantidad, Categoria categoria) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    //Getter y setter
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCategoria() { return categoria;
    }

    public void setCategoria(Categoria categoria) { this.categoria = categoria;
    }

    //toString


    @Override
    public String toString() {
        return codigoProducto +
                ", nombre: " + nombre +
                ", precioUnitario: " + precioUnitario +
                ", cantidad: " + cantidad +
                ", categoria: " + categoria;
    }
}

