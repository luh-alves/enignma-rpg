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
public class BemVindo {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void mostrarSaudacao() {
        Scanner entrada = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "---------------- Bem Vindo(a) ao ENIGMA!!! ----------------" + ANSI_RESET);
        System.out.println("O jogo Enigma foi criado pelos alunos: Luciana, Laleska e Jonathan"
                + "\ndo primeiro semestre da turma de Análise e desenvolvimento de sistemas - SENAC , "
                + "\no jogo tem base o filme O jogo da imitação! A seguir crie seu login e senha.\n");

    }

}
