import java.time.LocalDate;

public class Compra {
    //Atributos
    private int codigoCompra;
    private LocalDate fechaCompra;
    private double valorTotal;
    private MetodoPago metodoPago;

    //Constructor

    public Compra(int codigoCompra, LocalDate fechaCompra, double valorTotal, MetodoPago metodoPago) {
        this.codigoCompra = codigoCompra;
        this.fechaCompra = fechaCompra;
        this.valorTotal = valorTotal;
        this.metodoPago = metodoPago;
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

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
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
        return "Compra: " + "\n"+
                "Codigo de Compra: " + codigoCompra+
                ", Fecha de Compra: " + fechaCompra +
                ", Valor Total De La Venta: " + valorTotal+
                ", Método de Pago: " + metodoPago;
    }
}
