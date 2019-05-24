package projetorpgenigma.personagens;

import java.util.ArrayList;
import java.util.Scanner;
import projetorpgenigma.EscolhaDePersonagem;
import projetorpgenigma.perguntas.GeraPerguntasComuns;
import projetorpgenigma.perguntas.GeraPerguntasJoan;

/**
 *
 * @author Luciana Alves
 */
public class Joan {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void jogar() {

        Scanner entrada = new Scanner(System.in);
        String decisao;
        System.out.println(ANSI_PURPLE + "Alan publicou um jogo de palavras cruzadas no jornal, " + ANSI_RESET
                + ANSI_PURPLE + "e quem conseguir responder em dez \nminutos pode candidatar-se para a seleção." + ANSI_RESET
                + ANSI_PURPLE + "Vale lembrar que voce escolheu J O A N e que\n" + ANSI_RESET
                + ANSI_PURPLE + "a partir de agora voce vai contar com a personalidade, e com as dificuldades da personagem" + ANSI_RESET);
        System.out.println("\nVoce deseja cotinuar com a mesma personagem? S ou N ?");
        decisao = entrada.nextLine();
        if (decisao.equalsIgnoreCase("N")) {
            EscolhaDePersonagem.escolherPersonagem();
            return;
        }
        System.out.println(ANSI_YELLOW + "\n *************** V A M O S   C O N T I N U A R *************** " + ANSI_RESET);

        System.out.println(ANSI_PURPLE + "\nNo primeiro momento J O A N é barrada por um soldado" + ANSI_RESET
                + ANSI_PURPLE + "pois é uma mulher, e a historia do filme\nacontece em uma epoca " + ANSI_RESET
                + ANSI_PURPLE + "em que a mulher era vista como como um ser inferior e incapaz." + ANSI_RESET
                + ANSI_PURPLE + "Como na epoca era\ntudo mais complicado para as mulheres você vai " + ANSI_RESET
                + ANSI_PURPLE + "participar de um primeiro desafio\nse passar ai sim irá para o DESAFIO REAL " + ANSI_RESET);
        System.out.println("\nVoce deseja cotinuar com a mesma personagem? S ou N ?");
        decisao = entrada.nextLine();
        if (decisao.equalsIgnoreCase("N")) {
            EscolhaDePersonagem.escolherPersonagem();
            return;
        }
        System.out.println(ANSI_YELLOW + "\n *************** V A M O S   C O N T I N U A R *************** " + ANSI_RESET);

        System.out.println(ANSI_PURPLE + "\nAo chegar para seleção voce descobre que se trata " + ANSI_RESET
                + ANSI_PURPLE + "de uma seleção para trabalhar \ncom Alan na guerra" + ANSI_RESET);
        System.out.println("\nVoce deseja cotinuar com a mesma personagem? S ou N ?");
        decisao = entrada.nextLine();
        if (decisao.equalsIgnoreCase("N")) {
            EscolhaDePersonagem.escolherPersonagem();
            return;
        }
        System.out.println(ANSI_YELLOW + "\n *************** V A M O S   C O N T I N U A R *************** " + ANSI_RESET);

        System.out.println("\nAlgumas semanas antes de começar a guerra, toda a "
                + "equipe começou receber os\nprimeiros E N I G M A S para decifrar \n");

        System.out.println(ANSI_GREEN + " ------------  P R I M E I R O   D E S A F I O  ------------ " + ANSI_RESET);

        int chances = 3;
        int corretas = 0;
        int erradas = 0;
        int contador = 0;

        ArrayList<Integer> geradorDeIndice = new ArrayList<>();

        //PRE TESTE
        while (chances > 0 && contador < 4) {

            String[] pergunta = GeraPerguntasJoan.geraPergunta(geradorDeIndice);

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
                    System.out.println(ANSI_RED + " Voce errou, nada está perdido, vc tem mais uma chance" + ANSI_RESET);
                }
            }
            contador++;
        }

        //CASO COMUM
        if (corretas > erradas) {
            System.out.println(ANSI_YELLOW + "PARABÉNS VOCE ENTROU PARA A EQUIPE DE INTELIGENCIA DO GOVERNO\n" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "-------------------  D  E  S  A  F  I  O  -------------------\n" + ANSI_RESET);

            chances = 3;
            corretas = 0;
            erradas = 0;
            contador = 0;
            geradorDeIndice = new ArrayList<>();
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
                        System.out.println(ANSI_RED + " V O C Ê   E R R O U , nada está perdido, vc tem mais uma chance\n" + ANSI_RESET);
                    }
                }
                contador++;
            }
            if (corretas > erradas) {
                System.out.println(ANSI_GREEN + " P A R A B E N S   V O C E   G A N H O U   E   S A L V O U   1 4   M I L H O E S   D E   P E S S O A S " + ANSI_RESET);
                System.out.println(ANSI_GREEN + " ----------------------------------------------- F  I  M -----------------------------------------------" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + " V O C E   P E R D E U    ! ! !  " + ANSI_RESET);
                System.out.println(ANSI_RED + " ----------------------------------------------- F  I  M -----------------------------------------------" + ANSI_RESET);
            }
        } else {
            System.out.println(ANSI_RED + " INFELIZMENTE VOCE NÃO PASSOU NO PRIMEIRO DESAFIO" + ANSI_RESET);
            System.out.println(ANSI_RED + " VOCE NÃO ENTROU PARA A EQUIPE DE INTELIGENCIA DO GOVERNO" + ANSI_RESET);
            System.out.println(ANSI_RED + " ----------------------------------------------- F  I  M -----------------------------------------------" + ANSI_RESET);
        }

    }

}
