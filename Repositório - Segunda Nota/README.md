# Padrão ITERATOR

# Centro Universitário UNIESP

 Professora: Drª Alana Morais (alanamm.prof@gmail.com)

 Aluno: José Carlos Ribeiro Soares Junior

# iterator
  Este padrão se traduzido para o português, signifca iterador, algo que itera que repete.
  O iterator tem como proposito segubndo o Padrões de Projeto - Soluções Reutilizaveis de Software Orientado a Objetos ( GOF ) - " Fornecer uma maneira de acessar os elementos de   um objeto sequencialmente, sem expor sua represnetação."
  
  Ou seja, este padrão iterage item por item de uma determinada coleção fazendo uma busca sem expor a representação do elemento, acessar a conteudos de um agregado como linkedlist, arraylist, vetores e etc...
  Aplicabilidade:
        Acessar o conteudo de um agregado sem expor a sua represnetação interna.
        Suportar multiplas varreduras em objetos agregados.
    
# Problema
  Desvantagens
    A interface pode nao Fornecer todas as opeçaões desejadas. o Acesso indireto pode reduzir a performance.

# Solução 
  Vantagens.
    interface simplificada com acesso uniforme para todos os tipos de coleções.
    é possivel ter mais de um acesso a coleção em pontos diferentes
    Multiplas formas de interação, basta implementar um novo interador.
  

# Consequências
A mera substituição de um iterador permite caminhar numa coleção de várias formas
Juntar a interface de caminhamento num iterador permite retirar esta interface da coleção, simplificando assim a interface desta coleção
Várias iterações podem estar ocorrendo ao mesmo tempo, já que o estado de uma iteração é mantido no iterador e não na coleção
