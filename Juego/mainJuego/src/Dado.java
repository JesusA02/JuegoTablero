
public class Dado {
    public int caras = 0;

    public Dado(int numCaras){
        caras = numCaras;
    }

    public int lanzar(){
        int numRandom = (int) (Math.random()*caras+1);
        return numRandom; //Número random
    }
}
