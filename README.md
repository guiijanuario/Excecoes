# Exercícios de Poo com conceitos de SOLID e aplicação de Exceções

---

## 1️⃣ Exercício 1 

<p>Faça um programa de controle de lista de compras de acordo com
as seguintes especificações:
</p>

A. O programa deve ter um menu que peça para a pessoa usuária
definir qual o tipo de alimento ela quer incluir na lista.

B. A pessoa usuária só pode incluir alimentos do tipo: VERDURA,
LEGUMES, GRÃOS e OUTROS.

- i. Caso a pessoa tente incluir outro tipo de alimento, o
programa deve estourar uma exception do tipo
IllegalArgumentException com a mensagem “Tipo de
alimento inválido”.

C. Se a pessoa escolher alimento do tipo VERDURA ou GRÃOS,
ela deve informar a quantidade em gramas, dessa forma, a
quantidade deve ser do tipo double.

- i. Caso a quantidade que a pessoa informar para
VERDURA for do tipo inteiro, o programa deve estourar
uma exception do tipo NumberFormatException com
a mensagem “Para verdura, a quantidade deve ser
informada com ponto”.
- ii. Caso a quantidade que a pessoa informar para GRÃOS
for do tipo inteiro, o programa deve estourar uma
exception do tipo NumberFormatException com a
mensagem “Para grãos, a quantidade deve ser
informada com ponto”.

D. Se a pessoa escolher alimento do tipo LEGUME ou OUTROS,
ela deve informar a quantidade em unidades, dessa forma, a
quantidade deve ser do tipo inteiro.

- i. Caso a quantidade que a pessoa informar para LEGUME
for do tipo double, o programa deve estourar uma exception do tipo NumberFormatException com a
mensagem “Para legume, a quantidade deve ser
informada em unidades inteiras”.
- ii. Caso a quantidade que a pessoa informar para OUTROS
for do tipo double, o programa deve estourar uma
exception do tipo NumberFormatException com a
mensagem “Para outros, a quantidade deve ser
informada em unidades inteiras”.


E. Para qualquer tipo de alimento, se a pessoa tentar inserir uma
quantidade vazia, ou seja, “” [abre e fecha aspas duplas sem
nada dentro], o programa deve estourar uma exception do tipo
UnsupportedOperationException com a mensagem “Não é
permitido inserir valor vazio”.

F. Para qualquer tipo de alimento, se a pessoa tentar inserir uma
quantidade menor que zero, o sistema deve informar a pessoa
usuária que não é possível inserir número negativos e pedir
novamente a quantidade que precisa comprar do alimento.

G. Após inserir a quantidade, o sistema deve pedir para a pessoa
usuária o nome do alimento que será comprado.

- i. Se a pessoa tentar inserir um nome vazio, ou seja, “” [abre
e fecha aspas duplas sem nada dentro], o programa deve
estourar uma exception do tipo
UnsupportedOperationException com a mensagem
“Não é permitido inserir nome vazio”.

H. O programa deve permitir a pessoa usuária inserir quantos
alimentos quiser até que decida encerrar o processo.

- i. Quando a pessoa decidir encerrar o processo, o sistema
deve retornar a lista de compras com as informações de
cada item a ser comprado de cada tipo.
Exemplo: nomeAlimento - quantidadeAlimento

- ii. E, após mostrar em tela todos os alimentos a serem compradas, deve informar a quantidade de cada tipo de
  alimento a ser comprado.


### Exemplo de saída esperada:

```
Legumes:
[alface - 10.0 kg, catalonia - 10.0 kg, espinafre - 10.0
kg]
A quantidade de alimentos do tipo verdura a ser comprada
é: 3
```

### 🗂️ Para acessar o exercício 1: [clique aqui](https://github.com/guiijanuario/Excecoes/tree/main/src/main/java/org/example/Exercicio1)

---

## 2️⃣ Exercício 2

<p>  Elaborar um programa de conversão de moeda de acordo com as
seguintes especificações (sempre usando OOP):
</p>

A. O programa deve ter apresentar para a pessoa usuária “Boas
vindas ao conversor de moedas”

B. O programa deve perguntar qual a moeda que a pessoa quer
converter, sendo que o programa só pode aceitar as seguintes
opções de moeda:
- i. Dólar americano
- ii. Dólar canadense
- iii. Euro
- iv. Libra Esterlina

C. Caso a pessoa digite qualquer outra moeda fora das
mencionadas acima, o programa deve estourar uma exception
do tipo IllegalArgumentException com a mensagem “Tipo de
moeda inválido”.

D. Após escolher qual o tipo de moeda a ser convertida, o
programa deve informar a pessoa usuária que ele só sabe
converter dinheiro para Real (R$).

E. Após informar o tipo de moeda válida a ser convertida, o
sistema deve pedir o valor a ser convertido no formato BigDecimal.

- i. Caso a pessoa digite qualquer texto ou valor vazio, o
programa deve estourar uma exception do tipo
NumberFormatException com a mensagem “Para
moeda, o valor monetário deve ser um número decimal”.
- ii. Caso a pessoa digite um valor menor ou igual a zero, o
programa deve mostrar a seguinte mensagem para a
pessoa: “Valor inválido, por favor, tente novamente” E
permitir que a pessoa insira o valor a ser convertido de
novo.

F. Após as entradas, o sistema deve fazer a devida conversão da
moeda escolhida para Real (R$) de acordo com a cotação do
dia. Você pode pegar o valor do dia

G. Após a conversão o sistema deve mostrar a mensagem: “A
[MOEDA] na cotação de hoje [DIA ATUAL] está em [VALOR DA
COTAÇÃO], o valor que pediu para converter de [VALOR
INSERIDO] em reais é R$[VALOR CONVERTIDO]”.

H. Por fim, o programa deve perguntar se a pessoa deseja fazer
outra conversão.
- i. Se sim, o programa reinicia.
- ii. Se não, o programa encerra.

### Valores a serem utilizados

```
COTACAO_DOLAR_AMERICANO - 5.25
COTACAO_DOLAR_CANADENSE - 4.15
COTACAO_EURO - 6.15
COTACAO_LIBRA_ESTERLINA - 7.50
```

### 🗂️ Para acessar o exercício 2: [clique aqui](https://github.com/guiijanuario/Excecoes/tree/main/src/main/java/org/example/Exercicio2)

## 🗂️ Exercícios Exceções

1. [Exercicio1](https://github.com/guiijanuario/Excecoes/tree/main/src/main/java/org/example/Exercicio1) → Exercicio 1
2. [Exercicio2](https://github.com/guiijanuario/Excecoes/tree/main/src/main/java/org/example/Exercicio2) → Pacote referente ao ex02

---

## ⏯️ Como executar os Programas

- Você precisará ter o [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11) instalado no seu computador;
- Baixe o repositório do projeto (com todos os algoritmos);
- Abra o terminal e navegue até o o arquivo main presente na pasta de exercicio que você deseja executar;
- Compile o arquivo executando o comando `javac`, como mostra abaixo o exemplo executando o [Main](https://github.com/joaocruzzup/Exercicio-Exceptions/blob/main/src/main/java/org/example/exercicio01/Main.java) :
```
javac Main.java
```
- Após compilar, execute o comando `java`, como mostra abaixo:
```
java Main.java
```

---

## 👨‍💻 Autor

Nome: Guilherme Januário <br>Linkedin: https://www.linkedin.com/in/guilherme-janu%C3%A1rio/

---

<h4 align=center>Made with 💚 by <a href="https://github.com/guiijanuario">Guilherme Januário</a></h4>