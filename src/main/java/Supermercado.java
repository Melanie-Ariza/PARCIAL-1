import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Supermercado {
    //Atributos
    String nombre;
    String direccion;
    int telefono;

    //Creacion listas

    private List<Cliente> listaClientes;
    private List<Compra> listaCompras;
    private List<Producto> listaProductos;

    //Constructor
    public Supermercado(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        //Inicializar listas
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaCompras = new ArrayList<>();
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

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
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
                ", Lista de Compras: " + listaCompras +
                ", Lista de Productos: " + listaProductos;
    }

    // ===================== CLIENTE ========================
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
                break;
            }
        }
        return esEliminado;
    }

    //Metodo para mostrar clientes por documento
    public Cliente mostrarCliente(int documento) {
        Cliente cliente1 = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getDocumento() == documento) {
                cliente1 = cliente;
            }
        }
        return cliente1;
    }

// ================ PRODUCTO ======================

    //Metodo para verificar producto

    public boolean verificarProductos(int codigoProductos) {
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
        if (existe == false) {
            listaProductos.add(producto);
            agregado = true;

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
        boolean esEliminado = false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto() == codigoProducto) {
                listaProductos.remove(producto);
                esEliminado = true;
                break;
            }
        }
        return esEliminado;
    }

    //Metodo para mostrar producto
    public Producto mostrarProducto(int codigoProducto) {
        Producto producto1 = null;
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto() == codigoProducto) {
                producto1 = producto;
            }
        }
        return producto1;
    }

// ========================== COMPRA ======================

    //Metodo para verificar compra

    public boolean verificarCompra(int codigoCompra) {
        boolean existe = false;
        for (Compra compra : listaCompras) {
            if (compra.getCodigoCompra() == codigoCompra) {
                existe = true;

            }
        }
        return existe;

    }

    //Metodo agregar Compra
    public boolean agregarCompra(Compra compra) {
        boolean agregado = false;
        boolean existe = verificarCompra(compra.getCodigoCompra());
        if (existe) {
            listaCompras.add(compra);
            agregado = true;
        }
        return agregado;
    }

    //Metodo para Actualizar

    public boolean actulizarCompra(int codigoCompra, Compra compraActualizada) {
        boolean estaActualizado = false;
        for (Compra compra : listaCompras) {
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
        boolean esEliminado = false;
        for (Compra compra : listaCompras) {
            if (compra.getCodigoCompra() == codigoCompra) {
                listaCompras.remove(compra);
                esEliminado = true;
                break;
            }
        }
        return esEliminado;
    }

    //Metodo para mostrar compra
    public Compra mostrarCompra(int codigoCompra) {
        Compra compra1 = null;
        for (Compra compra : listaCompras) {
            if (compra.getCodigoCompra() == codigoCompra) {
                compra1 = compra;
            }
        }
        return compra1;
    }

    //Metodo ventas por fecha
    public double ventasPorFecha(Date fechaCompra) {
        double acumulado = 0;
        for (Compra compra : listaCompras) {
            if (compra.getFechaCompra() == fechaCompra) {
                acumulado += compra.getValorTotal();
            }
        }
        return acumulado;
    }

    private ArrayList<DetalleCompra>detalles =new ArrayList<>();
    private double valorTotal = 0;

    //metodo para calcular total

    private void calcularTotal() {
        this.valorTotal = 0.0;
        for (DetalleCompra detalle : detalles) {
            this.valorTotal += detalle.calcularSubtotal();
        }
    }

    public void comenzarCarro() {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        do {
            for (Producto producto : listaProductos) {
                System.out.println(producto);
            }

            System.out.print("Ingrese el código del producto que desea: ");
            int codigoProducto = sc.nextInt();

            for (Producto producto : listaProductos) {
                if (producto.getCodigoProducto() == codigoProducto) {

                    System.out.print("¿Qué cantidad desea?: ");
                    int cantidadDeseada = sc.nextInt();

                    // Uso de la validación hayStock del producto
                    if (producto.hayStock(cantidadDeseada)) {

                        // Reducir el stock del producto
                        producto.reducirStock(cantidadDeseada);

                        DetalleCompra nuevoDetalle = new DetalleCompra(producto, cantidadDeseada);
                        detalles.add(nuevoDetalle);

                        System.out.println("Hecho.");
                    } else {
                        System.out.println("No hay suficiente stock disponible.");
                    }
                    break;
                }
            }
            System.out.println("¿Desea continuar comprando? (1: Sí / 2: No)");
            opcion = sc.nextInt();
        } while (opcion != 2);
        calcularTotal();
        System.out.println("Valor total: " + valorTotal);
    }

}