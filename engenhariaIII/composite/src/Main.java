public class Main {
    public static void main(String[] args) {
        // Criando elementos individuais
        Grafico circulo = new Circulo();
        Grafico retangulo = new Retangulo();

        // Criando um grupo de elementos
        GrupoDeGraficos grupo = new GrupoDeGraficos();
        grupo.adicionar(circulo);
        grupo.adicionar(retangulo);

        // Criando um grupo maior com elementos individuais e o grupo anterior
        GrupoDeGraficos grupoMaior = new GrupoDeGraficos();
        grupoMaior.adicionar(circulo);
        grupoMaior.adicionar(grupo);

        // Desenhando todos os elementos
        circulo.desenhar();
        retangulo.desenhar();
        grupo.desenhar();
        grupoMaior.desenhar();
    }
}
