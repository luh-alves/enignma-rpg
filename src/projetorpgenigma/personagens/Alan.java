/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.personagens;

import java.util.ArrayList;
import java.util.Scanner;
import projetorpgenigma.EscolhaDePersonagem;

import projetorpgenigma.perguntas.GeraPerguntasComuns;
import static projetorpgenigma.personagens.Joan.ANSI_RESET;
import static projetorpgenigma.personagens.Joan.ANSI_YELLOW;

/**
 *
 * @author Luciana Alves
 */
public class Alan {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
   ;

    public static void jogar() {
        Scanner entrada = new Scanner(System.in);
        String decisao;

        System.out.println(ANSI_CYAN + "Se você está, neste momento, lendo este texto no computador,\n"
                + ANSI_CYAN + "deve agradecer a esse matemático inglês que viveu entre as décadas de \n"
                + ANSI_CYAN + "1910 e 1950. Considerado o pai da computação, Turing foi um dos primeiros\n"
                + ANSI_CYAN + "a pensar na possibilidade de uma maquina se tornar inteligente e criou\n"
                + ANSI_CYAN + "um modelo teórico para um computador universal. Vale lembrar que naquela\n"
                + ANSI_CYAN + "época ninguém fazia ideia do que era isso\n"
                + ANSI_CYAN + "Vale lembrar que voce escolheu A L A N e que\n"
                + ANSI_CYAN + "a partir de agora voce vai contar com a personalidade, e com as dificuldades do personagem\n" + ANSI_RESET);
        System.out.println("Voce deseja cotinuar com a mesma personagem? S ou N ?");
        decisao = entrada.nextLine();
        if (decisao.equalsIgnoreCase("N")) {
            EscolhaDePersonagem.escolherPersonagem();
            return;
        }
        System.out.println(ANSI_YELLOW + "\n *************** V A M O S   C O N T I N U A R *************** "  + ANSI_RESET);

        System.out.println(ANSI_CYAN + "Em 1938, antes mesmo da guerra começar, Bletchley Park virou \n"
                + ANSI_CYAN + "o cérebro da inteligência britânica. O governo estava convencido de \n"
                + ANSI_CYAN + "que o confronto era inevitável e decidiu se preparar. Sob a liderança \n"
                + ANSI_CYAN + "do comandante Alastair Denniston, chefe da Escola Governamental de Código\n"
                + ANSI_CYAN + "e Criptograma, também conhecida como Estação X, as autoridades começaram\n"
                + ANSI_CYAN + "a recrutar uma elite de intelectuais , professores das universidades, \n"
                + ANSI_CYAN + "criptoanalistas, linguistas, matemáticos e campeões de xadrez – para \n"
                + ANSI_CYAN + "interceptar e decodificar as mensagens alemãs.\n " + ANSI_RESET);
        System.out.println("Voce deseja cotinuar com o desafio? Vale lembrar que a todo \n"
                + "momento você será responsavel pelas vidas perdidas na guerra!! S ou N ?");
        decisao = entrada.nextLine();
        if (decisao.equalsIgnoreCase("N")) {
            EscolhaDePersonagem.escolherPersonagem();
            return;
        }
        System.out.println(ANSI_YELLOW + "\n *************** V A M O S   C O N T I N U A R *************** "  + ANSI_RESET);

        System.out.println(ANSI_CYAN + "Alan é uma pessoa nada sociável, arredio ao trabalho em grupo, demonstra sua falta\n "
                + ANSI_CYAN + "de paciência com colegas menos astutos e ao evitar contato visual com as \n"
                + ANSI_CYAN + "demais pessoas se apresenta nada sociável não compartilha suas ideias,\n "
                + ANSI_CYAN + "pois acredita que é mais rápido sozinho.\n" + ANSI_RESET);
        System.out.println("Você contrataria Alan Turing para decifrar"
                + " Enigma, a máquina que criptografava a comunicação nazista durante a guerra? S ou N ?");
        decisao = entrada.nextLine();
        if (decisao.equalsIgnoreCase("N")) {
            System.out.println(ANSI_RED + " --------------  F  I  M     D  E     J  O  G  O  ---------------"  + ANSI_RESET);
            System.out.println(ANSI_RED + " VOCÊ PERDEU A GUERRA E MILHÕES DE PESSOAS MORRERAM"  + ANSI_RESET);
            return;
        }
        System.out.println(ANSI_YELLOW + "\n *************** V A M O S   C O N T I N U A R *************** "  + ANSI_RESET);

        System.out.println("\nAlgumas semanas antes de começar a guerra, toda a "
                + "equipe começou receber os primeiros E N I G M A S para decifrar\n");

        System.out.println(ANSI_GREEN + "-------------------  D  E  S  A  F  I  O  -------------------" + ANSI_RESET);

        int chances = 2;
        int corretas = 0;
        int erradas = 0;
        int contador = 0;
        //CASO COMUM
        
        ArrayList<Integer> geradorDeIndice = new ArrayList<>();
        while (chances > 0 && contador < 6) {

            String[] pergunta = GeraPerguntasComuns.geraPergunta(geradorDeIndice);

            System.out.println(pergunta[0]);
            System.out.println(pergunta[1]);

            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase(pergunta[2])) {
                corretas++;
                System.out.println(pergunta[3]);
            } else {
                erradas++;
                chances--;
                if (chances > 0) {
                    System.out.println(ANSI_RED + " Voce não conseguiu centenas de pessoas morreram, concentre-se  mais, "
                            + "vidas dependem  de você !\n"  + ANSI_RESET );
                }
            }
            contador++;
        }

//        System.out.println("Alan começou analisar e percebeu que os mensagens alemãs estavam aumentando "
//                + "e ficando cada vez mais impossivel para um humano decodificar os enigmas ,"
//                + "foi então que ele decidiu trabalhar em um projeto sozinho enquanto "
//                + "Alan trabalhava em seu projeto sozinho e desfalcava a equipe,"
//                + " milhares de navios eram bombardeados e milhares de pessoas morriam, "
//                + "ele estava ficando sem tempo , porem substimava os colegas e acreditava"
//                + "que só ele era capaz\n");

        if (corretas > erradas) {
            System.out.println(ANSI_GREEN + " P A R A B E N S   V O C E   G A N H O U   E   S A L V O U   1 4   M I L H O E S   D E   P E S S O A S "  + ANSI_RESET);
            System.out.println(ANSI_GREEN + " ----------------------------------------------- F  I  M -----------------------------------------------"  + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + " V O C E   P E R D E U  ,  G U E R R A  C O N T I N U A R Á   ! ! !  ");
            System.out.println(ANSI_RED + " ----------------------------------------------- F  I  M -----------------------------------------------"  + ANSI_RESET);
        }

    }

}
