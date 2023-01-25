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
### 3. HERANÇA - Definida por 'extends' pela SubClasse ( INHERITANCE )
````
É o conceito onde uma classe pode compartilhar sua estrutura e comportamentos com outras classes:
1. SuperClasse: Classe mãe.
2. SubClasse: Classe filha.
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
## * Métodos { }*
````
a. Um método é equivalente a uma função, e sempre deve ser definidos dentro de uma classe.
b. Em Java, um método é um bloco de código que é definido dentro de "{ }". Em sua assinatura é especificado
o seu tipo de retorno ou sem retorno (tipo void), ele pode ou não receber parâmetros, que ficam dentro de "( )".
````
#### _______________________________________________
## * Funções { } *
````
Uma Função é equivalente a um método, e sempre deve ser definidos dentro de uma classe.
````
#### _______________________________________________
## * Parâmetros ( ) *
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
## * Overload Versus Override *
#### Overload - não tem anotação ( Sobrecarga ):
````
A sobrecarga consiste em permitir, dentro da mesma classe, mais de um método com o mesmo nome. Entretanto,
obrigatoriamente eles devem possuir parâmetros diferentes para funcionar.
````
#### Override - anotação: @Override ( Sobrescrita ):
````
A sobrescrita altera o comportamento de um método da classe mãe dentro da classe filha, eles possuem
a mesma assinatura e tipo de retorno.
````
#### _______________________________________________
## * Pacotes *
````
É o local em que as classes estão localizadas e organizadas dentro do repositório. Usualmente, são colocadas em um
mesmo pacote de classes relacionadas, ou seja, construídas com um propósito comum para promover
a reutilização de código.
````
#### _______________________________________________
## * Interfaces *
````
É um componente com o objetivo de especificar funções para padronização. As classes que estabelecem contrato, ou seja
implementam a interface, devem, obrigatoriamente implementar os métodos contidos nela interface.
````
### - Na API do Java 8, foi adicionado um novo recurso que possibilita adicionar métodos em interfaces implementando-os ali mesmo, os DefaultMethods.
### - Dessa forma não há obrigatoriedade de implementação na classe, apesar de possível, pois você já terá uma implementação default.
#### _______________________________________________
## * Enum *
````
É um tipo no qual declaramos um conjunto de valores constantes pré-definidos. Sua sintaxe é muito semelhante à declaração
de uma classe, exceto pelo uso da palavra chave enum que antecede seu nome. Ex: ERROR_PRODUTO.
````


Resposta do tipo "Aprendendo por Exemplos".

Modificadores de Visibilidade
A palavra-reservada private modifica a forma como as demais classes do seu programa conseguem ver uma classe ou um atributo de classe.

Classes
Para classes, podemos ter os modificadores:

public
Todas as demais enxergam.

public class MinhaClasse { ... }
private
Somente classes no mesmo arquivo fonte enxergam. Use isso quando a implementação serve para algum algoritmo interno da classe principal.

public class MinhaClasse {
    private class MinhaClasseInternaPrivada { ... }
}
private class MinhaClassePrivada { ... }
Nota: cada arquivo .java pode ter apenas uma classe pública.

(default)
Somente classes no mesmo arquivo fonte ou no mesmo pacote (package) enxergam. Use quando a implementação serve apenas para sua biblioteca ou para uma determinada parte do seu programa.

class MinhaClasse { ... }
Métodos
Métodos podem ter os seguintes modificadores de visibilidade:

public
Todas as classes o enxergam, desde que enxerguem a classe também.

public class MinhaClasse {
    public void meuMetodo() { }
}
private
Somente classes no mesmo arquivo fonte enxergam. Use isso quando o método é feito apenas para uso dos outros métodos públicos da classe.

public class MinhaClasse {
    private void meuMetodoSecreto() { }
    public void meuMetodoPublico() {
        meuMetodoSecreto();
    }
}
Métodos privados não podem ser sobrescritos.

protected
Métodos protegidos podem ser vistos pelas classes do mesmo pacote ou por subclasses.

public class MinhaClasse {
    protected void meuMetodo() { }
}
Use isso se for fazer algum tipo de biblioteca que permita a outro desenvolvedor estender suas classes e então usar esses métodos especiais, os quais não devem ser chamados por outras classes que usam a sua biblioteca.

(default)
Métodos sem modificador podem ser vistos apenas pelas classes do mesmo pacote.

public class MinhaClasse {
    void meuMetodo() { }
}
Use isso quando um método é usado apenas pelas classes que compõe uma parte do seu programa.

Atributos
Atributos funcionam praticamente como os métodos.

public
Todas as classes o enxergam, desde que enxerguem a classe também.

public class MinhaClasse {
    public int atributo = 1;
}
É uma má prática ter atributos int, a menos que sejam "constantes" ou você queira simular estruturas como da linguagem C.

private
Somente classes no mesmo arquivo fonte enxergam. Procure deixar todos os seus atributos privados e dar o acesso encasulado a eles através de getters e setters.

public class MinhaClasse {
    private int atributo = 1;
    public int getAtributo() {
        return atributo;
    }
    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }
}
protected
Atributos protegidos podem ser vistos pelas classes do mesmo pacote ou por subclasses.

public class MinhaClasse {
    protected int atributo = 1;
}
(default)
Atributos sem modificador podem ser vistos apenas pelas classes do mesmo pacote.

public class MinhaClasse {
    int atributo = 1;
}
Modificador final
É usado em vários contextos: classes, métodos, atributos e variáveis.

Classes final
Uma classe com este modificador não pode ser estendida, isto é, não pode ter classes que herdam dela.

Isso é importante para garantir que uma determinada implementação não tenha seu comportamento modificado. Isso tem muito a ver com a imutabilidade.

Tipos básicos do Java como String e Integer são final porque se espera que o conteúdo não possa ser modificado. O problema é que seu alguém pudesse criar uma subclasses de String, esta implementação poderia passar a ser mutável. Uma String mutável seria o caos na terra para implementações, pois vários pressupostos que os desenvolvedores usam no dia-a-dia seriam simplesmente desfeitos.

public final class String
     implements java.io.Serializable, Comparable<String>, CharSequence
{ ... }
Método final
É um método que não pode ser sobrescrito nas subclasses.

Use para garantir que um determinado algoritmo não possa ser modificado pelas subclasses.

Exemplo:

class ChessAlgorithm {
    enum ChessPlayer { WHITE, BLACK }
    ...
    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
    ...
}
Atributo final
Um atributo final de uma classe pode ter seu valor atribuído uma única vez, seja na própria declaração ou no construtor.

public class MinhaClasse {
    final int x = 1;
    final int y;

    public MinhaClasse(int y) {
        this.y = y;
    }
}
Use isso para garantir que um valor ou referência de objeto não vai mudar. Voltamos à imutabilidade.

Se você tem um algoritmo que usa esse variável, você pode armazenar valores calculados sem a preocupação do valor mudar.

Exemplo:

public class MinhaClasse {
    final Cliente cliente;
    final BigDecimal saldo;

    public MinhaClasse(Cliente cliente) {

        this.cliente = cliente;

        //sabemos que saldo não muda
        this.saldo = cliente.chamarOperacaoComplexaQueCalculaOSaldo();

    }

    public BigDecimal getSaldoCliente() {
        //não precisa mais recalcular toda vez
        return saldo;
    }
}
Variáveis final
Use para garantir que você não está modificando o valor indevidamente.

final boolean a = lerInputUsuario();
final boolean b = lerInputUsuario();
...
if (a = b) //ops!!!
No código acima, suponha que o desenvolvedor queria comparar os valores de a e b, mas faltou um sinal de igual. Sem o final, haveria uma atribuição indevida e o resultado seria o valor booleano de b. Mas como n é final, o compilador vai acusar um erro. Acabamos de impedir uma atribuição involuntária!

Threads e Classes Internas
Outra vantagem de variáveis e atributos final é poder usá-los em classes internas, técnica muito usada em Threads.

public class MinhaClasse {

    public void executarEmParalelo(final int limite, final Processamento proc) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < limite; i++) {
                    proc.executar();
                }
            }
        };
        t.start();
    }
}
Modificador static
Ele muda o escopo de um método ou atributo. Com o static, ao invés deles pertencerem à instância do objeto, eles pertencem à classe.

O modificador também pode ser aplicado para classes, como veremos a seguir.

Métodos static
Os métodos static podem ser chamados sem uma instância. São ótimos como utilitários.

public final class Integer extends Number implements Comparable<Integer> {
    public static Integer valueOf(String s, int radix) throws NumberFormatException {
        return new Integer(parseInt(s,radix));
    }
}
Você pode chamar assim:

Integer valor = Integer.valueOf("FF", 16);
Métodos estáticos não podem acessar variáveis de instância.

public class MinhaClasse {
    int valor = 1;
    public static int estatico() {
        return valor; //erro de compilação aqui!!!
    }
}
Atributos static
Os atributos static possuem o mesmo valor para todas as instâncias de um objeto (dentro de uma mesma JVM, dentro de um mesmo ClassLoader).

public class MinhaClasse {
    static int valorGlobal = 1;
    public static int getValorGlobal() {
        return valorGlobal;
    }
}
Então, podemos fazer o seguinte:

MinhaClasse c1 = new MinhaClasse();
MinhaClasse c2 = new MinhaClasse();
MinhaClasse.valorGlobal = 2;
System.out.println(c1); //imprime 2
System.out.println(c2); //imprime 2
Classes static
Classes static são classes declaradas dentro de outra classe que podem ser usadas sem a necessidade de uma instância.

public class MinhaClasse {
    public static classe ClasseInterna { }
}
Então podemos acessar isso assim:

MinhaClasse.ClasseInterna instancia = new MinhaClasse.ClasseInterna();
Juntando tudo
Agora que entendemos o que cada coisa faz individualmente, vamos a uma aplicação prática.

Padrão de Projeto Singleton
Problema: quero garantir uma instância única de um objeto no meu programa.

Solução:

public class MinhaClasse {
    private static MinhaClasse instancia;
    public static MinhaClasse getInstancia() {
        if (instancia == null) {
            intancia = new MinhaClasse();
        } 
        return instancia;
    }
}
Uso:

MinhaClasse instancia = MinhaClasse.getInstancia();
Isso vai retornar o mesmo valor em todas as chamadas.

Basicamente, o que fizemos foi isso:

Criar um atributo chamado instancia que só a MinhaClasse pode ver (private) e contém sempre o mesmo valor (static).
Criar um método que pode ser chamado diretamente pela classe, sem precisar da instância (static).
Então, o método estático retorna o valor estático, que será sempre o mesmo.
