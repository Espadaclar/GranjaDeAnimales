
/**
 *
 * @author franciscoJavier
 */
public class Pato extends Animal  {

    public Pato() {
        super();
        puntosDeVida = PUNTOS_VIDA;
        peso = PESO_PATO;
    } 

    @Override
    public void comer() {
        peso += 1;
        puntosDeVida -= 10;
    }

    @Override
    public void emitirSonidoCaracteristico() {
        System.out.println("Cua, cua");
    }

    public int getPeso() {
        return super.getPeso();
    }

    public void vacunar(){     
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

}

