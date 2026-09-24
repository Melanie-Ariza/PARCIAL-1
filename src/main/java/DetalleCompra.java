public class DetalleCompra {
    private Producto producto;
    private int cantidad;
    //Constructor
    public DetalleCompra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //GET - SET
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Metodos
    public double calcularSubtotal() {
        return producto.getPrecioUnitario() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " Cantidad: " + cantidad + " = $" + calcularSubtotal();

    }
}
