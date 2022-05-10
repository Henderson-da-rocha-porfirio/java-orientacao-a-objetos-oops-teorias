# Orientação a Objetos - OOPS
````
OOPS é uma abreviação para Object Oriented Programming
System onde os programas são considerados uma coleção de
objetos. Cada objeto é uma instancia de uma classe.
````
#### _______________________________________________
## * Principais Conceitos *
### 1. ABSTRAÇÃO ( ABSTRACTION )
````
É o processo de representar somente os dados relevantes ou essenciais e esconder o desnecessário e detalhes de background
ou representar funções padrões que devem ser implementadas por classes que precisem usá-las.
````
### 2. ENCAPSULAMENTO ( ENCAPSULATION )
````
É uma maneira de proteger os dados para que somente as próprias classes possam manipulá-los.
````
### 3. HERANÇA ( INHERITANCE )
````
É o conceito onde uma classe pode compartilhar sua estrutura e comportamentos com outras classes.
````
### 4. POLIMORFISMO ( POLYMORPHISM )
````
É a capacidade que um método possui de ter o mesmo nome, porém tendo múltiplas formas ou funções.
````
### 5. ASSOCIAÇÃO ( ASSOCIATION )
````
É o que define o relacionamento entre os objetos, e ela que representa a multiplicidade entre eles.
````
### 6. AGREGAÇÃO ( AGREGATION )
````
É o tipo especial de relacionamento que determina que um objeto é composto pelas informações contidas em outro objeto
de outra classe.
````
### 7. COMPOSIÇÃO ( COMPOSITION )
````
É um tipo de relacionamento que, diferente da agregação, o objeto (parte) depende totalmente do outro, ou seja,
não existe sem o outro.
````
### 8. ACOPLAMENTO ( COUPLING )
````
É um tipo de relacionamento em que uma determinada classe depende de outra pra existir. Deve ser evitado sempre que
possível.
````
### 6. COESÃO ( COHESION )
````
Está ligado com o princípio de responsabilidade única, onde uma classe não deve assumir responsabilidades que não
são suas.
````
#### _______________________________________________
## * Suas Relações *

|  ABSTRAÇÃO ( ABSTRACTION )   |  ENCAPSULAMENTO ( ENCAPSULATION ) | HERANÇA ( INHERITANCE ) |
|   :---     |   :---     |   :---     |
| Dados e Funcoes | Dados | Classes |

|  POLIMORFISMO ( POLYMORPHISM )   |  ASSOCIAÇÃO ( ASSOCIATION ) | AGREGAÇÃO ( AGREGATION ) |
|   :---     |   :---     |   :---     |
| Metodos e Funções | Objetos | Objetos |

|  COMPOSIÇÃO ( COMPOSITION )   |  ACOPLAMENTO ( COUPLING ) | COESÃO ( COHESION ) |
|   :---     |   :---     |   :---     |
| Objetos | Classes | Classes |

#### _______________________________________________
## * Classes Versus Objetos *
#### Classes:
````
Uma classe serve para representar um objeto com todos os atributos relacionados à ele. Ex: Uma forma de bolo redonda.
````
#### Objetos:
````
É uma instância, ou seja uma representação da classe com sua identidade. Ex: O bolo redondo já pronto.
````
#### _______________________________________________
## * Métodos *
````
a. Um método é equivalente a uma função, e sempre deve ser definidos dentro de uma classe.
b. Em Java, um método é um bloco de código que é definido dentro de "{ }". Em sua assinatura é especificado
o seu tipo de retorno ou sem retorno (tipo void), ele pode ou não receber parâmetros, que ficam dentro de "( )".
````
#### _______________________________________________
## * Funções *
````
Uma Função é equivalente a um método, e sempre deve ser definidos dentro de uma classe.
````
#### _______________________________________________
## * Parâmetros *
````
São informações enviadas ao método e/ou função, para que ele realize seu objetivo.
````
#### _______________________________________________
## * Atributos & Construtores *
#### Atributos:
````
São as propriedades de um objeto. Os atributos são definidos no início da classe.
````
#### Construtores:
````
É um método especial que inicializa o objeto e é invocado na hora da sua criação. Sempre o construtor deve ter o mesmo
da classe e não pode ter tipo de retorno (return).
````
#### _______________________________________________
## * Modificadores de Acesso: private, default, protected e public *
````
São padrões de visibilidade de acessos às classes, atributos e métodos. É através deles que definimos o que poderá ser
acessado por outros, e o que será restrito à própria classe.
````
#### _______________________________________________
## * Pacotes *
````
É o local em que as classes estão localizadas e organizadas dentro do repositório. Usualmente, são colocadas em um
mesmo pacote de classes relacionadas, ou seja, construídas com um propósito comum para promover
a reutilização de código.
````

