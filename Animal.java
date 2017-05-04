/**
 *
 * @author franciscoJavier
 */
public abstract class Animal implements SeleccionDeAnimales{
    
    protected  int puntosDeVida;
    protected int peso;
    
    public static int PUNTOS_VIDA = 100;
    public static int PESO_POLLO = 1;
    public static int PESO_PATO = 2;
    public static int PESO_CERDO = 15;
    public static int PESO_VACA = 25;
    public Animal() {
        puntosDeVida = PUNTOS_VIDA;
        peso = 0;        
    }
    
    public  void comer(){
        peso = peso;
    }
    
    public  void emitirSonidoCaracteristico(){
        System.out.println("Cantando bajo la lluvia.");
    }
    
    public  void vacunar(){
        System.out.println("Este pato no se vacuna.");
    }
    
    public int getPeso(){
        return peso;
    }
    
    public int getPuntosDeVida(){
        return puntosDeVida;
    }
    
    
    @Override
    public String toString() {
        String datos = "";
        datos += "";
        datos += "Tipo de animal; \n";
        datos += "Puntos de vida; " +puntosDeVida+ "\n";
        datos += "Peso; " +peso+ "\n";
        
        return datos;
    }

   
    
    
}
