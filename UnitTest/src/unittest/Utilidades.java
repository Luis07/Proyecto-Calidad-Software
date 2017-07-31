/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import com.oracle.jrockit.jfr.DataType;

/**
 *
 * @author Fifi_
 */
public class Utilidades {
   public int Division(int dividiendo, int divisor)
    {
        int resultado;
        if(divisor<=0){
        return 0;
        }
        resultado=dividiendo/divisor;
        return resultado;
    }
    public int ExtraerNumero(String cadena)
    {
        char[] numeros;
        int resul = 0;
        numeros= new char[10];
        numeros[0]='0';
        numeros[1]='1';
        numeros[2]='2';
        numeros[3]='3';
        numeros[4]='4';
        numeros[5]='5';
        numeros[6]='6';
        numeros[7]='7';
        numeros[8]='8';
        numeros[9]='9';
        for (int i = 0; i <cadena.length(); i++) {
            for (int j = 0; j < numeros.length; j++) {
            if(cadena.charAt(i)==numeros[j]){
         return resul= Integer.parseInt(String.valueOf(cadena.charAt(i)));      
            }
            }
        }
       return 404;
    }
}
