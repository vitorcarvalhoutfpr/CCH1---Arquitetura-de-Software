public class ExemploBuilder {
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                        .adicionarNome("Celular")
                        .adicionarDescricao("Um celular diferente")
                        .adicionarPreco(999.99)
                        .build();
        System.out.println(produto);
    }
}