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
                }
            }while (opcion!=0);
        }else{
            System.out.println("Opción no valida.");
        }

    }
}
