//import javax.swing.*;

public class Ficha {
    public String color = "";
    public int posicion = 0;

    Dado dado = new Dado(6);

    public Ficha(String colorF){
        color = colorF;
        posicion = 0;
    }

    public void avanzar(){
        int pasos = dado.lanzar();
        System.out.println("La ficha se moverá: "+ pasos + " posiciones.");
        posicion += pasos;
        System.out.println("La ficha se encuentra en la posición:  "+ posicion );
    }

}
