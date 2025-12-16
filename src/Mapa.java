import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Mapa {
    int x;
    int y;
    String tamano[][];
    boolean vivo = true;
    Scanner sc = new Scanner(System.in);
    String serpiente = "\uD83D\uDCA2";

    public Mapa(int x, int y) {
        this.x = x;
        this.y = y;
        this.tamano = new String[x][y];

        for (int i = 0; i < tamano.length; i++) {
            for (int j = 0; j < tamano[0].length; j++) {
                tamano[i][j] = "0";
            }
        }
    }

    public void moverSerpiente(String opcion) {
        if (opcion.equalsIgnoreCase("d")) {

        }
    }

    public void iniciarJuego() {
        int posicion = 0;
        while (vivo) {
            try {
                posicion++;
                tamano[0][posicion] = serpiente;
                if (posicion >+ 1) {
                    tamano[0][posicion-1] = "0";
                }
                Thread.sleep(850);
                for (int i = 0; i < 20; i++) {
                    System.out.println();
                }
                for (int i = 0; i < tamano.length; i++) {
                    for (int j = 0; j < tamano[0].length - 1; j++) {
                        System.out.print(tamano[i][j]);
                    }
                    System.out.println();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        }

    }
}
