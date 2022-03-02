import javax.swing.*;
public class App {
    
    public static void main(String[] args) throws Exception {
        
        int casillas = 0 ;
        int cantiFichas = 0;
        boolean seguir = true;

        JOptionPane.showMessageDialog(null," ¡Bienvenido a este juego! Presione (Aceptar) para continuar. ");
        cantiFichas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de fichas con las que sea jugar: "));
        casillas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de casillas con las que sea jugar: "));

        //Ficha miFicha = new Ficha();
        Tablero miTablero = new Tablero(casillas,cantiFichas) ;

        while (seguir){
            
            miTablero.turnos();

            if (miTablero.ganador()){
                seguir = false;
            }

        }
    }
}
