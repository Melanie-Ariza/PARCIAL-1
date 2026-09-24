import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    //Atributos
    private int codigoCompra;
    private Date fechaCompra;
    private double valorTotal;
    private MetodoPago metodoPago;
    private Cliente cliente;

    //Crear lista
    private List<DetalleCompra> detalles;

    //Constructor

    public Compra(int codigoCompra, Date fechaCompra, double valorTotal, MetodoPago metodoPago) {
        this.codigoCompra = codigoCompra;
        this.fechaCompra = fechaCompra;
        this.valorTotal = 0.0;
        this.metodoPago = metodoPago;
        this.cliente = cliente;

        //inicializo la lista
        this.detalles = new ArrayList<>();

    }

    //Getters y setters


    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public Date getFechaCompra() {

        return this.fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    //toString


    @Override
    public String toString() {
        return codigoCompra +
                ", fechaCompra: " + fechaCompra +
                ", valorTotal: " + valorTotal +
                ", cliente: " + cliente +
                ", metodoPago: " + metodoPago +
                ", detalles: " + detalles;
    }

    //Metodos
    public boolean agregarProducto(Producto producto, int cantidad) {
        if (producto.hayStock(cantidad)) {
            detalles.add(new DetalleCompra(producto, cantidad));
            producto.reducirStock(cantidad);
            calcularTotal();
            return true;
        }
        return false;
    }

    private void calcularTotal() {
        this.valorTotal = 0.0;
        for (DetalleCompra detalle : detalles) {
            this.valorTotal += detalle.calcularSubtotal();
        }
    }
}
