import java.util.ArrayList;
import java.util.List;

public class Producto {
    //Atributos
    private int codigoProducto;
    private String nombre;
    private double precioUnitario;
    private int cantidad;


    //Constructor
    public Producto(int codigoProducto, String nombre, double precioUnitario, int cantidad, Categoria categoria) {
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
        return codigoProducto +
                ", nombre: " + nombre +
                ", precioUnitario: " + precioUnitario +
                ", cantidad: " + cantidad;


    }

    //Metodos
    //validacion stock
    public boolean hayStock(int cantidadSolicitada) {
        boolean siHay= false;
        if (this.cantidad >= cantidadSolicitada) {
            siHay = true;
        } else {
            siHay = false;
        }

        return siHay;
    }

    //Reducir stock tras compra
    public void reducirStock(int cantidadSolicitada) {
        if (hayStock(cantidadSolicitada)) {
            this.cantidad -= cantidadSolicitada;
        }


    }
}
