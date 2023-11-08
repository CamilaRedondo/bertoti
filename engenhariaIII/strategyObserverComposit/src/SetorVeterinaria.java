public class SetorVeterinaria {
    private String nome;

    public SetorVeterinaria(String nome) {
        this.nome = nome;
    }

    public void tratarAnimal(Animal animal, String acao) {
        System.out.println(nome + ": Tratando " + animal.getNome() + " por estar sendo " + acao);
    }
}
