# Desafios de Programação - 2023:

Este repositório será composto por três desafios de programação proprostos através de uma plataforma de conteúdos voltados para 
diversos áreas de técnologia como **Linguagens de Programação**. 

## 1º - Desafio - Usando Dicionário Python:

Faça um programa em **Python** que receba um número N indicando quantas disciplinas serão informadas. Em seguida, N triosde nome, 
nota e peso serão informados(**nota** será um número em ponto flutuante e **peso** será um número inteiro positivo). Seu 
programa deverá construir um ou mais dicionários e usá-los para resolver o problema. Em seguida, calcularemos alguns valores 
relativos a essas notas. Esses calculos devem ser feitos cada um em uma **Função** separada e retornado para o programa 
principal, que por sua vez exibirá o resultado na tela. Quais parâmetros as suas Funções receberão fica a seu critério, desde
que faça sentido para a solução. As Funções não devem exibir o resultado na tela, elas devem retornar o resultado para o 
programa principal.

O que queremos exibir:

- Nome da disciplina de menor nota e a menor nota (com uma casa decimal);
- Nome da disciplina de maior nota e a maior nota (com uma casa decimal);
- Média ponderada das notas considerando os pesos arredondando para três casas decimais.

Exemplo:

*4*  
*Matemática 9.9 2*  
*Física 10 2*  
*Português 8 1*  
*Geografia 7 1*  

Como requisito o seu programa deverá usar dois ou mais dicionários.

Resultado a ser exibido:

*Menor: Geografia 7.0*  
*Maior: Física 10.0*  
*Média: 9.13*  

## 2º - Desafio - Cifra de César usando Java:

A Cifra de César é uma forma rudimentar de criptografia que desloca as letras do alfabeto oa codificar um mensagem. Esse
deslocamento entre as letras pode variar. Por exemplo, se o deslocamento for três, letra **A** é codificada como **D**, 
**B** se torna **E** e assim sucessivamente. Ao final do alfabeto, o ciclo fecha e volta para o início, **X** se torna
**A**, **Y** se torna **B** e **Z** se torna **C**.
Uam mensagem foi incriptada  e sabe-se que esta na Cifra de César. Mas não sabemos qual o deslocamento utilizado.
Felizmente o espião conseguiu obter **UMA** palavra da mensagem original. Faça um programa em **Java** que receba essa 
palavra e a mensagem original inteira. Considere que o texto não conteráacentos, somente letras **A-Z** e **a-z**, mas
poderá conter espaços e pontuação. Os espaços e pontuação não serão codificados, deverão ser mantidos. Seu programa deverá
conter pelo menos um **Método** chamado *decriptar*, recebendo a mensagem encriptada e um valo r para o deslocamento e 
retornando uma **String** com a mensagem decriptada.
Também deverá possuir um **Método** *quebrarCodigo* com dois parâmetros, a mensagem encriptada e a palavra conhecida. Esse
método deverá utilizar outro para conseguir quebrar o código e retornar a mensagem clara. Utilize uma hierarquia de **Classes**
que faça sentido para este problema.

## 3º Desafio - Site de Produtos (API):

O objetivo é construir um sistema que acesse uma determinada **API** que trará uma lista de produtos e exibir esses produtos.
Usaremos uma API de terceiros, a Makeup API, disponível em https://makeupapi.herokuapp.com/

### Back-end:

Construa uma **API intermediária** que acessará a **Makeup API**.   
Considere que a Makeup API poderá ter instabilidade e faça algo para que sua API continue disponível e respondendo, criando um 
mecanismo de cache, banco de dados ou o que achar necessário.

### Front-end:

Construir uma **Página** que irá listar os produtos da API mencionada.  
A página deverá mostrar a **marca**, **nome**, **imagem** e **preço dos produtos**.  
Lembre-se que a quantidade de produtos pode ser muito grande, utilize alguma forma de paginação.  
Sinta-se livre para criar seu próprio design.

### Sobre a API:

A Makeup **API** usa **REST** sobre **HTTP**. Só há um endpoint: https://makeupapi.herokuapp.com/api/v1/products.json que responde listando 
produtos de beleza. O método da chamada é **GET** e o retorno é **JSON**, formato de dados bem comum na indústria.
Para filtrar dados, use query string. Por exemplo, para filtrar por marca, use o parâmetro brand. Para filtrar por produto, use product_type. 
Parâmetros podem ser combinados como em qualquer query string. Colocando de forma mais prática, para filtrar todos os produtos da Maybelline, 
acesse https://makeupapi.herokuapp.com/api/v1/products.json?brand=maybelline. Para filtrar os batons da mesma marca, combine os dois 
parâmetros: https://makeupapi.herokuapp.com/api/v1/products.json?brand=maybelline&product_type=lipstick  
A página https://makeup-api.herokuapp.com/ possui uma listagem de todos os parâmetros possíveis, além de mais informações sobre a **API**.

***

![GitHub repo size](https://img.shields.io/github/repo-size/Paulo-RJR/desafios-2023)
![GitHub](https://img.shields.io/github/license/Paulo-RJR/desafios-2023)
![GitHub language count](https://img.shields.io/github/languages/count/Paulo-RJR/desafios-2023)
![GitHub top language](https://img.shields.io/github/languages/top/Paulo-RJR/desafios-2023)

***

## Principais Tecnologia usadas:


<img align="center" alt="Paulo-HTML5" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg"> - HTML5;  
<img align="center" alt="Paulo-CSS3" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-plain.svg"> - CSS3;  
<img align="center" alt="Paulo-Javascript" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg"> - Java Script;  
<img align="center" alt="Paulo-Java" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg"> - Java;  
<img align="center" alt="Paulo-Python" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/python/python-original.svg"> - Python;  
<img align="center" alt="Paulo-VSCode" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg"> - VS Code;  
<img align="center" alt="Paulo-Git" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/git/git-plain.svg"> - Git Bash;  
<img align="center" alt="Paulo-Devicon" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/devicon/devicon-original.svg"> - Devicon;  
<img align="center" alt="Paulo-Markdown" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/markdown/markdown-original.svg"> - Markdown.  
