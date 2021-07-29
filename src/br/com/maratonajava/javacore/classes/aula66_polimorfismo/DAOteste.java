package br.com.maratonajava.javacore.classes.aula66_polimorfismo;

/**
 * Curso Java Completo - Aula 66: Polimorfismo pt 03
 */
public class DAOteste {
    public static void main(String[] args) {
        /* Nesse caso, se quiser um objeto do tipo DatabaseDAO, basta chamar o construtor após o new usando a variável de referencia da interface
        como feito abaixo */
        GenericDAO arquivoDAO = new ArquivoDAOimpl();
        arquivoDAO.save();
        System.out.println("--------------");
        arquivoDAO = new DatabaseDAOimpl();
        arquivoDAO.save();
    }
}
