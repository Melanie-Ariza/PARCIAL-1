import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aplicacion {
    static void main() throws ParseException {
        Scanner sc= new Scanner(System.in);
        //Objeto supermercado
        Supermercado supermercado= new Supermercado("MarketPlus", "Carrera 18 #29 No.10", 301610544);

        //Objeto clientes
        Cliente cliente1= new Cliente("Ana", 123, 1234546, "ana@gmail.com");
        supermercado.agregarCliente(cliente1);

        //Objetos productos
        Producto producto_1= new Producto(111, "Arroz", 3200, 50, Categoria.ALIMENTOS);
        Producto producto_2= new Producto(112, "Papa", 2000, 50, Categoria.ALIMENTOS);
        Producto producto_3= new Producto(113, "Harina", 8000, 50, Categoria.ALIMENTOS);

        Producto producto_4= new Producto(221, "Monster", 12500, 50, Categoria.BEBIDAS);
        Producto producto_5= new Producto(222, "Coca-Cola", 7000, 50, Categoria.BEBIDAS);
        Producto producto_6= new Producto(223, "Sprite", 6000, 50, Categoria.BEBIDAS);

        Producto producto_7= new Producto(331, "Detergente", 10000, 50, Categoria.PRODUCTOSDEASEO);
        Producto producto_8= new Producto(332, "Escoba", 15000, 50, Categoria.PRODUCTOSDEASEO);
        Producto producto_9= new Producto(333, "Trapero", 18500, 50, Categoria.PRODUCTOSDEASEO);

        Producto producto_10= new Producto(441, "Crema dental", 5000, 50, Categoria.CUIDADOPERSONAL);
        Producto producto_11= new Producto(442, "Protector solar", 50000, 50, Categoria.CUIDADOPERSONAL);
        Producto producto_12= new Producto(443, "Jabon", 7500, 50, Categoria.CUIDADOPERSONAL);
        supermercado.agregarProducto(producto_1);
        supermercado.agregarProducto(producto_2);
        supermercado.agregarProducto(producto_3);
        supermercado.agregarProducto(producto_4);
        supermercado.agregarProducto(producto_5);
        supermercado.agregarProducto(producto_6);
        supermercado.agregarProducto(producto_7);
        supermercado.agregarProducto(producto_8);
        supermercado.agregarProducto(producto_9);
        supermercado.agregarProducto(producto_10);
        supermercado.agregarProducto(producto_11);
        supermercado.agregarProducto(producto_12);

        //Menu
        int opcion;
        System.out.println("======= BIENVENIDO =======");
        System.out.println("¿Cómo se identifica?");
        System.out.println("1. Cliente");
        System.out.println("2. Personal");
        System.out.print("Seleccione la opción: ");
        opcion= sc.nextInt();
        sc.nextLine();

        if (opcion==1){
            do {
                System.out.println("======= CLIENTE =======");
                System.out.println("1. Agregar cliente.");
                System.out.println("2. Comenzar compra.");
                System.out.println("3. Actualizar compra.");
                System.out.println("6. Eliminar compra.");
                System.out.print("Seleccione la opción: ");
                opcion= sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        System.out.println("------- Agregar cliente -------\n");

                        System.out.print("Nombre: ");
                        String nombre= sc.nextLine();
                        System.out.print("Documento: ");
                        int documento= sc.nextInt();
                        System.out.print("Telefono: ");
                        int telefono= sc.nextInt();
                        sc.nextLine();
                        System.out.print("Correo: ");
                        String correo= sc.nextLine();
                        Cliente cliente= new Cliente(nombre, documento, telefono, correo);
                        if (supermercado.agregarCliente(cliente)){
                            System.out.println("Cliente agregado correctamente.");
                        }else {
                            System.out.println("Cliente ya existente.");
                        }
                        break;
                    case 2:

                }
            }while (opcion!=0);

        
        } else if (opcion==2) {
            do {
                System.out.println("======= PERSONAL =======");

                System.out.println("1. Agregar cliente.");
                System.out.println("2. Actualizar cliente.");
                System.out.println("3. Eliminar cliente.");
                System.out.println("4. Mostrar cliente.");
                System.out.println("----------------------------------------");
                System.out.println("5. Actualizar compra.");
                System.out.println("6. Eliminar compra.");
                System.out.println("7. Mostrar compra.");
                System.out.println("----------------------------------------");
                System.out.println("8. Agregar producto.");
                System.out.println("9. Actualizar productos.");
                System.out.println("10. Eliminar productos.");
                System.out.println("11. Mostrar productos.");
                System.out.print("Seleccione la opción: ");
                opcion= sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        System.out.println("------- Agregar cliente -------\n");

                        System.out.print("Nombre: ");
                        String nombre= sc.nextLine();
                        System.out.print("Documento: ");
                        int documento= sc.nextInt();
                        System.out.print("Telefono: ");
                        int telefono= sc.nextInt();
                        sc.nextLine();
                        System.out.print("Correo: ");
                        String correo= sc.nextLine();
                        Cliente cliente= new Cliente(nombre, documento, telefono, correo);
                        if (supermercado.agregarCliente(cliente)){
                            System.out.println("Cliente agregado correctamente.");
                        }else {
                            System.out.println("Cliente ya existente.");
                        }
                        break;
                    case 2:
                        System.out.println("------- Actualizar cliente -------\n");

                        System.out.print("Documento de cliente a actualizar: ");
                        documento= sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre= sc.nextLine();

                        System.out.print("Nuevo telefono: ");
                        int nuevoTelefono= sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nuevo correo: ");
                        String nuevoCorreo= sc.nextLine();

                        Cliente clienteActualizado=new Cliente(nuevoNombre, documento, nuevoTelefono, nuevoCorreo);
                        if (supermercado.actulizarCliente(documento, clienteActualizado)){
                            System.out.println("Cliente actualizado correctamente.");
                        }else {
                            System.out.println("Cliente no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.println("------- Eliminar cliente -------\n");

                        System.out.print("Ingrese el documento del cliente: ");
                        documento= sc.nextInt();
                        boolean eliminado= supermercado.eliminarCliente(documento);
                        if (eliminado){
                            System.out.println("Cliente eliminado correctamente.");
                        }else {
                            System.out.println("Cliente no encontrado.");
                        }
                        break;
                    case 4:
                        System.out.println("------- Mostrar cliente -------\n");

                        System.out.println("1. Mostrar lista de clientes.");
                        System.out.println("2. Mostrar cliente por documento.");
                        int eleccion= sc.nextInt();
                        if (eleccion== 1){
                            for(Cliente cliente2: supermercado.getListaClientes()){
                                System.out.println(cliente2);
                            }
                        } else if (eleccion==2) {
                            System.out.print("Ingrese el documento del cliente: ");
                            documento= sc.nextInt();
                            Cliente mostrarCliente=supermercado.mostrarCliente(documento);
                            System.out.println(mostrarCliente);
                        }else {
                            System.out.println("Opción no valida.");
                        }
                        break;
                    case 5:
                        System.out.println("------- Agregar compra -------\n");

                        System.out.print("Codigo compra: ");
                        int codigoCompra= sc.nextInt();

                        System.out.print("Fecha Compra: ");
                        String fechaTexto= sc.nextLine();
                        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
                        Date fechaCompra= formato.parse(fechaTexto);

                        System.out.print("Valor total: ");
                        double valorTotal= sc.nextInt();
                        sc.nextLine();

                        System.out.print("Metodo de pago: "+
                                "1. Tarjeta"+
                                "  2. Transferencia"+
                                "  3. Efectivo");
                        int metodo= sc.nextInt();

                        MetodoPago metodoPago = null;
                        if (metodo==1){
                            metodoPago= MetodoPago.TARJETA;
                        } else if (metodo==2) {
                            metodoPago=MetodoPago.TRANSFERENCIA;
                        } else if (metodo==3) {
                            metodoPago= MetodoPago.EFECTIVO;
                        }else {
                            System.out.println("Opción no valida.");
                        }
                        Compra compra= new Compra(codigoCompra, fechaCompra, valorTotal, metodoPago);
                        if (supermercado.agregarCompra(compra)){
                            System.out.println("Compra agregada correctamente.");
                        }else {
                            System.out.println("Compra ya existente.");
                        }
                        break;
                    case 6:
                        System.out.println("------- Actualizar compra -------\n");

                        System.out.print("Codigo de compra a actualizar: ");
                        codigoCompra= sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nuevo fecha de compra: ");
                        fechaTexto= sc.nextLine();
                        formato= new SimpleDateFormat("dd/MM/yyyy");
                        Date nuevaFecha= formato.parse(fechaTexto);

                        System.out.print("Nuevo valor total: ");
                        double nuevoValorTotal= sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Nuevo metodo de pago: \n"+
                                "1. Tarjeta"+
                                "  2. Transferencia"+
                                "  3. Efectivo");
                        metodo= sc.nextInt();

                        MetodoPago nuevoMetodoPago = null;
                        if (metodo==1){
                            nuevoMetodoPago= MetodoPago.TARJETA;
                        } else if (metodo==2) {
                            nuevoMetodoPago=MetodoPago.TRANSFERENCIA;
                        } else if (metodo==3) {
                            nuevoMetodoPago= MetodoPago.EFECTIVO;
                        }else {
                            System.out.println("Opción no valida.");
                        }

                        Compra compraActualizada= new Compra(codigoCompra, nuevaFecha, nuevoValorTotal, nuevoMetodoPago);

                        if (supermercado.actulizarCompra(codigoCompra, compraActualizada)){
                            System.out.println("Compra actualizada correctamente.");
                        } else {
                            System.out.println("Compra no encontrada.");
                        }
                        break;
                    case 7:
                        System.out.println("------- Eliminar compra -------\n");

                        System.out.print("Ingrese el codigo de compra: ");
                        codigoCompra= sc.nextInt();
                        eliminado= supermercado.eliminarCompra(codigoCompra);
                        if (eliminado){
                            System.out.println("Compra eliminada correctamente.");
                        }else {
                            System.out.println("Compra no encontrada.");
                        }
                        break;
                    case 8:
                        System.out.println("------- Mostrar compra -------\n");

                        System.out.println("1. Mostrar lista de compras.");
                        System.out.println("2. Mostrar compra por codigo de compra.");
                        eleccion= sc.nextInt();
                        if (eleccion== 1){
                            for(Compra compra2: supermercado.getListaCompras()){
                                System.out.println(compra2);
                            }
                        } else if (eleccion==2) {
                            System.out.print("Ingrese el codigo de compra: ");
                            documento= sc.nextInt();
                            Compra mostrarCompra=supermercado.mostrarCompra(documento);
                            System.out.println(mostrarCompra);
                        }else {
                            System.out.println("Opción no valida.");
                        }
                        break;
                    case 9:
                        System.out.println("------- Agregar Producto -------\n");

                        System.out.print("Codigo: ");
                        int codigoProducto= sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nombre: ");
                        nombre= sc.nextLine();

                        System.out.print("Precio unitario: ");
                        double precioUnitario= sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Cantidad: ");
                        int cantidad= sc.nextInt();
                        System.out.print("Categoría \n"+
                                "1. Alimentos"+
                                "2. Bebidas"+
                                "3. Productos de aseo"+
                                "4. Cuidado personal");
                        System.out.print("Seleccione una categoria: ");
                        int numeroCategoria= sc.nextInt();
                        Categoria categoria = null;
                        if (numeroCategoria==1){
                            categoria= Categoria.ALIMENTOS;
                        } else if (numeroCategoria==2) {
                            categoria=Categoria.BEBIDAS;
                        } else if (numeroCategoria==3) {
                            categoria= Categoria.PRODUCTOSDEASEO;
                        }else if (numeroCategoria==4) {
                            categoria = Categoria.CUIDADOPERSONAL;
                        }else {
                            System.out.println("Opción no valida.");
                        }

                        Producto producto= new Producto(codigoProducto, nombre, precioUnitario, cantidad, categoria);
                        if (supermercado.agregarProducto(producto)){
                            System.out.println("Producto agregado correctamente.");
                        }else {
                            System.out.println("Producto ya existente.");
                        }
                        break;
                    case 10:
                        System.out.println("------- Actualizar producto -------\n");

                        System.out.print("Codigo producto a actualizar: ");
                        codigoProducto= sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nuevo nombre: ");
                        nuevoNombre= sc.nextLine();

                        System.out.print("Nuevo precio unitario: ");
                        double nuevoPrecioUnitario= sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Nueva cantidad: ");
                        int nuevaCantidad= sc.nextInt();

                        System.out.print("Nueva categoria: " +
                                "1. Alimentos"+
                                "2. Bebidas"+
                                "3. Productos de aseo"+
                                "4. Cuidado personal");
                        numeroCategoria= sc.nextInt();

                        Categoria nuevaCategoria= null;
                        if (numeroCategoria==1){
                            nuevaCategoria= Categoria.ALIMENTOS;
                        } else if (numeroCategoria==2) {
                            nuevaCategoria=Categoria.BEBIDAS;
                        } else if (numeroCategoria==3) {
                            nuevaCategoria= Categoria.PRODUCTOSDEASEO;
                        }else if (numeroCategoria==4){
                            nuevaCategoria= Categoria.CUIDADOPERSONAL;
                        }else{
                            System.out.println("Opción no valida.");
                        }
                        Producto productoActualizado=new Producto(codigoProducto, nuevoNombre, nuevoPrecioUnitario, nuevaCantidad, nuevaCategoria);
                        if (supermercado.actulizarProducto(codigoProducto, productoActualizado)){
                            System.out.println("Producto actualizado correctamente.");
                        }else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    case 11:
                        System.out.println("------- Eliminar producto -------\n");

                        System.out.print("Ingrese el codigo de producto: ");
                        codigoProducto= sc.nextInt();
                        eliminado= supermercado.eliminarProducto(codigoProducto);
                        if (eliminado){
                            System.out.println("Producto eliminado correctamente.");
                        }else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    case 12:
                        System.out.println("------- Mostrar producto -------\n");

                        System.out.println("1. Mostrar lista de productos.");
                        System.out.println("2. Mostrar producto por codigo.");
                        eleccion= sc.nextInt();
                        if (eleccion== 1){
                            for(Producto producto1: supermercado.getListaProductos()){
                                System.out.println(producto1);
                            }
                        } else if (eleccion==2) {
                            System.out.print("Ingrese el codigo del producto: ");
                            codigoProducto= sc.nextInt();
                            Producto mostrarProducto=supermercado.mostrarProducto(codigoProducto);
                            System.out.println(mostrarProducto);
                        }else {
                            System.out.println("Opción no valida.");
                        }
                        break;

                    default:
                }
            }while (opcion!=0);
        }else{
            System.out.println("Opción no valida.");
        }

    }
}