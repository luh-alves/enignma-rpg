/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma;

import java.util.Scanner;

/**
 *
 * @author Luciana Alves
 */
public class MenuInicial {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void mostrarOpcoes() {
        Scanner entrada = new Scanner(System.in);

        System.out.println(ANSI_GREEN + "---------------- Menu Principal ---------------- " + ANSI_RESET);
        System.out.println(ANSI_WHITE + ">>>>>>>> Digite Qual Opção Deseja <<<<<<<<" + ANSI_RESET);
        int opcao;

        do {
            System.out.println(ANSI_YELLOW + "\n1 - Introdução do jogo" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "2 - Regras do jogo" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "3 - Jogar" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "4 - Créditos" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "5 - Sair " + ANSI_RESET);
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(ANSI_GREEN + "---------------- Introdução Do Jogo ----------------" + ANSI_RESET);
                    System.out.println("\nEm 1939, a segunda guerra mundial foi declarada e envolveu "
                            + "\na maioria das nações no conflito mais sanguinolento da história, "
                            + "\nresultando na morte de milhões de pessoas. Os aliados estavam longe "
                            + "\nde ganharem a disputa e diversos países empenham-se em decifrar o "
                            + "\nEnigma, a máquina utilizada pelos alemães para se comunicarem, traçarem "
                            + "\nestratégias e combinarem ataques militares. Se o Enigma fosse decodificado, "
                            + "\nos passos do inimigo poderiam ser antecipados e os aliados ganhariam a guerra.\n");
                    break;
                case 2:
                    System.out.println(ANSI_GREEN + "---------------- Regras Do Jogo ----------------" + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "1" + ANSI_RESET + " Jogo baseado na materia de   conceitos de computação\n"
                            + ANSI_YELLOW + "\n2" + ANSI_RESET + " O jogador terá opção de dois personagens para escolher: \n"
                            + "* Joan ( tres vidas, pois terá um pré-desafio)\n"
                            + "* Alan (duas vidas)\n"
                            + ANSI_YELLOW + "\n3" + ANSI_RESET + " caso escolha Joan: MAPA 1\n"
                            + "* Só questões com cálculo, expressões\n"
                            + "* vai ter um pré-desafio antes para conseguir entrar na equipe do Alan\n"
                            + "* pode ser umas 2/3 questões\n"
                            + "* vai ter timer\n"
                            + "* caso acerte as questões, vai aparecer a frase ( PARABÉNS, VOCÊ\n"
                            + "CONSEGUIU VAI TRABALHAR PARA O GOVERNO, EM UMA MISSÃO\n"
                            + "SECRETA)\n"
                            + "* Usa as mesmas questões e regras de quem escolher Alan\n"
                            + ANSI_YELLOW + "\n4" + ANSI_RESET + " caso escolha Alan: CENÁRIO 2\n"
                            + ANSI_YELLOW + "\n5" + ANSI_RESET + " O usuário vai ter timer para resolver as questões\n"
                            + ANSI_YELLOW + "\n6" + ANSI_RESET + " Cada resposta correta vai gerar uma palavra\n"
                            + ANSI_YELLOW + "\n7" + ANSI_RESET + " No final o usuário vai ter que escrever uma frase com as palavras que as respostas\n"
                            + "corretas geraram\n"
                            + ANSI_YELLOW + "\n8" + ANSI_RESET + " O usuário só passa para a próxima fase se escrever a palavra correta da questão\n"
                            + "anterior… ( tipo uma palavra de acesso)\n"
                            + ANSI_YELLOW + "\n9" + ANSI_RESET + " ele vai ter duas tentativas para resposta , caso erre , o jogo acaba , ele não\n"
                            + "consegue ajudar nas decodificações:\n"
                            + "* Quando o jogador errar , não repete a questão, aparece outra\n"
                            + "* Frase ( FIM DE LINHA VOCÊ PERDEU A GUERRA)\n"
                            + ANSI_YELLOW + "\n10" + ANSI_RESET + " Se o timer acabar e ele não responder:\n"
                            + "* Frase ( KABUM, VOCÊ NÃO CONSEGUIU NO TEMPO CERTO!)\n"
                            + ANSI_YELLOW + "\n11" + ANSI_RESET + " Se o jogador conseguir a palavra acesso para a próxima fase:\n"
                            + "* Bom ter uma frase motivacional para cada fase\n"
                            + "* Quando ele escrever a palavra correta"
                            + "(PARABÉNS , VOCÊ ESTÁ PERTO DE SALVAR MILHARES DE VIDA!! )\n");

                    break;

                case 3:
                    System.out.println(ANSI_GREEN + "VAMOS COMEÇAR!!! \n" + ANSI_RESET);
                    EscolhaDePersonagem escolhaDePersonagem = new EscolhaDePersonagem();
                    escolhaDePersonagem.escolherPersonagem();

                    break;

                case 4:
                    System.out.println(ANSI_GREEN + "---------------- Creditos -----------------" + ANSI_RESET);
                    System.out.println("\nEste Jogo de RPG foi realizado para o compomente curricular "
                            + "\n(Projeto Integrador) do curso de Analise e Desenvolvimento De Sistema"
                            + "\n Muito Obrigado(a)! \n");
                    break;

            }
        } while (opcao != 5);
        System.out.println(ANSI_GREEN + " <---------------> O  J O G O  F O I  E N C E R R A D O <--------------->" + ANSI_RESET);
    }

}
