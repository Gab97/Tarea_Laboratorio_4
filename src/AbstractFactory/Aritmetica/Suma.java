/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Aritmetica;

/**
 *
 * @author soporte
 */
public class Suma implements Aritmetica{

    @Override
    public double resultado(double x, double y) {
        return x + y;
    }
    
}
