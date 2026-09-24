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
                "Nombre:" + nombre +
                ", Dirección: " + direccion +
                ", Telefono: " + telefono +
                ", Lista de Clientes: " + listaClientes +
                ", Lista de Compras: " + listaCompra +
                ", Lista de Productos: " + listaProductos;
    }

    //Metodo para verificar Clientes
    public boolean verificarCliente(int documento) {
        boolean existe = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                existe = true;

            }
        }
        return existe;

    }

    //Metodo agregar Clientes
    public boolean agregarCliente(Cliente cliente) {
        boolean agregado = false;
        boolean existe = verificarCliente(cliente.getDocumento());
        if (existe == false) {
            listaClientes.add(cliente);
            agregado = true;

        }
        return agregado;
    }

    //Metodo para Actualizar Cliente
    public boolean actulizarCliente(int documento, Cliente clienteActualizado) {
        boolean estaActualizado = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                cliente.setNombre(clienteActualizado.getNombre());
                cliente.setTelefono(clienteActualizado.getTelefono());
                cliente.setCorreo(clienteActualizado.getCorreo());
                estaActualizado = true;
                break;
            }
        }

        return estaActualizado;
    }

    //Metodo para eliminar cliente
    public boolean eliminarCliente(int documento) {
        boolean esEliminado = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                listaClientes.remove(cliente);
                esEliminado = true;
            }
        }
        return esEliminado;
    }

    //Metodo para mostrar clientes por documento
    public Cliente mostrarCliente(int documento) {
        Cliente cliente1=null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                cliente1 = cliente;
            }
        }
        return cliente1;
    }



    //Metodo para verificar producto

    public boolean verificarProductos (int codigoProductos) {
        boolean existe = false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto() == codigoProductos) {
                existe = true;

            }
        }
        return existe;

    }
    //Metodo agregar Productos
    public boolean agregarProducto(Producto producto) {
        boolean agregado = false;
        boolean existe = verificarProductos(producto.getCodigoProducto());
        if(existe==false){
            listaProductos.add(producto);
            agregado= true;

        }
        return agregado;
    }
    //Metodo para Actualizar

    public boolean actulizarProducto(int codigoProducto, Producto productoActualizado) {
        boolean estaActualizado = false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto() == codigoProducto) {
                producto.setNombre(productoActualizado.getNombre());
                producto.setPrecioUnitario(productoActualizado.getPrecioUnitario());
                producto.setCantidad(productoActualizado.getCantidad());
                estaActualizado = true;
                break;
            }
        }

        return estaActualizado;
    }

    //Metodo para eliminar producto
    public boolean eliminarProducto(int codigoProducto) {
        boolean esEliminado= false;
        for (Producto producto: listaProductos) {
            if (producto.getCodigoProducto()==codigoProducto) {
                listaProductos.remove(producto);
                esEliminado=true;
            }
        }
        return esEliminado;
    }

    //Metodo para mostrar producto
    public Producto mostrarProducto(int codigoProducto) {
        Producto producto1=null;
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto() == codigoProducto) {
                producto1 = producto;
            }
        }
        return producto1;
    }

    //Metodo para verificar compra

    public boolean verificarCompra (int codigoCompra) {
        boolean existe = false;
        for (Compra compra : listaCompra) {
            if (compra.getCodigoCompra() == codigoCompra) {
                existe = true;

            }
        }
        return existe;

    }
    //Metodo agregar Compra
    public boolean agregarCompra(Compra compra) {
        boolean agregado = false;
        boolean existe = verificarCliente(compra.getCodigoCompra());
        if(existe==false){
            listaCompra.add(compra);
            agregado= true;

        }
        return agregado;
    }
    //Metodo para Actualizar

    public boolean actulizarCompra(int codigoCompra, Compra compraActualizada) {
        boolean estaActualizado = false;
        for (Compra compra : listaCompra) {
            if (compra.getCodigoCompra() == codigoCompra) {
                compra.setFechaCompra(compraActualizada.getFechaCompra());
                compra.setValorTotal(compraActualizada.getValorTotal());
                compra.setMetodoPago(compraActualizada.getMetodoPago());
                estaActualizado = true;
                break;
            }
        }

        return estaActualizado;
    }

    //Metodo para eliminar compra
    public boolean eliminarCompra(int codigoCompra) {
        boolean esEliminado= false;
        for (Compra compra: listaCompra){
            if (compra.getCodigoCompra()==codigoCompra){
                listaCompra.remove(compra);
                esEliminado=true;
            }
        }
        return esEliminado;
    }

    //Metodo para mostrar compra
    public Compra mostrarCompra(int codigoCompra) {
        Compra compra1=null;
        for (Compra compra : listaCompra) {
            if (compra.getCodigoCompra() == codigoCompra) {
                compra1 = compra;
            }
        }
        return compra1;
    }

}