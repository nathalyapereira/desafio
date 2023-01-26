# Princípio Aberto-Fechado (Open-Closed Principle)

Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação, ou seja, quando novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o código fonte original.

Seguindo este princípio foi realizado um exemplo sobre a compra de planos de saúde.

Nesse exemplo recebo do cliente o nome, saldo e referente a escolha do cliente recebo a escolha de qual planos de saúde (individual/família) desejado e a franquia. Com as escolhas do cliente e seu saldo é possivél calcular o saldo restante através da Classe PagamentoMensalFranquia.

É aplicado o OCP quando a interface PlanoDeSaude é implementada pelas Classes que representam plano de saude na aplicação como PlanoIndividual e PlanoFamilia também podendo adicionar novas classes ao implementar essa interface, assim alterando a implemetação do método pagarPlano.
