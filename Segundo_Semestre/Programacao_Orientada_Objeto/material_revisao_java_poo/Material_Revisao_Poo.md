### **Material de Estudos para Programação Orientada a Objeto (Java)**



Tópicos:

* Conceitos de Programação Orientada a Objeto;
* Arrays e ArrayLists;
* Manipulação de Arquivos de Texto;
* Interface Gráfica GUI (NetBeans);
* Conexão com Banco de Dados MySQL;



-------------------------------------------------------------------------------------------

###### **Conceitos de Programação Orientada a Objeto**



**1. Classe**

* É a **estrutura base** de um programa orientado a objetos.
* Representa **algo do mundo real** (ex: Pessoa, Carro, ContaBancaria) em forma de código.
* Dentro da classe definimos **atributos** (características) e métodos (ações).



**Exemplo:**



public class Pessoa {

    // Atributos
String nome;

    int idade;



    // Métodos

    void falar() {

        System.out.println("Olá, meu nome é " + nome);

    }

}



**2. Objeto**

* É uma **instância** (ou cópia) de uma classe.
* Cada objeto tem **valores próprios** para os atributos da classe.



**Exemplo:**

Pessoa p1 = new Pessoa();

p1.nome = "João";

p1.idade = 30;

p1.falar(); // Saída: Olá, meu nome é João



**3. Atributos**

* São as **características** de uma classe.
* Podem ser de diferentes tipos: String, int, double, boolean, etc.
* Em geral, **são variáveis declaradas dentro da classe**, mas fora dos métodos.



**Exemplo:**

public class Carro {

    String modelo;

    int ano;

    double velocidade;

}





**4. Métodos**

* São as **ações ou comportamentos** que um objeto pode realizar.
* Equivalem a **funções** dentro das classes.



**Exemplo:**



void acelerar() {

    System.out.println("O carro está acelerando!");

}





**5. Construtor**

* É um **método especial** chamado automaticamente ao criar um objeto.
* Serve para **inicializar os atributos**.



**Exemplo:**



public class Pessoa {

    String nome;

    int idade;



    // Construtor

    public Pessoa(String nome, int idade) {

        this.nome = nome;

        this.idade = idade;

    }

}





**6. Sobrecarga (Overloading)**

* Quando há **métodos com o mesmo nome**, mas **assinaturas diferentes** (número ou tipo de parâmetros).
* Também pode ocorrer em construtores.



**Exemplo:**



public Pessoa() {}  // Construtor vazio



public Pessoa(String nome, int idade) {  // Construtor com parâmetros

    this.nome = nome;

    this.idade = idade;

}





**7. Modificadores de Acesso**

* **public** → acessível em qualquer lugar.
* **private** → acessível apenas dentro da própria classe.
* **protected** → acessível dentro do mesmo pacote ou por herança.
* **default** (sem nada) → acessível apenas dentro do mesmo pacote.





**8. Encapsulamento**

* Serve para **proteger os dados** de uma classe.
* Atributos ficam private, e o acesso é feito com getters e setters.



**Exemplo:**



public class Pessoa {

    private String nome;



    public String getNome() {

        return nome;

    }



    public void setNome(String nome) {

        this.nome = nome;

    }

}





**9. Herança**

* Permite que uma **classe filha** herde atributos e métodos de uma **classe pai**.
* Usa-se a palavra-chave **extends**.



**Exemplo:**



public class Pessoa {

&nbsp;   String nome;

}



public class Aluno extends Pessoa {

&nbsp;   int matricula;

}





**10. Classes Abstratas e Métodos Abstratos**

* **Classe abstrata:** não pode ser instanciada diretamente, serve como modelo.
* **Método abstrato:** declarado sem corpo; deve ser implementado pelas subclasses.
* Usa-se a palavra-chave abstract.



**Exemplo:**



public abstract class Animal {

&nbsp;   abstract void fazerSom();

}



public class Cachorro extends Animal {

&nbsp;   void fazerSom() {

&nbsp;       System.out.println("Au au!");

&nbsp;   }

}





**11. Polimorfismo**

* Permite que **um mesmo método tenha comportamentos diferentes** dependendo do objeto que o executa.
* Ocorre quando uma classe filha **redefine** (override) um método da classe pai.



**Exemplo:**



Animal a = new Cachorro();

a.fazerSom(); // Saída: Au au!





**12. Interface**

* É um contrato: define métodos que **devem** ser implementados por quem a usa.
* Todos os métodos são **abstratos** por padrão.



**Exemplo:**



public interface Animal {

&nbsp;   void fazerSom();

}



public class Gato implements Animal {

&nbsp;   public void fazerSom() {

&nbsp;       System.out.println("Miau!");

&nbsp;   }

}





-------------------------------------------------------------------------------------------

