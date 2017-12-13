/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author PC-Cristopher
 */
public class InterpreteEspanol implements Interprete {

    @Override
    public void saludar() {
        System.out.println("Hola, mi nombre es ...");
    }

    @Override
    public void despedirse() {
        System.out.println("Hasta pronto ...");
    }
}
