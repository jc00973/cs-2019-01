package encontre.src.main.java.com.github.jc00973.cs.aula10.application.console;

import com.github.jc00973.cs.aula10.domain.DataUtils;

/**
 * Classe contendo o main do programa exigido na ordem de serviço proposta na aula 10.
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
     */
    public static void main(final String args) {

        System.exit(DataUtils.receberEntrada(args));
    }

}
