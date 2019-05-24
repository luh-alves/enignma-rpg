/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.perguntas;

import java.util.ArrayList;
import static projetorpgenigma.perguntas.GeraPerguntasJoan.ANSI_GREEN;
import static projetorpgenigma.perguntas.GeraPerguntasJoan.ANSI_RESET;

/**
 *
 * @author Luciana Alves
 */
public class GeraPerguntasComuns {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private static final String[][] perguntas;

    static {
        perguntas = new String[8][];
        String[] pergunta1 = new String[4];
        pergunta1[0] = (ANSI_CYAN + " ---> O primeiro ataque vai ser 1 0 1 1 1 base 2 para base 10 leste" + ANSI_RESET);
        pergunta1[1] = "Qual o valor correspondente? 27 ou 23?";
        pergunta1[2] = "23";
        pergunta1[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[0] = pergunta1;

        String[] pergunta2 = new String[4];
        pergunta2[0] = (ANSI_CYAN + " ---> No primeiro ataque vamos ter 1 1 1 base 2 para base 10 barcos" + ANSI_RESET);
        pergunta2[1] = "Qual é o valor correspondente de numeros de barcos? 10 ou 7?";
        pergunta2[2] = "7";
        pergunta2[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[1] = pergunta2;

        String[] pergunta3 = new String[4];
        pergunta3[0] = (ANSI_CYAN + " ---> Amanhã ás 1 3 7 base 8 para base 10 faremos um ataque" + ANSI_RESET);
        pergunta3[1] = "Qual o horáriro correspondente ao ataque? 9:50 ou 21:50?";
        pergunta3[2] = "9:50";
        pergunta3[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[2] = pergunta3;

        String[] pergunta4 = new String[4];
        pergunta4[0] = (ANSI_CYAN + " ---> Temos  3 7 base 8 para base 10 soldados infiltrados em territorios inimigos" + ANSI_RESET);
        pergunta4[1] = "Quantos soldados temos ? 37 ou 31 ?";
        pergunta4[2] = "31";
        pergunta4[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[3] = pergunta4;

        String[] pergunta5 = new String[4];
        pergunta5[0] = (ANSI_CYAN + " ---> Vamos atacar pela madrugada começando em 7A base 16 para base 10 KM sul da Polônia" + ANSI_RESET);
        pergunta5[1] = "O ataque vai começar em quantos KM ? 122 ou 129? ";
        pergunta5[2] = "122";
        pergunta5[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[4] = pergunta5;

        String[] pergunta6 = new String[4];
        pergunta6[0] = (ANSI_CYAN + " ---> Ás A + B, (onde A = 1 e B = 1) e  A * B, (onde A = 0 e B = 0)"
                + "a união dos valores de S vai ser o horario que vamos atacar na Dinamarca" + ANSI_RESET);
        pergunta6[1] = "Que horas vai começar o ataque ? 01 ou 10?";
        pergunta6[2] = "10";
        pergunta6[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[5] = pergunta6;

        String[] pergunta7 = new String[4];
        pergunta7[0] = (ANSI_CYAN + " ---> Ás A * B, (onde A = 0 e B = 1) e  A + B, (onde A = 0 e B = 1)"
                + "a união dos valores de S vai ser o horario que vamos atacar na Dinamarca" + ANSI_RESET);
        pergunta7[1] = "Que horas vai começar o ataque ? 01 ou 10?";
        pergunta7[2] = "01";
        pergunta7[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[6] = pergunta7;

        String[] pergunta8 = new String[4];
        pergunta8[0] = ("*** Passaram - se dois anos e todos estavam fadigados , eram dias e noites tentando decifrar \n"
                + "e as tentativas quase sempre eram fracassadas, pois eles tinham só 18 horas\n"
                + "para decodificar milhares de codigos e os ataques persistiam cada vez mais foi quando J O A N \n"
                + "convenceu A L A N que sozinho ele não conseguiria,\n"
                + "ele chama os colegas para uma reunião afim de tentar convence-los que a ideia\n"
                + "dele era a melhor alternativa no momento, os colegas sem saida aceitam participar e juntos \n"
                + "conseguiram fazer funcionar a Christopher. ***\n"
                + ANSI_CYAN + " ---> Às 0 ,1 , 0 , em uma funação AND junto com 0 ,0 , 0 , em uma funação OR\n" + ANSI_RESET
                + ANSI_CYAN + "Alan e os companheiros de equipes decidiram sair para\n" + ANSI_RESET
                + ANSI_CYAN + "esfriar a cabeça, pois estava esgotando o prazo deles, foi \n" + ANSI_RESET
                + ANSI_CYAN + "quando Alan ouviu uma frase -- Heil Hitle -- e percebe que\n" + ANSI_RESET
                + ANSI_CYAN + "todos os enigmas tinha um padrão" + ANSI_RESET);
        pergunta8[1] = "Então podemos falar que o problema da maquina foi resolvido ás? 00:00 ou 01:00 ?";
        pergunta8[2] = "00:00";
        pergunta8[3] = (ANSI_GREEN + " P A R A B E N S , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque\n" + ANSI_RESET);
        perguntas[7] = pergunta8;

    }

    public static String[] geraPergunta( ArrayList<Integer> indicesSorteado) {
        // Sortear o indice
        int indice = GeraIndice.geraIndice(perguntas.length , indicesSorteado);
        return perguntas[indice];
    }

}
