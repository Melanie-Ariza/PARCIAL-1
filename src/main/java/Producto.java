import java.util.ArrayList;
import java.util.List;

public class Producto {
    //Atributos
    private int codigoProducto;
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    //Relacion Producto con Compra
    private Compra compra;

    //Relacion Producto con Categoria
    private Categoria categoria;

    //Crear Lista

    private List<Compra> listaCompra;

    //Constructor
    public Producto(int codigoProducto, String nombre, double precioUnitario, int cantidad, Categoria categoria, Compra compra) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.compra = compra;

        //Inicializar lista
        listaCompra = new ArrayList<>();

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public List<Compra> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(List<Compra> listaCompra) {
        this.listaCompra = listaCompra;
    }

    //toString


    @Override
    public String toString() {
        return codigoProducto +
                ", nombre: " + nombre +
                ", precioUnitario: " + precioUnitario +
                ", cantidad: " + cantidad +
                ", categoria: " + categoria +
                ", lista de Compra: " + listaCompra;


    }

    //Metodos
    //validacion stock
    public boolean hayStock(int cantidadSolicitada) {
        return this.cantidad >= cantidadSolicitada;
    }

    //Reducir stock tras compra
    public void reducirStock(int cantidadSolicitada) {
        if (hayStock(cantidadSolicitada)) {
            this.cantidad -= cantidadSolicitada;
        }


    }
}
