package jpeg.src.main.java.com.github.jc00973.cs.aula8.domain;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe contendo a implementação do programa jpeg proposto na aula 8.
 */
public final class VerificadorJpegUtils {

    /**
     * Construtor privado para evitar instanciação indevida.
     */
    private VerificadorJpegUtils() { };

    final public static String primeiroJpeg = "ff";
    final public static String segundoJpeg = "d8";
    final public static String penultimoJpeg = "ff";
    final public static String ultimoJpeg = "d9";

    /**
     * Função que instacia o arquivo a partir do nome do arquivo, verifica se ele tem quatro bytes ou mais, lê e
     * retorna os quatro primeiros bytes.
     *
     * @param nomeArquivo Nome do arquivo que será verificado os quatro primeiros bytes.
     * @return Retorna os quatro primeiros bytes do arquivo.
     * @throws IOException Caso ocorra alguma exceção de IO.
     */
    public static String ehJpeg(final String nomeArquivo)
            throws IOException {

        final File arqInteressado = new File(nomeArquivo);

        final int quatroBytes = 4;

        if (arqInteressado.length() == 0) {
            throw new IllegalArgumentException("Arquivo inválido!");
        }

        final InputStream inp = Files.newInputStream(Paths.get(nomeArquivo));
        final DataInputStream dat = new DataInputStream(inp);

        final String primeiroByte = String.format("%02x", dat.read());;
        final String segundoByte = String.format("%02x", dat.read());;
        final String penultimoByte;
        final String ultimoByte;

        final String contador = String.format("%02x", dat.read());

        while(contador != "-1") {

        }

        final String resultado;

        if(primeiroByte.equals(primeiroJpeg) && segundoByte.equals(segundoJpeg)) {
            resultado = "ok";
        } else {
            resultado = "errado" + " " + primeiroByte + " " + primeiroJpeg + " " + segundoByte + " " + segundoJpeg;
        }

        inp.close();
        dat.close();

        return resultado;

    }

}
