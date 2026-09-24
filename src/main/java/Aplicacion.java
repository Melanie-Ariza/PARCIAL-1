import java.util.Date;
import java.util.Scanner;

public class Aplicacion {
    static void main() {
        Scanner sc= new Scanner(System.in);
        //Objeto supermercado
        Supermercado supermercado= new Supermercado("MarketPlus", "Carrera 18 #29 No.10", 301610544);

        //Objeto clientes
        Cliente cliente1= new Cliente("Ana", 123, 1234546, "ana@gmail.com");

        //Objeto compra
        Compra compra= new Compra(123, new Date(),32000, MetodoPago.EFECTIVO );

        //Objetos productos
        Producto producto_1= new Producto(111, "Arroz", 20000, 50, Categoria.ALIMENTOS, compra);
        Producto producto_2= new Producto(222, "Leche", 12000, 50, Categoria.ALIMENTOS, compra);
        Producto producto_3= new Producto(333, "Crema demtal", 5000, 50, Categoria.ALIMENTOS, compra);

        System.out.println(compra);
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
                System.out.print("Seleccione la opción.");
                opcion= sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:

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
                System.out.print("Seleccione la opción.");
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

                        System.out.print("Documento de profesor a actualizar: ");
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

                        System.out.println("Ingrese el documento del cliente: ");
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
                            Cliente cliente2=supermercado.mostrarCliente(documento);
                        }else {
                            System.out.println("Opción no valida.");
                        }
                        break;

                }
            }while (opcion!=0);
        }else{
            System.out.println("Opción no valida.");
        }

    }
}
