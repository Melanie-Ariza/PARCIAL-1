public class Productos {
    //Atributos
    int codigoProducto;
    String nombre;
    double precioUnitario;
    int cantidad;

    //Constructor
    public Productos(int codigoProducto, String nombre, double precioUnitario, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
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
    //toString
    @Override
    public String toString() {
        return "Productos \n" +
                "Codigo Producto:"+codigoProducto+
                ", Nombre: "+nombre+
                ", Precio Unitario: "+precioUnitario+
                ", Cantidad: "+cantidad;
    }
}
