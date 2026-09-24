import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int documento;
    private int telefono;
    private String correo;

    //Crear listas
    private List<Supermercado> listaSupermercado;
    private List<Producto> listaProductos;
    private List<Compra> listaCompra;

    //Relacion Cliente con Compra
    private Compra compra;


    //CONSTRUCTOR
    public Cliente(String nombre, int documento, int telefono, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.compra = compra;

        //Inicializar listas
        listaSupermercado = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaCompra = new ArrayList<>();
    }


    //GET-SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Compra getCompra() { return compra; }

    public void setCompra(Compra compra) { this.compra = compra; }

    public List<Supermercado> getListaSupermercado() { return listaSupermercado; }

    public void setListaSupermercado(List<Supermercado> listaSupermercado) { this.listaSupermercado = listaSupermercado; }

    public List<Producto> getListaProductos() { return listaProductos; }

    public void setListaProductos(List<Producto> listaProductos) { this.listaProductos = listaProductos;}

    public List<Compra> getListaCompra() { return listaCompra;}

    public void setListaCompra(List<Compra> listaCompra) { this.listaCompra = listaCompra; }

    //TOSTRING


    @Override
    public String toString() {
        return nombre +
                ", documento: " + documento +
                ", telefono: " + telefono +
                ", correo: " + correo +
                ", compra: " + compra +
                ", listaSupermercado: " + listaSupermercado +
                ", listaProductos: " + listaProductos +
                ", listaCompra: " + listaCompra;
    }
}

