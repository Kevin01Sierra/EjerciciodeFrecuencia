/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    int dado;
    Random r = new Random();
    
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = r.nextInt(dado)+1;
    }
  
}
