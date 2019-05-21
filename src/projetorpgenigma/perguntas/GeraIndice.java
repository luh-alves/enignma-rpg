/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpgenigma.perguntas;

import java.util.Random;

/**
 *
 * @author Luciana Alves
 */
public class GeraIndice {

    public static int geraIndice(int limite) {
        return new Random().nextInt(limite);
    }
}
