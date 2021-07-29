package br.com.maratonajava.javacore.classes.aula66_polimorfismo;

/**
 * Curso Java Completo - Aula 66: Polimorfismo pt 03
 */
public class ArquivoDAOimpl implements GenericDAO{

    @Override
    public void save() {
        System.out.println("Salvando dados no arquivo...");
    }
    
}
