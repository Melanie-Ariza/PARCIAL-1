import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    //Atributos
    String nombre;
    String direccion;
    int telefono;

    //Creacion listas

    private List<Cliente> listaClientes;
    private List<Compra> listaCompra;
    private List<Producto> listaProductos;

    //Constructor
    public Supermercado(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        //Inicializar listas
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaCompra = new ArrayList<>();
    }
    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Compra> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(List<Compra> listaCompra) {
        this.listaCompra = listaCompra;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    //toString
    @Override
    public String toString() {
        return "Supermercado \n" +
                "Nombre:"+nombre+
                ", Dirección: "+direccion+
                ", Telefono: "+telefono+
                ", Lista de Clientes: "+listaClientes+
                ", Lista de Compras: "+listaCompra+
                ", Lista de Productos: "+listaProductos;
    }
    
}
