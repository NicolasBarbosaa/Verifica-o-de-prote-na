<h1> Verificação de Proteína </h1>
<h3>
  Este é um código Java que verifica se uma sequência de DNA é uma proteína válida. O código realiza a análise de um DNA específico e imprime uma mensagem indicando se é uma proteína ou não.

Principais recursos do código:

 • O código recebe três sequências de DNA, armazenadas nas variáveis dna1, dna2 e dna3. A variável dna é inicializada com o valor de dna1.
 <hr>
 • O código busca a ocorrência da sequência "ATG" no DNA usando o método indexOf.
  <hr>
 • Em seguida, obtém os três últimos caracteres do DNA usando o método substring.
  <hr>
 • Se os três últimos caracteres forem "TGA", o valor de TGA é definido como a posição da ocorrência de "TGA" no DNA.
  <hr>
 • Caso contrário, o valor de TGA é definido como 1, indicando que a sequência "TGA" não foi encontrada.
  <hr>
 • O código verifica se o comprimento do DNA é divisível por 3 e se a ocorrência de "ATG" é válida (índice maior ou igual a zero) e se a ocorrência de "TGA" está no terceiro caractere a partir do final do DNA.
  <hr>
 • Com base nessas condições, é impressa uma mensagem indicando se o DNA é uma proteína ou não.

<h4>Este código pode ser utilizado como base para a implementação de um verificador mais complexo de sequências de DNA, adicionando novas regras e funcionalidades para análise de proteínas.</h4>
</h3>
