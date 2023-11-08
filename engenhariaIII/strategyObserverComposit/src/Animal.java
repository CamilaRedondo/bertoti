public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void comer() {
        System.out.println(nome + " está se alimentando.");
    }

    public void realizarCheckup() {
        System.out.println("Realizando check-up de " + nome);
    }
}
