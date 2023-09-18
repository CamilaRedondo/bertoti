import java.util.ArrayList;
import java.util.List;


public class GrupoDeGraficos implements Grafico{
    private final List<Grafico> graficos = new ArrayList<>();

    public void adicionar(Grafico grafico) {
        graficos.add(grafico);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um grupo de elementos:");
        for (Grafico grafico : graficos) {
            grafico.desenhar();
        }
    }
}
