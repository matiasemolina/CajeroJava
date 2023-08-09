package test;
import entities.*;
import java.util.Scanner;
import controlador.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean continua;
        do {
        	continua=true;
            System.out.println("=== Menú de Consola ===");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion de iniciar sesion.");
                    // Aquí puedes agregar la lógica para la opción 1
                    break;
                case 2:
                	System.out.println("Saliendo del programa.");
                    continua=false;
                    // Aquí puedes agregar la lógica para la opción 2
                    break;
                default:
                    System.out.println("Opción inválida. Selecciona una opción válida.");
                    break;
            }
        } while (continua);
        System.out.println("=== Hasta luego ===");
	}

}