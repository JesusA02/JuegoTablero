import javax.swing.*;
public class Tablero{
    public int casillas = 0;
    public int numFichas = 0;
    public int[] fichas = new int[numFichas];

    public Tablero(int numCasillas,int numF ){
        casillas = numCasillas;
        numFichas = numF;
        //int[] fichas = new int[numFichas];
        
    }

    public String solicitarFichas(){
        String colorFicha = String.valueOf(JOptionPane.showInputDialog(null,"Digite el color de la ficha:  "));
        return colorFicha;

    }

    Ficha ficha = new Ficha(solicitarFichas());


    public void turnos(){
        int contador = 0;
        while(contador < fichas.length){ // En esta linea mediante un contador y utilizando 
            fichas[contador].avanzar(); // el largo con la fila de fichas, hace que cada ficha avance
            contador += 1;               

        }

    }


    
    public void ganador(){
        int largoLista = fichas.length;
        for (int i=0; i < largoLista; i++ ){
            if (i.posicion >= casillas){
                System.out.println("El ganador es:  " );
                break;
            }
        }
    }
    
}