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
        do {
            if (opcion==1){
                System.out.println("======= CLIENTE =======");

            } else if (opcion==2) {
                System.out.println("======= PERSONAL =======");

                System.out.println("1. Agregar cliente.");
                System.out.println("2. Actualizar cliente.");
                System.out.println("3. Eliminar cliente.");
                System.out.println("4. Mostrar cliente.");


                switch (opcion){
                    case 1:
                        break;
                }
            }else{
                System.out.println("Opción no valida.");
            }

        }while (opcion!=0);
    }
}
