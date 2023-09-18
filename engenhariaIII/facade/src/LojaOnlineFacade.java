public class LojaOnlineFacade {
    private Estoque estoque;
    private Pagamento pagamento;
    private Envio envio;

    public LojaOnlineFacade() {
        this.estoque = new Estoque();
        this.pagamento = new Pagamento();
        this.envio = new Envio();
    }

    public void fazerPedido(String produto, double valor, String endereco) {
        estoque.verificarEstoque(produto);
        pagamento.processarPagamento(produto, valor);
        envio.enviarProduto(produto, endereco);
        System.out.println("Pedido concluído com sucesso!");
    }
}
