package br.com.maratonajava.javacore.classes.aula66_polimorfismo;

/**
 * Curso Java Completo - Aula 66: Polimorfismo pt 03
 */
public class DatabaseDAOimpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados na base de dados....");
    }
    
}
