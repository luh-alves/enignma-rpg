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
public class Login {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public  void cadastrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Crie seu login: ");
        String login = entrada.next();
        System.out.print("Crie sua senha: ");
        int senha = entrada.nextInt();

        String loginCadastrado;
        int senhaCadastrado;

        do {
            System.out.println("Digite seu login: ");
            loginCadastrado = entrada.next();
            if (!(login.equals(loginCadastrado))) {
                System.out.println(ANSI_RED + "Login incorreto!" + ANSI_RESET);
            }
        } while (!(login.equals(loginCadastrado)));

        do {
            System.out.println("Digite sua senha: ");
            senhaCadastrado = entrada.nextInt();
            if (!(senhaCadastrado == senha)) {
                System.out.println(ANSI_RED + "Senha incorreta!" + ANSI_RESET);
            }
        } while (!(senhaCadastrado == senha));

        MenuInicial.mostrarOpcoes();

    }

}
