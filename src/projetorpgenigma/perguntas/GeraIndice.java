/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.perguntas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Luciana Alves
 */
public class GeraIndice {
    
    /**
     * metodo random gera indice para sorteio de indices das questões
     * ele guarda os indices sorteados em um array e compara
     * caso ja tenha sido sorteado um numero ele 'descarta' e sorteia outra vez
     * ele não aceita repetir
     * 
     */
    public static int geraIndice(int limite, ArrayList<Integer> indicesSorteado) {
        int indice;
        do {
            indice = new Random().nextInt(limite);
        } while (indicesSorteado.contains(indice));
        indicesSorteado.add(indice);
        return indice;

    }

}
