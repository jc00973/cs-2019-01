package inteiro.src.main.java.com.github.jc00973.cs.aula8.application.console;

import inteiro.src.main.java.com.github.jc00973.cs.aula8.domain.ExibeQuatroBytesUtils;

import java.io.IOException;

/**
 * Classe contendo o main do programa inteiro exigido na aula 8.
 */
public final class Programa {

    /**
     * Construtor privado para evitar instanciação indevida.
     */
    private Programa() { };

    /**
     * Classe main que será executada via terminal.
     *
     * @param args Argumentos que serão fornecidos no terminal.
     * @throws IOException Caso ocorra alguma exceção de IO.
     */
    public static void main(final String[] args) throws IOException {


        final String resultado = ExibeQuatroBytesUtils.imprimirQuatroBytes(args[0]);
        final int resulInt = Integer.parseInt(resultado);

        System.out.write(resulInt);
    }

}
