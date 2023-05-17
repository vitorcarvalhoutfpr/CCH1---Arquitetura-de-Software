# CCH1 - Padrões de Projetos Criacionais - Arquitetura de Software

No desenvolvimento de um sistema de e-commerce, onde é necessário criar produtos para serem vendidos online. Cada produto possui diferentes informações, como nome, descrição e preço, além de possíveis atributos específicos dependendo do tipo de produto.

O problema que enfrentamos é como criar objetos produto de forma flexível e modular, permitindo configurar suas propriedades de maneira clara e eficiente. Além disso, queremos evitar a criação de múltiplos construtores com muitos parâmetros, o que tornaria o código difícil de manter e aumentaria a complexidade.
O padrão Builder separa o processo de construção de um objeto complexo da sua representação final, permitindo uma construção passo a passo e configurável.

No código apresentado, a classe Produto representa o objeto que desejamos criar. Ela possui atributos como nome, descrição e preço, juntamente com os respectivos métodos setNome, setDescricao e setPreco para configurar esses atributos.

Para facilitar a criação do objeto Produto, utilizamos a classe ProdutoBuilder. Essa classe é responsável por construir o objeto Produto, fornecendo métodos de configuração, como adicionarNome, adicionarDescricao e adicionarPreco. Cada método retorna a própria instância do ProdutoBuilder, permitindo o encadeamento das chamadas de configuração.
O método build() na classe ProdutoBuilder é responsável por retornar o objeto Produto final, que foi configurado passo a passo com os atributos desejados.
Na classe ExemploBuilder, podemos ver como usar o padrão Builder para criar um produto personalizado. As chamadas de métodos encadeados no ProdutoBuilder configuram o nome como "Celular", a descrição como "Um celular diferente" e o preço como 999.99. Em seguida, o método build() é chamado para obter o objeto Produto final, devidamente configurado.
Essa abordagem com o padrão Builder oferece uma solução flexível e escalável para criar objetos Produto complexos, especialmente quando há muitos atributos e diferentes tipos de produtos. Ele evita a necessidade de ter construtores com muitos parâmetros ou vários construtores, tornando o código mais legível, modular e fácil de manter.
