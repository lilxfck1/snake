import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Mapa mapa = new Mapa(10, 10);

        System.out.println("*".repeat(45));
        System.out.println("¡BIENVENIDO AL MENU DEL JUEGO DE LA SERPIENTE!");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Jugar");
        System.out.println("2. Puntuacion");
        System.out.println("0. Salir");
        System.out.println("*".repeat(45));

        System.out.print("* Eligue una opocion: ");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){
            case 1:
            if (opcion == 1){
                mapa.iniciarJuego();
            }
            case 2:
            if (opcion == 2){
                mapa.verPuntuacion();
            }
            case 3:
            if (opcion == 3){
                mapa.salir();
            }
        }
    }
}