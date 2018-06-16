/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Aritmetica;

import AbstractFactory.Convertir.Convertir;
import Main.AbstractFactory;

/**
 *
 * @author soporte
 */
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public Aritmetica getAritmetica(int dato) {
        switch(dato){
            case 1:
                return new Suma();
            case 2:
                return new Resta();
            case 3:
                return new Multiplicacion();
            case 4:
                return new Division();
        }
        return null;
    
    }

    @Override
    public Convertir getConvertir(int dato) {
        return null;
    }
}
