/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.perguntas;

/**
 *
 * @author Luciana Alves
 */
public class GeraPerguntasJoan {

    private static final String[][] perguntas;

    static {
        perguntas = new String[8][];
        String[] pergunta1 = new String[4];
        pergunta1[0] = " 2 + 8 - 3 - 5 + 15 = 0";
        pergunta1[1] = "A resposta está entre 16 e 18 ? S ou N";
        pergunta1[2] = "S";
        pergunta1[3] = "PARABENS , voce acertou a resposta é 17, vamos para a proxima questão";
        perguntas[0] = pergunta1;
        
        String[] pergunta2 = new String[4];
        pergunta1[0] = " 1 + 6 - 2 - 4 + 12 = 0";
        pergunta1[1] = "A resposta está entre 12 e 16 ? SIM ou NAO";
        pergunta1[2] = "SIM";
        pergunta1[3] = "PARABENS , voce acertou a resposta é 13, vamos para a proxima questão";
        perguntas[1] = pergunta2;
        
        String[] pergunta3 = new String[4];
        pergunta1[0] = "  12 - 4 * 2 * ( 3 + 5 - 2 ) = 0";
        pergunta1[1] = "A resposta é positiva ? SIM ou NAO";
        pergunta1[2] = "NAO";
        pergunta1[3] = "PARABENS , voce acertou a resposta é negativa -36 , vamos para a proxima questão";
        perguntas[2] = pergunta3;
        
        String[] pergunta4 = new String[4];
        pergunta1[0] = " 8 - 4 * 1 * ( 2 + 4 - 1 )";
        pergunta1[1] = "A resposta é positiva ? ? SIM ou NAO";
        pergunta1[2] = "NAO";
        pergunta1[3] = "PARABENS , voce acertou a resposta é negativa -12 , vamos para a proxima questão";
        perguntas[3] = pergunta4;
        
        String[] pergunta5 = new String[4];
        pergunta1[0] = " 174 + 64 * 3 - 89 = 0";
        pergunta1[1] = "A resposta é 277? SIM ou NAO";
        pergunta1[2] = "SIM";
        pergunta1[3] = "PARABENS , voce acertou , vamos para a proxima questão";
        perguntas[4] = pergunta5;
        
        String[] pergunta6 = new String[4];
        pergunta1[0] = " 68 + 32 * 2 - 71 = 0";
        pergunta1[1] = "A resposta é 61 ? SIM ou NAO";
        pergunta1[2] = "SIM";
        pergunta1[3] = "PARABENS , voce acertou , vamos para a proxima questão";
        perguntas[5] = pergunta6;
        
        String[] pergunta7 = new String[4];
        pergunta1[0] = " 25 + 36 / 12 - 13 * 2 = 0";
        pergunta1[1] = "A resposta não é 3? ? SIM ou NAO";
        pergunta1[2] = "SIM";
        pergunta1[3] = "PARABENS , voce acertou a resposta é 2, vamos para a proxima questão";
        perguntas[6] = pergunta7;
        
        String[] pergunta8 = new String[4];
        pergunta1[0] = " 2 + 8 - 3 - 5 + 15 = 0";
        pergunta1[1] = "A resposta não é 4? ? SIM ou NAO";
        pergunta1[2] = "SIM";
        pergunta1[3] = "PARABENS , voce acertou a resposta é 5, vamos para a proxima questão";
        perguntas[7] = pergunta8;
    }

    public static String[] geraPergunta() {
        // Sortear o indice
        int indice = GeraIndice.geraIndice(perguntas.length); 
        return perguntas[indice];
    }

}
