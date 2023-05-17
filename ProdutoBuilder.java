public class ProdutoBuilder {
    private Produto produto;

    public ProdutoBuilder() {
        produto = new Produto();
    }

    public ProdutoBuilder adicionarNome(String nome) {
        produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder adicionarDescricao(String descricao) {
        produto.setDescricao(descricao);
        return this;
    }

    public ProdutoBuilder adicionarPreco(double preco) {
        produto.setPreco(preco);
        return this;
    }

    public Produto build() {
        return produto;
    }
}