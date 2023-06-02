# Resgate aos alunos 
#### Prova 1: Técnicas de Programação

Jogo feito como sendo a primeira avaliação da materia de Técnicas de Programação. O principal foco do projeto é a Programação Orientada a Objetos.

## Como jogar

No inicio do jogo você será questionado sobre informações como: nome, dimensões do plano e número de bugs e alunos que o jogo irá possuir.

Após isso a primeira rodada irá começar e uma representação do Plano será mostrada no terminal.
Você vai jogar com Robôs. Sua missão é resgatar todos os alunos presentes no plano ~~mesmo que isso não seja possível~~ usando os Robôs disponíveis no plano e evitar os bugs que também estarão pelo caminho.

![](https://raw.githubusercontent.com/FortRaider68/tecnicas_de_programacao_listas/Main/ResgateAosAlunos(Prova%201)/capture01.png)

#### Lista de Robôs

|Robô|Símbolo|
|-----|-----|
|Andador | A |
|Peão | P |
|Torre| T |
|Bispo| B |
|Cavalo | C |
|Rei | R |
|Rainha | Q |

#### Lista de NPCs 

|Personagem|Símbolo|
|---|---|
|Aluno| U |
|Bug | S |

Você irá jogar com um Robô de cada vez (O nome do Robô da vez é indicado no canto direito superior da tela) e quando chegar ao último começará uma nova rodada. 

Cada Robô tem apena 2 ações: Avançar e Retroceder. A direção para onde o Robô e o quanto se move varia de Robô para Robô.

|Robô|Avançar|Retroceder|
|-----|-----|--------|
|Andador | Quantas células quiser para frente| Quantas células quiser para trás|
|Peão |Apenas uma célula para a direita| Apenas uma célula para a esquerda|
|Torre| Até duas células para a direita | Até duas células para a esquerda|
|Bispo| Até duas células adiante na diagonal| Até duas células para trás na diagonal|
|Cavalo | Até duas células adiante na antidiagonal| Até duas células para trás na antidiagonal|
|Rei | Até quatro células adiante na diagonal| Até quatro células para trás na diagonal|
|Rainha | Até quatro células adiante na antidiagonal| Até quatro células para trás na antidiagonal|

Para dar um comando para o Robô se descolar você deve seguir a seguinte sintaxe `(ação):(n° de células)` 

|Ação|
|-----|
|1: Avançar|
|2: Retroceder|

Eg. `2:1` faz o Robô retroceder 1  célula.

O jogo acaba quando o Jogador sai ou todos os alunos são resgatados ~~boa sorte com a última possibilidade :)~~

## Estrutura
Eis aqui minha tentativa de explicar o monstro que criei :)

