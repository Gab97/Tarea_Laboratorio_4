/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Convertir;

/**
 *
 * @author soporte
 */
public class Decimal implements Convertir{

    @Override
    public String Convertir(int resul2) {
       String Decimal = "";
       Decimal = Integer.toString(resul2);
       return Decimal;       
    }
}
