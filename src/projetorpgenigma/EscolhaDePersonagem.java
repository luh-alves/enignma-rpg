package projetorpgenigma;

import java.util.Scanner;
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

    public static void escolherPersonagem() {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("******Escolha o seu personagem******");
            System.out.println("Digite a opção desejada");
            System.out.println(" 1 - Joan");
            System.out.println(" 2 - Alan");
            System.out.println(" 3 - Voltar para o Menu Principal");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Joan foi a única mulher a trabalhar no projeto de decodificação"
                            + "\ndas máquinas Enigma ao lado de Turing. Estudou na Universidade de Cambridge"
                            + "\ne foi recrutada por um coordenador da instituição para entrar na Government"
                            + "\nCode and Cypher School (GCCS). Se dedicou à matemática, ganhou destaque acadêmico"
                            + "\nmas mesmo assim recebia menos do que seus colegas homens: 2 libras por semana."
                            + "\nDepois de passar alguns dias trabalhando isolada no projeto Enigma, finalmente "
                            + "\nganhou uma mesa ao lado de Turing e outros cientistas da época.");
                    
                    Joan.jogar();
                    
                    return;
                case 2:
                    System.out.println("Alan Turing, um matemático, de perfil extremamente introspectivo "
                            + "\ne analítico, assume o comando de uma equipe altamente especializada e mostra"
                            + "\nque com apoio, determinação e muito esforço, pode ser um líder e vencer um "
                            + "\ndesafio considerado impossível.");
                    return;

                default:
                    System.out.println("--- OPÇÃO INDISPONIVEL ---");

            }

        } while (opcao != 3);

    }

}
