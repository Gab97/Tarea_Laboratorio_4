/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Convertir;

import AbstractFactory.Aritmetica.Aritmetica;
import Main.AbstractFactory;


/**
 *
 * @author soporte
 */
public class FactoryConvertir implements AbstractFactory {

    public Aritmetica getAritmetica(int x) {
        return null;
    }
    
    public Convertir getConvertir(int resul2){
        switch(resul2){
            case 1:
                return new Binario();
                
            case 2:
                return new Hexadecimal();
                
            case 3:
                return new Octal();
                
            case 4:
                return new Decimal();
        }
        return null;
    }
}
