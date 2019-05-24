package projetorpgenigma;

import java.util.Scanner;
import projetorpgenigma.personagens.Alan;
import projetorpgenigma.personagens.Joan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luciana Alves
 */
public class EscolhaDePersonagem {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void escolherPersonagem() {
        Scanner entrada = new Scanner(System.in);
        int personagem;

        do {

            System.out.println(ANSI_GREEN + "----------------Escolha o seu personagem ----------------" + ANSI_RESET);
            System.out.println(ANSI_WHITE + ">>>>>>>> Digite a opção desejada <<<<<<<<" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "\n1 - Joan" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "2 - Alan" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "3 - Voltar para o Menu Principal" + ANSI_RESET);
            personagem = entrada.nextInt();

            switch (personagem) {

                case 1:
                    System.out.println(ANSI_PURPLE + " J O A N " + ANSI_RESET);
                    System.out.println("\nJoan foi a única mulher a trabalhar no projeto de decodificação"
                            + "\ndas máquinas Enigma ao lado de Turing. Estudou na Universidade de Cambridge"
                            + "\ne foi recrutada por um coordenador da instituição para entrar na Government"
                            + "\nCode and Cypher School (GCCS). Se dedicou à matemática, ganhou destaque acadêmico"
                            + "\nmas mesmo assim recebia menos do que seus colegas homens: 2 libras por semana."
                            + "\nDepois de passar alguns dias trabalhando isolada no projeto Enigma, finalmente "
                            + "\nganhou uma mesa ao lado de Turing e outros cientistas da época.\n");
                    //System.out.println(ANSI_PURPLE + "Com Opções : voltar , encerrar jogo , sair\n" + ANSI_RESET);
                    Joan.jogar();

                    return;
                case 2:
                    System.out.println(ANSI_CYAN + " A L A N " + ANSI_RESET);
                    System.out.println("\nAlan Turing, um matemático, de perfil extremamente introspectivo "
                            + "\ne analítico, assume o comando de uma equipe altamente especializada e mostra"
                            + "\nque com apoio, determinação e muito esforço, pode ser um líder e vencer um "
                            + "\ndesafio considerado impossível.\n");
                    System.out.println("Sua missão é decifrar os ENIGMAS para saber onde  vai ser os futuros ataques.\n");
                    
                    //System.out.println(ANSI_CYAN + "Com Opções : voltar , encerrar jogo , sair\n" + ANSI_RESET);
                    Alan.jogar();
                    return;

                default:
                    System.out.println("--- OPÇÃO INDISPONIVEL ---");

            }

        } while (personagem != 3);

    }

}
