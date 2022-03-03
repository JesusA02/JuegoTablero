import javax.swing.*;
public class Tablero{
    public int casillas = 0;
    public int numFichas = 0;
    public Ficha[] fichas; 
    

    public Tablero(int numCasillas,int numF ){
        casillas = numCasillas;
        numFichas = numF;
        fichas = new Ficha[numFichas];
        creadorFichas(numFichas); 
    }

    //función que añade las fichas a la lista

    public void creadorFichas(int numeroFichas){
        int contador = 0;

        for(int i = 0; i < fichas.length; i++ ){
            String colorFicha = String.valueOf(JOptionPane.showInputDialog(null,"Digite el color de la ficha:  "));
            Ficha ficha = new Ficha(colorFicha);
            
            fichas[contador] = ficha;
            contador += 1;
        }
    }


    public void turnos(){
        int contador = 0;
        while(contador < fichas.length){ // En esta linea mediante un contador y utilizando
            System.out.println(" ");
            System.out.println("El siguiente en jugar es el jugador con la ficha color:  "+fichas[contador].color);
            fichas[contador].avanzar(); // el largo con la fila de fichas, hace que cada ficha avance
            contador += 1;               

        }

    }

    public boolean ganador(){
        int largoLista = fichas.length;
        for (int i=0; i < largoLista; i++ ){
            if (fichas[i].posicion >= casillas){
                JOptionPane.showMessageDialog(null,"El ganador es la ficha color:  " + fichas[i].color);
                return true;
                
            }
        }
        return false;
    }
    
}