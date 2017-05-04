/**
 *
 * @author franciscoJavier
 */
public class Vaca  extends Animal {
    
    public Vaca() {
        super();
        puntosDeVida = PUNTOS_VIDA;
        peso = PESO_VACA;
    }
    
    @Override
    public void comer() {
        peso += 2;
        puntosDeVida -= 10;
    }

    @Override
    public void emitirSonidoCaracteristico() {
        System.out.println("Muu, muu");
    }

    public int getPeso() {
        return super.getPeso();
    }

    public int getPuntosDeVida() {
        return super.puntosDeVida;
    }

    @Override
    public void vacunar(){
        puntosDeVida += 30;
    }

}

