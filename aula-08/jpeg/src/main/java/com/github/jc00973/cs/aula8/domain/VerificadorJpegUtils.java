package jpeg.src.main.java.com.github.jc00973.cs.aula8.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe contendo a implementação do programa inteiro proposto na aula 8.
 */
public final class ExibeQuatroBytesUtils {

    /**
     * Construtor privado para evitar instanciação indevida.
     */
    private ExibeQuatroBytesUtils() { };

    /**
     * Função que instacia o arquivo a partir do nome do arquivo, verifica se ele tem quatro bytes ou mais, lê e
     * retorna os quatro primeiros bytes.
     *
     * @param nomeArquivo Nome do arquivo que será verificado os quatro primeiros bytes.
     * @return Retorna os quatro primeiros bytes do arquivo.
     * @throws IOException Caso ocorra alguma exceção de IO.
     */
    public static String imprimirQuatroBytes(final String nomeArquivo)
            throws IOException {

        final File arqInteressado = new File(nomeArquivo);

        final int quatroBytes = 4;

        if (arqInteressado.length() < quatroBytes) {
            throw new IllegalArgumentException("Arquivo inválido! O mesmo tem menos de 4 bytes.");
        }

        final InputStream inp = Files.newInputStream(Paths.get(nomeArquivo));
        final DataInputStream dat = new DataInputStream(inp);
        final String bytesArquivo = Integer.toHexString(dat.readInt());

        inp.close();
        dat.close();

        return bytesArquivo;

    }

}
