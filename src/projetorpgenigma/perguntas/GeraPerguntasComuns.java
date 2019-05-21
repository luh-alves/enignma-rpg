/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.perguntas;

/**
 *
 * @author Luciana Alves
 */
public class GeraPerguntasComuns {

    public static void main(String[] args) {
        System.out.println(" Alan Turing foi contratado para fazer parte da equipe e "
                + "decifrar os enigmas e algumas semanas antes de começar toda a "
                + "equipe começou receber as primeiras pistas da decifração da Enigma");

    }

    private static final String[][] perguntas;

    static {
        perguntas = new String[12][];
        String[] pergunta1 = new String[4];
        pergunta1[0] = " O primeiro ataque vai ser 1 0 1 1 1 base 2 para base 10 leste";
        pergunta1[1] = "Qual o valor correspondente? 27 ou 23?";
        pergunta1[2] = "23";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[0] = pergunta1;

        String[] pergunta2 = new String[4];
        pergunta1[0] = " No primeiro ataque vamos ter 1 1 1 base 2 para base 10 barcos";
        pergunta1[1] = "Qual é o valor correspondente? 10 ou 7?";
        pergunta1[2] = "7";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[1] = pergunta2;

        String[] pergunta3 = new String[4];
        pergunta1[0] = " Amanhã ás 1 3 7 base 8 para base 10 faremos um ataque";
        pergunta1[1] = "Qual o horáriro correspondente ao ataque? 9:50 ou 21:50?";
        pergunta1[2] = "9:50";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[2] = pergunta3;

        String[] pergunta4 = new String[4];
        pergunta1[0] = " Temos  3 7 base 8 para base 10 soldados infiltrados em territorios inimigos";
        pergunta1[1] = "37 soldados || 31 soldados?";
        pergunta1[2] = "31 soldados";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[3] = pergunta4;

        String[] pergunta5 = new String[4];
        pergunta1[0] = " Vamos atacar pela madrugada começando em 7A base 16 para base 10 sul da Polônia";
        pergunta1[1] = "122km sul da Polônia  || 129km sul da Polônia ?";
        pergunta1[2] = "122km sul da polonia";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[4] = pergunta5;

        String[] pergunta6 = new String[4];
        pergunta1[0] = " Ás A + B, (onde A = 1 e B = 1) e  A * B, (onde A = 0 e B = 0)"
                + "a união dos valores de S vai ser o horario que vamos atacar na Dinamarca";
        pergunta1[1] = "Ás 01:00 hora da manhã || Ás 10:00 horas da manhã?";
        pergunta1[2] = "Ás 10:00 horas da manhã";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[5] = pergunta6;

        String[] pergunta7 = new String[4];
        pergunta1[0] = " Ás A * B, (onde A = 0 e B = 1) e  A + B, (onde A = 0 e B = 1)"
                + "a união dos valores de S vai ser o horario que vamos atacar na Dinamarca";
        pergunta1[1] = "Ás 01:00 hora da manhã || Ás 10:00 horas da manhã?";
        pergunta1[2] = "Ás 01:00 horas da manhã";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[6] = pergunta7;

        String[] pergunta8 = new String[4];
        pergunta1[0] = "Ás 0 ,1 , 0 , em uma funação AND junto com 0 ,0 , 0 , em uma funação OR "
                + " Alan e os companheiros de equipes decidiram sair para"
                + "esfriar a cabeça, pois estava esgotando o prazo deles, foi "
                + "quando Alan ouviu uma frase -- Heil Hitle -- e percebe que"
                + "todos os enigmas tinha um padrão";
        pergunta1[1] = "Às 00:00 || Às 01:00";
        pergunta1[2] = "Às 00:00";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[7] = pergunta8;

        String[] pergunta9 = new String[4];
        pergunta1[0] = " Temos  3 7 base 8 para base 10 soldados infiltrados em territorios inimigos";
        pergunta1[1] = "37 soldados || 31 soldados?";
        pergunta1[2] = "31 soldados";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[8] = pergunta9;

        String[] pergunta10 = new String[4];
        pergunta1[0] = " Amanhã ás 1 3 7 base 8 para base 10 faremos um ataque";
        pergunta1[1] = "9:50 da noite OU 9:50 da manhã?";
        pergunta1[2] = "9:50 da manhã";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[9] = pergunta10;

        String[] pergunta11 = new String[4];
        pergunta1[0] = " Ás A + B, (onde A = 1 e B = 1) e  A * B, (onde A = 0 e B = 0)"
                + "a união dos valores de S vai ser o horario que vamos atacar na Dinamarca";
        pergunta1[1] = "Ás 01:00 hora da manhã || Ás 10:00 horas da manhã?";
        pergunta1[2] = "Ás 10:00 horas da manhã";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[10] = pergunta11;

        String[] pergunta12 = new String[4];
        pergunta1[0] = " O primeiro ataque vai ser 1 0 1 1 1 base 2 para base 10 leste";
        pergunta1[1] = "27 ou 23?";
        pergunta1[2] = "23";
        pergunta1[3] = "PARABENS , você conseguiu decodificar ,vamos enviar nossas tropas para impedir o ataque";
        perguntas[11] = pergunta12;

    }

    public static String[] geraPergunta() {
        // Sortear o indice
        int indice = GeraIndice.geraIndice(perguntas.length);
        return perguntas[indice];
    }

}
