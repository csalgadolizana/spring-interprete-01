/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import beans.Traductor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PC-Cristopher
 */
public class PruebaInterpreteSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BeanFactory factory= new ClassPathXmlApplicationContext("applicationContext.xml");
//        BeanFactory factory = new ClassPathXmlApplicationContext("newSpringXMLConfig.xml.xml");

        Traductor t = (Traductor) factory.getBean("traductorEspanol");
        t.hablar();

        Traductor t1 = (Traductor) factory.getBean("traductorIngles");
        t1.hablar();
    }

}
