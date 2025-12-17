public class Partida {

    private int puntuacion;
    private String nombre;



    public Partida(int puntuacion, String nombre) {
        this.puntuacion = puntuacion;
        this.nombre = nombre;
    }

    public String verPuntuacion(){
       String s = (nombre+" obtuvo una puntuacion de "+puntuacion+" puntos");
        return s;
    }

    public int getPuntuacion() {
        return puntuacion;
    }




}
