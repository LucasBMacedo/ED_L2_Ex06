📁 Projeto: Inversão de Vetor (Recursivo)

📌 Descrição: >
  Aplicação em Java que inverte os valores de um vetor utilizando recursividade.
  A inversão é feita trocando o primeiro elemento com o último, o segundo com o penúltimo, e assim por diante.

🗂️ Estrutura de Arquivos:

  📄 src/controller/VetInvertido.java:
    - Contém o método recursivo responsável por inverter os valores do vetor trocando as posições.

  📄 src/view/Principal.java:
    - Responsável pela interação com o usuário, validação da entrada e exibição do vetor invertido.

🧠 Lógica da Recursividade:
  método: inverteVetor(int[] vet, int i)
  explicação:
    - ✋ Condição de parada: Quando o índice `i` atingir a metade do vetor (`i >= vetor.length / 2`), as trocas terminam.
    - 🔁 Relação recursiva: 
        - Troca o elemento da posição `i` com o elemento da posição `vetor.length - 1 - i`.
        - Chama a função novamente incrementando `i + 1`, avançando para o próximo par de elementos.

💬 Exemplo de Execução:

  entrada:
    - Tamanho: 5
    - Valores: [1, 2, 3, 4, 5]
  
  saída:
    - Vetor invertido: [5, 4, 3, 2, 1]

📥 Entrada:

- O usuário insere o tamanho do vetor e depois os valores em cada posição através de caixas de diálogo (JOptionPane).

📤 Saída:

- O vetor invertido é exibido no console (`System.out.println`) elemento por elemento.

📌 Observações:

- A inversão é feita **in-place**: o mesmo vetor é utilizado, sem criar um novo vetor auxiliar.
- A entrada é validada para garantir que o vetor seja preenchido corretamente.
- Estrutura modular, organizada e reutilizável, permitindo fácil manutenção e expansão do código.

👨‍💻 Autor: Criado por Lucas Bezerra de Macedo.
