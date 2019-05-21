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

    public static void mostrarOpcoes() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n----------------Menu do Jogo------------------- \n"
                + "Digite qual opção deseja \n");
        int opcao;

        do {
            System.out.println("1 - Introdução do jogo");
            System.out.println("2 - Regras do jogo");
            System.out.println("3 - Jogar");
            System.out.println("4 - Créditos");
            System.out.println("5 - Sair \n");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Em 1939, a segunda guerra mundial foi declarada e envolveu "
                            + "\na maioria das nações no conflito mais sanguinolento da história, "
                            + "\nresultando na morte de milhões de pessoas. Os aliados estavam longe "
                            + "\nde ganharem a disputa e diversos países empenham-se em decifrar o "
                            + "\nEnigma, a máquina utilizada pelos alemães para se comunicarem, traçarem "
                            + "\nestratégias e combinarem ataques militares. Se o Enigma fosse decodificado, "
                            + "\nos passos do inimigo poderiam ser antecipados e os aliados ganhariam a guerra");

                case 2:
                    System.out.println("Bem vindo ao ENIGMA"
                            + "\n 1.1 O jogador terá opção de dois personagens para escolher: \n"
                            + "* Joan ( tres vidas, pois terá um pré-desafio)\n"
                            + "* Alan (duas vidas)\n"
                            + "\n1.2. caso escolha Joan: CENÁRIO 1\n"
                            + "* Só questões com cálculo, expressões\n"
                            + "* vai ter um pré-desafio antes para conseguir entrar na equipe do Alan\n"
                            + "* pode ser umas 2/3 questões\n"
                            + "* vai ter timer\n"
                            + "* caso acerte as questões, vai aparecer a frase ( PARABÉNS, VOCÊ\n"
                            + "CONSEGUIU VAI TRABALHAR PARA O GOVERNO, EM UMA MISSÃO\n"
                            + "SECRETA)\n"
                            + "* Usa as mesmas questões e regras de quem escolher Alan\n"
                            + "\n1.3. caso escolha Alan: CENÁRIO 2\n"
                            + "\n1.4. O usuário vai ter timer para resolver as questões\n"
                            + "\n1.5. Cada resposta correta vai gerar uma palavra\n"
                            + "\n1.6. No final o usuário vai ter que escrever uma frase com as palavras que as respostas\n"
                            + "corretas geraram\n"
                            + "\n1.7. O usuário só passa para a próxima fase se escrever a palavra correta da questão\n"
                            + "anterior… ( tipo uma palavra de acesso)\n"
                            + "\n1.8. ele vai ter duas tentativas para resposta , caso erre , o jogo acaba , ele não\n"
                            + "consegue ajudar nas decodificações:\n"
                            + "* Quando o jogador errar , não repete a questão, aparece outra\n"
                            + "* Frase ( FIM DE LINHA VOCÊ PERDEU A GUERRA)\n"
                            + "\n1.9. Se o timer acabar e ele não responder:\n"
                            + "* Frase ( KABUM, VOCÊ NÃO CONSEGUIU NO TEMPO CERTO!)\n"
                            + "\n2.0. Se o jogador conseguir a palavra acesso para a próxima fase:\n"
                            + "* Bom ter uma frase motivacional para cada fase\n"
                            + "* (PARABÉNS , VOCÊ ESTÁ PERTO DE SALVAR MILHARES DE VIDA!! )\n"
                            + "quando ele escrever a palavra correta \n");
                    break;

                case 3:
                    System.out.println("Vamos Jogar! \n");
                    EscolhaDePersonagem escolhaDePersonagem = new EscolhaDePersonagem();
                    escolhaDePersonagem.escolherPersonagem();

                    break;

                case 4:
                    System.out.println("Jogo realizado para a aula de projeto integrador"
                            + "\n Muito obrigado \n");
                    break;

            }
        } while (opcao != 5);
        System.out.println("O jogo foi encerrado");
    }

}
