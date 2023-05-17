# CCH1 - Padrões de Projetos Criacionais - Arquitetura de Software

No código apresentado, a classe Produto representa o objeto que desejamos criar. Ela possui atributos como nome, descrição e preço, juntamente com os respectivos métodos setNome, setDescricao e setPreco para configurar esses atributos.

Para facilitar a criação do objeto Produto, utilizamos a classe ProdutoBuilder. Essa classe é responsável por construir o objeto Produto, fornecendo métodos de configuração, como adicionarNome, adicionarDescricao e adicionarPreco. Cada método retorna a própria instância do ProdutoBuilder, permitindo o encadeamento das chamadas de configuração.
O método build() na classe ProdutoBuilder é responsável por retornar o objeto Produto final, que foi configurado passo a passo com os atributos desejados.
Na classe ExemploBuilder, podemos ver como usar o padrão Builder para criar um produto personalizado. As chamadas de métodos encadeados no ProdutoBuilder configuram o nome como "Celular", a descrição como "Um celular diferente" e o preço como 999.99. Em seguida, o método build() é chamado para obter o objeto Produto final, devidamente configurado.
Essa abordagem com o padrão Builder oferece uma solução flexível e escalável para criar objetos Produto complexos, especialmente quando há muitos atributos e diferentes tipos de produtos. Ele evita a necessidade de ter construtores com muitos parâmetros ou vários construtores, tornando o código mais legível, modular e fácil de manter.
