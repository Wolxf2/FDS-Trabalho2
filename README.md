Exercício de fixação: uso do “Maven”

O objetivo deste exercício é fixar os conceitos envolvidos na utilização do “Maven” entender os problemas que surgem quando utilizamos diferentes tecnologias em um projeto desenvolvido em equipe. Para tanto iremos fazer uma melhoria no projeto do catálogo de veículos desenvolvido nas aulas sobre GitHub.

Na versão original este sistema trabalhava com uma lista de veículos “hard-coded” no construtor da classe “CatalogoVeiculos”. A ideia agora é que as listas de veículos de cada categoria sejam armazenadas em arquivos texto distintos. Dessa maneira se são três categorias teremos 3 arquivos texto diferentes. Um requisito importante é que estes arquivos sigam o formato CSV (Comma Separated Values).

Arquivos CSV são basicamente arquivos textos (com terminação .csv) com um registro por linha. Em cada linha os campos estão separados por vírgulas. A primeira linha é o cabeçalho que descreve o conteúdo das demais como no exemplo que segue:

placa,marca,modelo,ano,valor,consumoKmLt 

ABC1J23,WV,VIRTUS,2018,85000.0,14 

IDZ4J23,HONDA,HRV,2019,96000.0,12 

JJW8L44,TOYOTA,COROLA,2016,65000.0,10 

FUS6C00,VW,TIGUAN,2021,220000.0,12

Este tipo de arquivo é gerado por diversos aplicativos muito utilizados no mercado entre os quais se destaca o MS Excel. A leitura deste tipo de arquivo em Java, entretanto, pode ser trabalhosa. Para facilitar esta atividade no contexto do projeto "Apache" foi criada uma API para a leitura deste tipo de arquivo, a "Apache Commons CSV".

Para execurtar o programa use o código: java -jar ./target/FDS-Trabalho2-1.0-SNAPSHOT.jar