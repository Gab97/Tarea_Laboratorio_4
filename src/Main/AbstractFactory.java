/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AbstractFactory.Aritmetica.Aritmetica;
import AbstractFactory.Convertir.Convertir;

/**
 *
 * @author soporte
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(int dato);
    Convertir getConvertir(int dato);
}
