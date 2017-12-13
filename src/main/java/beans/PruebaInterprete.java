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
public class PruebaInterprete {

    public static void main(String[] args) {
        Traductor traductor = new Traductor();
        InterpreteEspanol ie = new InterpreteEspanol();
        InterpreteIngles ii = new InterpreteIngles();
        
        traductor.setInterprete(ie);
        traductor.setNombre("Cristopher Salgado");
        traductor.hablar();
        traductor.setInterprete(ii);
        traductor.hablar();
    }
}
