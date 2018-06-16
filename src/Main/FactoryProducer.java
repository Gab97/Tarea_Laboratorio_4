/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AbstractFactory.Aritmetica.FactoryAritmetica;
import AbstractFactory.Convertir.FactoryConvertir;

/**
 *
 * @author soporte
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int y){
        switch(y){
            case 1:
                return new FactoryAritmetica();
                
            case 2:
                return new FactoryConvertir();
        }
        return null;
    }
}
