import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Mapa mapa = new Mapa(5, 5);

        System.out.println("*".repeat(45));
        System.out.println("¡BIENVENIDO AL MENU DEL JUEGO DE LA SERPIENTE!");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = sc.nextLine();
        Partida partida = new Partida(10, nombre);
        System.out.println("1. Jugar");
        System.out.println("2. Puntuacion");
        System.out.println("0. Salir");
        System.out.println("*".repeat(45));

        System.out.print("* Eligue una opocion: ");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){
            case 1:
                mapa.iniciarJuego();
                break;
            case 2:
                partida.verPuntuacion();
                break;
        }
    }
}