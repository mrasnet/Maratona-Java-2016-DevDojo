package br.com.maratonajava.classes_utilitarias.aula98a102_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  Curso Java Completo - Aula 100: IO pt 03 BufferedWriter e BufferedReader
 * 
 * Quando estamos trabalhando com arquivos pequenos utilizar a classe FileWriter pode ser uma boa ideia porque é simples e rápido. Mas podemos também usar
 * a BufferedWriter. Aqui começa o encadeamento de classes que será necessário saber, seja para a certificação ou nossos projetos.
 * A diferença de performance é mais percepitível quando temos arquivos grandes - ex.: 100, 300 páginas.
 */
public class A100_BufferedTeste {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Neto\\Documents\\NetBeansProjects\\MARATONAJAVA\\src\\br\\com\\maratonajava\\classes_utilitarias\\aula"
            + "98a102_io\\arquivo3.txt");
        
        //Apartir daqui vamos utilizar o BufferedWriter - encadeamento:  BufferedWriter< FileWriter<File> > - mesma lógica para o BufferedReader 
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))){
            //FileWriter fw = new FileWriter(file);
            //BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Escrevendo minha segunda mensagem num arquivo do Java");
            bw.newLine();//encontra o char de quebra de linha correspondente do SO -  o '\n' em algum sistema operacional pode não pular a linha
            bw.write("Pulando uma linha");
            bw.flush();
              
            //FileReader fr = new FileReader(file);
            //BufferedReader br = new BufferedReader(fr);
            String str;
            //O método readLine irá retornar uma string sempre que terminar de ler uma linha, e retornará nulo quando terminar o arquivo 
            while((str=br.readLine()) != null){//irá imprimir linha por linha do arquivo enquanto diferente de nulo
                System.out.println(str);
            }
            //No encadeamento a classe mais externa ao ser fechada se encarrega de fechar as internas, por isso não precisamos fechar o FileReader etc.
            //br.close(); 
                    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
