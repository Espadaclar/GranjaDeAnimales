


/**
 *
 * @author franciscoJavier
 */
public class Pollo extends Animal  {

    public Pollo() {
        super();
        puntosDeVida = PUNTOS_VIDA;
        peso = PESO_POLLO;
    } 
    
    @Override
    public void comer() {
         peso += 1;
        puntosDeVida -= 10;
    }

    @Override
    public void emitirSonidoCaracteristico() {
         System.out.println("pio, pio");
    }
   
    public int getPeso() {
        return super.getPeso();
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
    
    @Override
    public void vacunar(){
        puntosDeVida += 10;
    }
    
    //     @Override
    //     public void comer() {
    //          peso += 1;
    //     }
    // 
    //     @Override
    //     public void emitirSonidoCaracteristico() {
    //          System.out.println("pio, pio");
    //     }
    // 
    //     @Override
    //     public int getPeso() {
    //         return getPeso();
    //     }
    // 
    //     @Override
    //     public int getPuntoDeVida() {
    //         return 0;
    //     }
}











