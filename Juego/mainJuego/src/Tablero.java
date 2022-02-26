import javax.swing.*;
public class Tablero{
    public int casillas = 0;
    public int numFichas = 0;

    public Tablero(int numCasillas,int numF ){
        casillas = numCasillas;
        numFichas = numF;
        int[] fichas = new int[numFichas];
        
    }

    public String solicitarFichas(){
        String colorFicha = String.valueOf(JOptionPane.showInputDialog(null,"Digite el color de la ficha:  "));
        return colorFicha;

    }

    Ficha ficha = new Ficha(solicitarFichas());


    public void ganador(){
        for (int i=0; i<fichas.size(); i++ ){
            if (i.posicion >= casillas){
                System.out.println("El ganador es:  " );
                break;
            }
        }
    }

}