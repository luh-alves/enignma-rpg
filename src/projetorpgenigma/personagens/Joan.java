package projetorpgenigma.personagens;

import java.util.Scanner;
import projetorpgenigma.perguntas.GeraPerguntasComuns;
import projetorpgenigma.perguntas.GeraPerguntasJoan;

/**
 *
 * @author Luciana Alves
 */
public class Joan {

    public static void jogar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Alan publicou um jogo de palavras cruzadas no jornal, "
                + "e quem conseguir responder em dez minutos pode candidatar-se para a seleção");
        System.out.println("Vale lembrar que voce escolheu J O A N e que "
                + "a partir de agora voce vai contar com a personalidade, e com as dificuldades da personagem");
        System.out.println("Voce deseja cotinuar com a mesma personagem?");
        System.out.println(" SIM OU NÃO");
//        if(nao){
//            EscolhaDePersonagem.escolherPersonagem();
//            return;
//        }
        //caso sim == continua;
        //caso nao == volta p menu de escolha de personagens;

        System.out.println("No primeiro momento J O A N é barrada por um soldado"
                + "pois é uma mulher, e a historia do filme acontece em uma epoca "
                + "em que a mulher era vista como como um ser inferior e incapaz de tals atos.");
        System.out.println("AS COISAS NÃO MUDARAM MUITO OU AINDA BEM QUE TUDO MUDOU");
        //ambas vão para a proxima fase hahahaha;

        System.out.println("Como na epoca era tudo mais complicado para as mulheres você vai "
                + "participar de um primeiro desafio,"
                + "se passar ai sim irá p desafio real oficial ");
        System.out.println("Voce deseja cotinuar com a mesma personagem?");
        System.out.println(" SIM OU NÃO");
        //caso sim == continua;
        //caso nao == volta p menu de escolha de personagens;

        System.out.println("Que bom que voce ficou, vamos começar!!!!");
        System.out.println("Ao chegar para seleção voce descobre que se trata "
                + "de uma seleção para trabalhar com Alan na guerra");
        System.out.println(" SIM OU NÃO");
        //caso sim == continua;
        //caso nao == volta p menu de escolha de personagens;

        System.out.println(" P R I M E I R O   D E S A F I O  ");

        int chances = 2;
        int corretas = 0;
        int erradas = 0;
        int contador = 0;

        //PRE TESTE
        while (chances > 0 && contador < 4) {

            String[] pergunta = GeraPerguntasJoan.geraPergunta();

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
                    System.out.println("Voce errou, nada está perdido, vc tem mais uma chance");
                }
            }
            contador++;
        }

        //CASO COMUM
        if (corretas > erradas) {
            System.out.println("PARABÉNS VOCE ENTROU PARA A EQUIPE DE INTELIGENCIA DO GOVERNO");

            chances = 2;
            corretas = 0;
            erradas = 0;
            contador = 0;
            while (chances > 0 && contador < 6) {

                String[] pergunta = GeraPerguntasComuns.geraPergunta();

                System.out.println(pergunta[0]);
                System.out.println(pergunta[1]);

                String resposta = entrada.nextLine();

                if (resposta.equals(pergunta[2])) {
                    corretas++;
                    System.out.println(pergunta[3]);
                } else {
                    erradas++;
                    chances--;
                    if (chances > 0) {
                        System.out.println("Voce errou, nada está perdido, vc tem mais uma chance");
                    }
                }
                contador++;
            }
            if (corretas > erradas) {
                System.out.println(" P A R A B E N S   V O C E   G A N H O U   E   S A L V O U   1 4   M I L H O E S   D E   P E S S O A S ");
                System.out.println(" ----------------------------------------------- F  I  M -----------------------------------------------");
            } else {
                System.out.println(" V O C E   P E R D E U    ! ! !  ");
                System.out.println(" ----------------------------------------------- F  I  M -----------------------------------------------");
            }
        } else {
            System.out.println("F I M    INFELIZMENTE VOCE NÃO PASSOU NO PRIMEIRO DESAFIO");
            System.out.println("VOCE NÃO ENTROU PARA A EQUIPE DE INTELIGENCIA DO GOVERNO");
        }

    }

}
