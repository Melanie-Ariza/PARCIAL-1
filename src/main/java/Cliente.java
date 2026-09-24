import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int documento;
    private int telefono;
    private String correo;

    //Crear lista
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

        //Inicializar lista

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

    public List<Compra> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(List<Compra> listaCompra) {
        this.listaCompra = listaCompra;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    //TOSTRING


    @Override
    public String toString() {
        return nombre +
                ", documento: " + documento +
                ", telefono: " + telefono +
                ", correo: " + correo +
                ", compra: " + compra +
                ", listaCompra: " + listaCompra;
    }

    //Metodos
    public void agregarCompra(Compra compra) {
        this.listaCompra.add(compra);
    }

}

