# Estudo sobre estruturas de dados

## Lista ligada ou Lista encadeada (Linked List)
- Fornece uma estrutura dinâmica, crescendo e diminuindo de acordo com a necessidade exigida. Isto faz com que a utilização de memória do software seja muito eficaz, podendo se adaptar ao que for de fato necessário sem ocorrer um desperdício. Também é utilizada na construção de outras estruturas, como as estruturas de Pilhas e as Filas.
- O acesso aos valores é somente feito de forma sequencial, só sendo possivel realizar uma leitura da esquerda para a direita (começando pelo header e indo até o elemento desejado). Isto agrega uma certa complexidade de implementação

## Lista de pilhagem (Stack)
- Pilha é uma estrutura de dados ordenada que o último elemento inserido será o primeiro a ser retirado (O último elemento adicionado será sempre o primeiro). É eficiente na resolução de problemas que exigem a característica LIFO (Last in first out). Também podemos inferir que criar uma lista de pilhagem é algo simples, não possuindo muitas dificuldades na escrita do seu código.
- Uma analogia seria o histórico de seu navegador, onde o último acesso feito aparece no topo da lista.

## Lista de fila (Queue)
- Esta estrutura de dados ordenada é eficiente em problemas com características de FIFO (First in first out), onde o primeiro elemento inserido será o primeiro a ser retirado (O ultimo elemento será sempre o último a ser adicionado). A fila possui duas extermidades: uma por onde é feita a inserção de elementos (o fim da fila) e outra por onde é feita a remoção de elementos (início da fila).
- A analogia para a lista de fila é a fila de atendimento bancário, onde o primeiro cliente será o primeiro a ser atendido, e o 3,4,5.. clientes deverão esperar o atendimento em ordem.

## Árvore binária (Binary Tree)
É uma estrutura de dados composta por nós, cada um com um valor armazenado e dois ponteiros: um para o "filho da esquerda" e outro para o "filho da direita". Ou seja, cada nó pode ter no máximo dois filhos. É uma estrutura versátil que serve de forma eficiente para diversas aplicações que necessitam de uma grande organização, controle, crescimento e interconexão.

- Nó Pai: É o nó que deu origem a outro nó. Por exemplo, um nó A (raiz) é pai dos nós B e C.
- Nó Filho: É o nó que foi gerado por outro nó. No exemplo acima, os nós B e C são filhos da raiz A.
- Nó Folha: É o nó que não possui filhos, representam o final da árvore.
