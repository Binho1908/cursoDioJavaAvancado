# Desenvovimento avançado em java

## Paradigma Funcional java

### O que é Paradigma funcional

- Paradigma funcional no Java: Programação funcional é o processo de construit software através de composição de funcções puras, evitando compartilhamento de estados, dados mutáveis e efeitos colaterais. É declarativa ao ainvés de imperáriva, essa é uma definição de Eric Elliott.

- Paradigma imperativo: É aquele que expressa o código através de comandos ao computador, nele é possível ter controle de estado dos objetos

- Paradigma Funcional: Damos uma regra, uma declaração de como queremos que o programa se comporte.

### Funções e imutabilidade em Paradgma Funcional

- Conceitos fundamentais da progamação funcional.
-- Composição de funções: é criar uma nova função através da composição de outras. Por exemplo, vamos criar uma função que vai filtrar um array, filtrando somente os números pares e multiplicando por dois: 

-- Um conceito do paradigma funcional e a função pura: é chamada de pura quando invoca mais de uma vez, produz exatamente o mesmo resultado.

-- Outro conceito é a imutabilidade: significa que uma vez que uma variável que recebeu um valor, vai possuir esse valor para sempre, ou quando criamos um objeto ele não pode ser modificado. Ex: um objeto que foi criado não pode ser modificado.

- imperarivo vs declarativo
--É muito comum aprender a programar de forma imperativa, onde mandamos alguém fazer algo, Busque o usuário 15 no banco de dados. Valide essas informações do usuários.

-- Na programação funcional tentamos programar de forma declarativa, onde declaramos o que desejamos, sem explicitar como será feito. Qual o usuário 15? Quais os erros dessas informações?

Exercícios aula 

1. É aquele que expressa o código através de comandos ao computador, nele é possível ter controle de estado dos objetos, de acordo com a afirmação. Qual a alternativa representa esse paradigma.

a - ( ) Declarativo
b - ( ) Imutabilidade
c - ( ) Funcional
d - ( ) Recursividade
e - ( ) Imperativo

Resposta: Imperativo

2. Damos uma regra, uma declaração de como queremos que o programa se comporte, de acordo com a afirmação. Qual alternativa representa esse paradigma. 

a - ( ) Composição de funções.
b - ( ) Imutabilidade
c - ( ) Funcional
d - ( ) Recursividade
e - ( ) Imperativo

Resposta: Funcional

3. Uma vez que uma variável que recebe um valor, esta vai possuir esse valor para sempre, ou quando criamos um objeto ele não pode ser modificado, de acordo com a afirmação. Qual alternativa representa esse paradigma. 

a - ( ) Composição de funções.
b - ( ) Imutabilidade
c - ( ) Funcional
d - ( ) Recursividade
e - ( ) Imperativo

Resposta: Imutabilidade


### Lambda no java

-- Os lambdas obedecem o conceito do paradigma funcional, com eles podemos facilitar legibilidade do nosso código, além disso com a nova API Funcional do Java podemos ter uma alta produtividade para lidar com objetos.
Primeiramente, devemos entender o que são interfaces funcionais. 
Interfaces funcionais - São interfaces que possuem apenas um método abstrato. Exemplo:
public interface Funcai {
    String gerar (String valor);
}
Geralmente as interfaces funcionais possuem uma anotação em nível de classe ( @FunctionalInterface), para forçar o compilador a apontar um erro se a interface não estiver de acordo com as regras de uma interface funcional. Esta anotação não é obrigatória., pois o compilador consiste reconhecer uma interface em tempo de compilação.
Antes do Java 8, se quisésemos implementar um comportamento específico para uma única classe deveríamos utilizar uma classe anônima para implementar este comportamento.
Agora que sabemos como se define uma interface funcional podemos, aprender como se define uma lambda.
Estrutura de uma lambda:

InterfaceFuncional nomeVariavel = paramentro -> logica

Para entender melhor utilizaremos o exemplo da Função.

Bastante atenção!!!

-Quando uma lambda possui apenas uma instrução no corpo de sua lógica não é necessário o uso de chaves.
Exemplo: 
Funcao colocarPrefixoSenhorNaString = valor -> "Sr. "+valor;  

e se a função possui mais de uma instrução DEVEMOS ultilizar chaves e açém disso deve explicitar o retorno se o retorno for diferente de void. Exemplo: 

Funcao colocarPrefixoSenhorNaString = valor -> {
    String valorComprefixo = "Sr. "+valor;
    String valoComprefixoEpontoFinal = valorComprefixo+".";
    Return valoComPrefixoEPontoFinal;
}


Exercícios aula 

4. Qual é a sintaxe base de uma lambda? 

a - ( ) Tipo nomeVariavel = parametro -> logica
b - ( ) Tipo nomeVariavel = valor
c - ( ) TipoAbstrato nomeVariavel = valor
d - ( ) InterfaceFuncional nomeVariavel = parametro -> logica
e - ( ) TipoEnum nomeVariavel = parametro ->

Resposta: D

5. Quando devemos ultilizar chavas em um lambda?  

a - ( ) Quando o mesmo possui apenas uma instrução
b - ( ) Quando ultilizamos a referencia do método
c - ( ) Quando ultilizamos a intergace Runnable
d - ( ) Quando o mesmo possui mais de uma instrução
e - ( ) Quando o mesmo não possui nenhuma instrução 

Resposta: D

6. Qual das altenativas a seguir e uma declaração de um lambda?  

a - ( ) Funcao a = "2";
b - ( ) Funcao a => "2";
c - ( ) Funcao a = a => "2";
d - ( ) Funcao a -> "2";
e - ( ) Funcao a = valor -> "2";

Resposta: E

7. Antes do Java 8, qual era a estratégia ultilizada para implementação de interface em uma classe especifica.  

a - ( ) Classe Anônima;
b - ( ) Declaração de uma outra interface;
c - ( ) Enum;
d - ( ) Classe abstrata;
e - ( ) Encapsulamento;

Resposta: A
---------------------------------------------------------------------------------------------------------------



## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
