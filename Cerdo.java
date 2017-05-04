/**
 *
 * @author franciscoJavier
 */
public class Cerdo extends Animal  {
    
    public Cerdo() {
        super();
        puntosDeVida = PUNTOS_VIDA;
        peso = PESO_CERDO;
    }
    
    @Override
    public void comer() {
         peso += 2;
         puntosDeVida -= 10;
    }

    @Override
    public void emitirSonidoCaracteristico() {
         System.out.println("Ñoinq, ñoinq");
    }

    @Override
    public void vacunar(){
       puntosDeVida += 20;
    }
    
    public int getPeso() {
        return super.getPeso();
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
    
    
    
}

