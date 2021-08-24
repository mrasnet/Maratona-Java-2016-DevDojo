package br.com.maratonajava.classes_utilitarias.aula103a114_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Curso Java Completo - Aula 105: NIO pt 03 Normalizando paths
 * 
 *  ../(diretório anterior) e ./ (diretório atual) estão relacionados à Normalização - Normalização é a utilização desses dois para a criação de diretórios
 *  de modo simples de serem entendidos.
 */
public class A105_NormalizacaoTeste {
    public static void main(String[] args) {
        //As vezes pode ocorrer de através de um script (ex.:), recebemos um caminho de diretório separado em partes
        String diretorioTeste = "C:\\Users\\Neto\\Desktop\\workspace\\back-end\\MARATONAJAVA\\src\\br\\com\\maratonajava\\"
            + "classes_utilitarias\\aula103a114_NIO\\pasta\\subpasta\\sub-subpasta";
        /* E dentre esses um comando como ..\ ou .\  - que via terminal funciona muito bem - entretanto, ao criar o path esse regra não é compreendida sem
        a utilização do metodo 'normalize' */
        String arquivoTxt = "..\\..\\arquivoTeste.txt";
        Path path = Paths.get(diretorioTeste, arquivoTxt);
        
        System.out.println(path);
        System.out.println(path.normalize());
        
        Path path2 = Paths.get("pasta/./subpasta/./sub-subpasta");
        System.out.println(path2);
        System.out.println(path2.normalize());
        
        //Algo importante é que isso não garante que o arquivo irá existir, estamos apenas normalizando seu caminho.
    }  
}
