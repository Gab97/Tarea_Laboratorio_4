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
public class Octal implements Convertir{

    @Override
    public String Convertir(int resul2) {
        String octal = "";
        octal = Integer.toOctalString(resul2);
        return octal;
    } 
}
