/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.personagens;

import java.util.Scanner;
import projetorpgenigma.perguntas.GeraPerguntasComuns;

/**
 *
 * @author Luciana Alves
 */
public class Alan {

    public static void jogar() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Se você está, neste momento, lendo este texto no computador, "
                + "deve agradecer a esse matemático inglês que viveu entre as décadas de "
                + "1910 e 1950. Considerado o pai da computação, Turing foi um dos primeiros "
                + "a pensar na possibilidade de uma maquina se tornar inteligente e criou "
                + "um modelo teórico para um computador universal. Vale lembrar que naquela "
                + "época ninguém fazia ideia do que era isso");
        System.out.println("Vale lembrar que voce escolheu A L A N e que "
                + "a partir de agora voce vai contar com a personalidade, e com as dificuldades do personagem");
        System.out.println("Voce deseja cotinuar com o mesmo personagem?");
        System.out.println(" SIM OU NÃO");
        //caso sim == continua;
        //caso nao == volta p menu de escolha de personagens;

        System.out.println("Em 1938, antes mesmo da guerra começar, Bletchley Park virou "
                + " o cérebro da inteligência britânica. O governo estava convencido de "
                + " que o confronto era inevitável e decidiu se preparar. Sob a liderança "
                + " do comandante Alastair Denniston, chefe da Escola Governamental de Código"
                + " e Criptograma, também conhecida como Estação X, as autoridades começaram"
                + " a recrutar uma elite de intelectuais , professores das universidades, "
                + " criptoanalistas, linguistas, matemáticos e campeões de xadrez – para "
                + "interceptar e decodificar as mensagens alemãs. ");
        System.out.println("Voce deseja cotinuar com o desafio? Vale lembrar que a todo "
                + "momento você será responsavel pelas vidas perdidas na guerra");
        System.out.println(" SIM OU NÃO");
        //caso sim == continua;
        //caso nao == FIM;

        System.out.println(" Você contrataria Alan Turing para decifrar"
                + " Enigma, a máquina que criptografava a comunicação nazista durante a guerra");
        System.out.println("SIM OU NÃO");
        //caso sim == continua;
        //caso nao == FIM , você perdeu a guerra e milhões de pessoa morreram;

        System.out.println("Alan se mostra arredio ao trabalho em grupo, demonstra sua falta "
                + "de paciência com colegas menos astutos e ao evitar contato visual com as "
                + "demais pessoas se apresenta nada sociável. Trabalha em paralelo à equipe "
                + "e não compartilha suas ideias, pois acredita que é mais rápido sozinho"
                + "Alan começou analisar e percebeu que as pistas estavam aumentando e "
                + "ficando cada vez mais impossivel para um humano decodificar as mensagens alemãs,"
                + "foi então que ele decidiu trabalhar em um projeto sozinho ");
        System.out.println("Enquanto Alan trabalhava em seu projeto sozinho e desfalcava equipe,"
                + " milhares de navios eram bombardeados e milhares de pessoas morriam, "
                + "ele estava ficando sem tempo , porem substimava os colegas e acreditava"
                + "que só ele era capaz");

        System.out.println(" D E S A F I O ");

        int chances = 2;
        int corretas = 0;
        int erradas = 0;
        int contador = 0;
        //CASO COMUM
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
                    System.out.println("Voce não conseguiu centenas de pessoas morreram, concentre-se  mais, "
                            + "vidas dependem  de você !");
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

    }

}
