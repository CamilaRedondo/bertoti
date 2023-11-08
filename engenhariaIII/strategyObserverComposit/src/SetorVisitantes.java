public class SetorVisitantes {
    private String nome;

    public SetorVisitantes(String nome) {
        this.nome = nome;
    }

    public void observarAnimal(Animal animal, String acao) {
        System.out.println(nome + ": Observando " + animal.getNome() + " sendo " + acao);
    }
}
