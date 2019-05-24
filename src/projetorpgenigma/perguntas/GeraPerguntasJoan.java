/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.perguntas;

import java.util.ArrayList;

/**
 *
 * @author Luciana Alves
 */
public class GeraPerguntasJoan {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    private static final String[][] perguntas;
    
    /**
     * Perguntas é uma matriz, no qual armazenam-se as perguntas:
     * Representação da pergunta com Array;
     * Array [0] enunciado;
     * Array [1] pergunta;
     * Array [2] resposta;
     * Array [3] mensagem caso seja a resposta esperada no array [2];
     * Static é um bloco para inicializar propridades estaticas;
     */
    static {        
        perguntas = new String[8][];
        String[] pergunta1 = new String[4];
        pergunta1[0] = (ANSI_PURPLE + " 2 + 8 - 3 - 5 + 15 = ?" + ANSI_RESET);
        pergunta1[1] = "A resposta está entre 16 e 18 ? S ou N";
        pergunta1[2] = "S";
        pergunta1[3] = (ANSI_GREEN + " P A R A B E N S , voce acertou a resposta é 17, vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[0] = pergunta1;

        String[] pergunta2 = new String[4];
        pergunta2[0] = (ANSI_PURPLE + " 1 + 6 - 2 - 4 + 12 = ?" + ANSI_RESET);
        pergunta2[1] = "A resposta está entre 12 e 16 ? S ou N";
        pergunta2[2] = "S";
        pergunta2[3] = (ANSI_GREEN + "P A R A B E N S , voce acertou a resposta é 13, vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[1] = pergunta2;

        String[] pergunta3 = new String[4];
        pergunta3[0] = (ANSI_PURPLE + " 12 - 4 * 2 * ( 3 + 5 - 2 ) = ?" + ANSI_RESET);
        pergunta3[1] = "A resposta é positiva ? S ou N";
        pergunta3[2] = "N";
        pergunta3[3] = (ANSI_GREEN + " P A R A B E N S , voce acertou a resposta é negativa -36 , vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[2] = pergunta3;

        String[] pergunta4 = new String[4];
        pergunta4[0] = (ANSI_PURPLE + " 8 - 4 * 1 * ( 2 + 4 - 1 ) = ?" + ANSI_RESET);
        pergunta4[1] = "A resposta é negativa ? S ou N";
        pergunta4[2] = "S";
        pergunta4[3] = (ANSI_GREEN + " P A R A B E N S , voce acertou a resposta é negativa -12 , vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[3] = pergunta4;

        String[] pergunta5 = new String[4];
        pergunta5[0] = (ANSI_PURPLE + " 174 + 64 * 3 - 89 = ?" + ANSI_RESET);
        pergunta5[1] = "A resposta é 277? S ou N";
        pergunta5[2] = "S";
        pergunta5[3] = (ANSI_GREEN + " P A R A B E N S , voce acertou , vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[4] = pergunta5;

        String[] pergunta6 = new String[4];
        pergunta6[0] = (ANSI_PURPLE + " 68 + 32 * 2 - 71 = ?" + ANSI_RESET);
        pergunta6[1] = "A resposta é 61 ? S ou N";
        pergunta6[2] = "S";
        pergunta6[3] = (ANSI_GREEN + " P A R A B E N S , voce acertou , vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[5] = pergunta6;

        String[] pergunta7 = new String[4];
        pergunta7[0] = (ANSI_PURPLE + " 25 + 36 / 12 - 13 * 2 = ?" + ANSI_RESET);
        pergunta7[1] = "A resposta não é 3? ? S ou N";
        pergunta7[2] = "S";
        pergunta7[3] = (ANSI_GREEN + " P A R A B E N S , voce acertou a resposta é 2, vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[6] = pergunta7;

        String[] pergunta8 = new String[4];
        pergunta8[0] = (ANSI_PURPLE + " 15 + 32 / 8 - 7 * 2 = ?" + ANSI_RESET);
        pergunta8[1] = "A resposta não é 5 ? S ou N";
        pergunta8[2] = "N";
        pergunta8[3] = (ANSI_GREEN + " P A R A B E N S , voce acertou a resposta é 17, vamos para a proxima questão\n" + ANSI_RESET);
        perguntas[7] = pergunta8;
    }

    public static String[] geraPergunta(ArrayList<Integer> indicesSorteado) {
        // Sortear o indice
        int indice = GeraIndice.geraIndice(perguntas.length, indicesSorteado);
        return perguntas[indice];
    }

}
