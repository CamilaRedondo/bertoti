import java.util.ArrayList;
import java.util.List;

public class Zologico {

    private String nome;
    private List<SetorVisitantes> setoresVisitantes;
    private List<Animal> animais;

    public Zologico(String nome) {
        this.nome = nome;
        this.setoresVisitantes = new ArrayList<>();
        this.animais = new ArrayList<>();
    }

    public void adicionarSetorVisitantes(SetorVisitantes setor) {
        setoresVisitantes.add(setor);
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void cuidarAnimal(Animal animal, CuidadoAnimal cuidado) {
        cuidado.cuidarAnimal(animal);
        for (SetorVisitantes setor : setoresVisitantes) {
            setor.observarAnimal(animal, cuidado.getClass().getSimpleName());
        }
    }
}
