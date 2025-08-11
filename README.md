Sudoku em Java (Terminal)
Este é um jogo de Sudoku desenvolvido em Java, totalmente jogável pelo terminal. O objetivo foi praticar conceitos de Programação Orientada a Objetos, manipulação de estruturas de dados, além de trabalhar com entrada e saída de dados no console.

🎯 Objetivo do Projeto
Criar um jogo interativo e funcional de Sudoku.

Consolidar conhecimentos em Java, POO e lógica de programação.

Implementar funcionalidades essenciais como exibição do tabuleiro, inserção de valores, validação de jogadas e detecção de vitória.

🛠 Tecnologias Utilizadas
Java (JDK 17 ou superior recomendado)

Programação Orientada a Objetos

Estruturas de dados (arrays bidimensionais)

Entrada e saída com Scanner

📌 Funcionalidades
Exibição do tabuleiro formatado no terminal.

Inserção de valores escolhendo linha, coluna e número.

Validação de jogadas seguindo as regras do Sudoku:

Não repetir números na mesma linha.

Não repetir números na mesma coluna.

Não repetir números no mesmo bloco 3x3.

Detecção de conclusão do jogo.

Opção para encerrar a qualquer momento.

▶️ Como Executar
Certifique-se de ter o Java instalado:

bash
Copiar
Editar
java -version
Compile os arquivos:

bash
Copiar
Editar
javac src/*.java
Execute o jogo:

bash
Copiar
Editar
java -cp src Main
🎮 Como Jogar
Ao iniciar, o tabuleiro será exibido com alguns números preenchidos.

Digite a linha e a coluna (0 a 8) onde deseja inserir o número.

Digite o valor (1 a 9) para a posição escolhida.

O jogo valida automaticamente a jogada.

Digite -1 na escolha da linha para sair do jogo.
