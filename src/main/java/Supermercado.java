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
    //Metodo para verificar Clientes
    public boolean verificarCliente (int documento) {
        boolean existe = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                existe = true;

            }
        }
        return existe;

    }
    //Metodo agregar Clientes
    public boolean agregarEstudiantes(Cliente cliente){
        boolean agregado = false;
        boolean existe = verificarCliente(cliente.getDocumento());
        if(existe==false){
            listaClientes.add(cliente);
            agregado= true;

        }
        return agregado;
    }
    //Metodo para Actualizar
    public boolean actulizarCliente(int documento, Cliente clienteActualizado) {
        boolean estaActualizado = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                cliente.setNombre(clienteActualizado.getNombre());
                cliente.setDocumento(clienteActualizado.getDocumento());
                cliente.setTelefono(clienteActualizado.getTelefono());
                cliente.setCorreo(clienteActualizado.getCorreo());
                estaActualizado = true;
                break;
            }
        }

        return estaActualizado;
    }

    //Metodo para eliminar cliente
    public boolean eliminarcliente(int documento) {
        boolean esEliminado= false;
        for (Cliente cliente: listaClientes){
            if (cliente.getDocumento()==documento){
                listaClientes.remove(cliente);
                esEliminado=true;
            }
        }
        return esEliminado;
    }

    //Metodo para mostrar clientes
    public void mostrarCliente(int eleccion, int documento){
        if (eleccion==1){
            List<Cliente>lista= getListaClientes();
            System.out.println(lista);
        } else if (eleccion==2) {
            for (Cliente profesor: listaClientes){
                if (profesor.getDocumento()==documento){
                    System.out.println(profesor);
                }
            }
        }else {
            System.out.println("Opción no valida");
        }
    }
}
