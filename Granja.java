
import java.util.ArrayList;
/**
 * @author franciscoJavier
 */
public class Granja {
    public ArrayList<Animal> animales;

    public Granja(){
        animales = new ArrayList<>();
    }

    public void alimentar(Animal nameAnimal) {
        nameAnimal.comer();
        animales.add(nameAnimal);       
    }

    public void vacunar(Animal nameAnimal) {
        nameAnimal.vacunar();
        animales.add(nameAnimal);
    }

    public void hacerEmitirSonidoCaracterístico(Animal nameAnimal) {
        animales.add(nameAnimal);
        nameAnimal.emitirSonidoCaracteristico(); 
    }
}


