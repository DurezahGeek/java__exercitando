# Controle de Smart TV

Este repositório contém duas classes Java que implementam um controle de Smart TV simples. As classes são as seguintes:

## `SmartTv.java`

Esta classe representa uma Smart TV e possui os seguintes atributos e métodos:

- `boolean ligada`: Indica se a TV está ligada ou desligada.
- `int canal`: Armazena o número do canal atual.
- `int volume`: Armazena o nível de volume atual.

Métodos:

- `mudarCanal(int novoCanal)`: Muda o canal para o valor especificado.
- `aumentarCanal()`: Aumenta o canal atual em 1.
- `diminuirCanal()`: Diminui o canal atual em 1.
- `aumentarVolume()`: Aumenta o volume atual em 1.
- `diminuirVolume()`: Diminui o volume atual em 1.
- `ligar()`: Liga a TV, definindo o estado 'ligada' como verdadeiro.
- `desligar()`: Desliga a TV, definindo o estado 'ligada' como falso.

## `Usuario.java`

Esta classe contém o método `main` que cria uma instância de `SmartTv` e demonstra o uso dos métodos e atributos da classe `SmartTv` simulando algumas ações, como mudar de canal, ajustar o volume e ligar/desligar a TV.

## Como executar

Para executar o código de exemplo, basta compilar e rodar a classe `Usuario.java`. Certifique-se de que ambas as classes estejam no mesmo diretório.

```bash
javac Usuario.java
java Usuario

