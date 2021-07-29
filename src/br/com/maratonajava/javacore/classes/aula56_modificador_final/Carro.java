package br.com.maratonajava.javacore.classes.aula56_modificador_final;

/**
 * Curso Java Completo - Aula 56: Modificador Final
 */

//Modificador final também é utilizado em classes, nesse caso, classes definidas com final não permitem herança. Raramente utilizado.
public class Carro {
    //aqui VELOCIDADE_LIMITE é publica pq o valor é inalterável, logo não faria sentido
    public static final double VELOCIDADE_LIMITE=250;//uppercase para constantes.
    /* Para var do tipo reference, não se pode apontar(alterar) para uma referencia diferente da qual é definida na inicialização.
    Nesse caso, só vai permitir alterar os campos do objeto. Constantes obrigatóriamente necessitam ser inicializadas quando declaradas */
    private final Comprador COMPRADOR = new Comprador();
    private String nome;
    private String marca;

    /* Geralmente constantes em java são inicializadas na declaração, contudo, para outras formas de inicialização com "final" algumas considerações
    devem ser feitas com base na ordem de execução do java. */
    @Override
    public String toString() {
        return "\nNome carro: "+this.nome+"\nMarca: "+this.marca+"\nComprador nome: "+this.COMPRADOR.getNome();
    }
    /* Se uma classe é final e ela não pode ser extendida, não há porque se preocupar com os métodos sendo sobrescritos, porém quando a classe não é final
    e se quer que um método não seja sobrescrito, se declara ele como final.
    Métodos definidos como final permitem apenas sobrecarga. */
    public final void imprime(){
        System.out.println("\nNome: "+this.nome+"\nMarca: "+this.marca+"\nComprador nome: "+this.COMPRADOR.getNome());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Comprador getComprador() {
       return COMPRADOR;
    }
}
