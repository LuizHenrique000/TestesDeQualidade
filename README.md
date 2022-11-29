# TestesDeQualidade

## Explicando o exercício

Na atividade em questão tinhamos dois casos de testes com seus respectivos testes

### Caso de Teste 1 - Validar a Mensagem de um produto que não existe

1. Digitar o nome do produto
2. Clicar em pesquisar
3. Validar a mensagem de retorno + nome do produto que você pesquisou

### Caso de Teste 2 – Localizar loja

1. Acessar a página 
2. Validar quantas lojas tem perto de você 
3. Pesquisar por Martello Hotel e conferir se a mensagem de retorno é igual a esperada 
4. Pesquisar Por Sapopema conferir se a mensagem de retorno é igual a esperada

# Breve explicação

No exercicio eu criei 3 pastas:

**pages:**

Onde cada classe representa uma página com seus respectivos métodos

**americanasTests:**

Onde possui apenas os testes que dizem respeito ao site da Americanas

 **magazineLuizaTests**

Possuindo somente os testes do site da Magazine Luiza

# Explicando cada teste

### Magazine Luiza

**1. DigitarTest**

O primeiro teste tem como objetivo abrir o site da Magalu, clicar no input de pesquisa e apenas digitar um texto pré definido

**2. PesquisarTest**

O segundo teste tem um objetivo semelhante do primeiro teste, com a diferença de que após digitar o texto, ele irá realizar a busca.

**3. CapturaMensagemDeErroTest**

O segundo teste tem como objetivo realizar a pesquisa no site e capturar sua mensagem de erro

## Americanas

**1. AcessarPaginaTest**

O primeiro teste tem como objetivo apenas acessar a página.

**2. ValidarLojasPerto**

O segundo texto possui como objetivo realizar digitar um cep e visualizar quantas lojas estão disponíveis perto do mesmo.

**3. PesquisarPorMarteloTest**

O terceiro teste tem como objetivo digitar como localidade Martello Hotel e visualizar quantas lojas estão disponíveis perto do mesmo.

**4. PesquisarPorSapopemaTest**

O quarto e último teste tem como objetivo pesquisar como localidade Sapopema e ter como resposta nenhuma loja perto da localidade.

## Notas finais

**Os testes estão desacoplados seguindo as boas práticas então não seguir a ordem de execução não causará nenhum erro**

Link para assistir ao video dos testes rodando:

<https://drive.google.com/file/d/1o7Gey7nMijLcToIsFaD-JOqkHfmGOj7B/view?usp=share_link>
