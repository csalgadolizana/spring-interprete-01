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
public class Traductor {

    private Interprete interprete;
    private String nombre;

    public void hablar() {
        this.interprete.saludar();
        System.out.println(this.nombre);
        this.interprete.despedirse();
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
