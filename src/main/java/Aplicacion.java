import java.util.Scanner;

public class Aplicacion {
    static void main() {
        Scanner sc= new Scanner(System.in);
        //Objeto supermercado
        Supermercado supermercado= new Supermercado("MarketPlus", "Carrera 18 #29 No.10", 301610544);

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
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("------- Eliminar cliente -------\n");

                        System.out.println("Ingrese el documento del cliente: ");
                        int documento= sc.nextInt();
                        boolean eliminado= supermercado.eliminarcliente(documento);
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
                            for(Cliente cliente: supermercado.getListaClientes()){
                                System.out.println(cliente);
                            }
                        } else if (eleccion==2) {
                            System.out.print("Ingrese el documento del cliente: ");
                            documento= sc.nextInt();
                            Cliente cliente=supermercado.mostrarCliente(documento);
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
