# Princípio da Responsabilidade Única (Single Responsibility Principle)


Esse princípio declara que uma classe deve ter um, e somente um, motivo para mudar.

Seguindo este princípio foi realizado um exemplo sobre compra de produtos.

Nesse exemplo separei cada classe com uma única responsabilidade sendo:

Produto - responsável por lidar com as informações de produto;

Clinte - responsável por lidar com as informações do clinte;

Compra - responsável por lidar com as informações da compra;

CompraDAO - responsável por lidar com o acesso as informações do banco de dados;


obs: CompraDAO é uma simulação de banco de dados, sendo a lista comparada a tabela.
