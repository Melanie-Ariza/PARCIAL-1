public class Compra {
    //Atributos
    private int codigoCompra;
    private int fechaCompra;
    private double valorTotal;
    private MetodoPago metodoPago;

    //Constructor

    public Compra(int codigoCompra, int fechaCompra, double valorTotal, MetodoPago metodoPago) {
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

    public int getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(int fechaCompra) {
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
