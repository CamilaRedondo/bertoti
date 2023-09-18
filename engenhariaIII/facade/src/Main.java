public class Main {
    public static void main(String[] args) {
        LojaOnlineFacade loja = new LojaOnlineFacade();

        String produto = "Produto A";
        double valor = 100.0;
        String endereco = "123 Rua Principal";

        loja.fazerPedido(produto, valor, endereco);
    }
}
